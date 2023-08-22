package synth

import java.lang.IllegalArgumentException
import javax.sound.sampled.*
import kotlin.system.exitProcess

data class deviceAndSource(val device: Int, val source: SourceDataLine?)

class Devices(mixerInfo: Array<Mixer.Info>, audioFormat: AudioFormat) {

    var mInfo = mixerInfo
    var audioF = audioFormat
    var dev: Int? = null
    var sou: SourceDataLine? = null

    fun pickDevice(): deviceAndSource? {
        while (dev == null) {
            clearScreen()
            var deviceCounter = 1
            try {
                for (i in mInfo) {
                    println("\u001B[48;5;16m\u001B[38;5;231m$deviceCounter) \u001B[38;5;34m${i.name} | \u001B[38;5;89m${i.version} " +
                            "| \u001B[38;5;40m${i.vendor} | \u001B[38;5;172m${i.description} | \u001B[38;5;160m${i.version}\n\u001B[38;5;231m")
                    deviceCounter++
                }
                print("\nChoose Device or quit: ")
                try {
                    val input = readln()
                    if (input == "quit") {
                        println("Goodbye.")
                        exitProcess(0)
                    } else {
                        dev = input.toInt()
                    }
                } catch (e: NumberFormatException){
                    println("Not a number")
                    println("Press enter.")
                    readln()
                }
                if (dev != null) {
                    sou = AudioSystem.getSourceDataLine(audioF, mInfo[dev!! - 1])
                }
            } catch (e: IllegalArgumentException) {
                println("Format: ${e.toString().split("format")[1].trim()}")
                println("This Device is not suitable for current format's Audio Playback.")
                println("Press enter.")
                readln()
                dev = null
            }
        }
        return deviceAndSource(device = dev!!, source = sou)
    }
}