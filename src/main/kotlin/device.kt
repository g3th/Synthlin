package synth

import java.lang.IllegalArgumentException
import javax.sound.sampled.*

data class deviceAndSource(val device: Int, val source: SourceDataLine?)

class Devices(mixerInfo: Array<Mixer.Info>, audioFormat: AudioFormat) {

    var deviceCounter = 1
    var mInfo = mixerInfo
    var audioF = audioFormat
    var dev: Int? = null
    var sou: SourceDataLine? = null

    fun pickDevice(): deviceAndSource? {
        while (dev == null) {
            try {
                for (i in mInfo) {
                    println("$deviceCounter) ${i.name} | ${i.version} | ${i.vendor} | ${i.description} | ${i.version}")
                    deviceCounter++
                }
                print("\nChoose Device: ")
                dev = readln().toInt()
                sou = AudioSystem.getSourceDataLine(audioF, mInfo[dev!! - 1])
            } catch (e: IllegalArgumentException) {
                println("Format: ${e.toString().split("format")[1].trim()}")
                println("This Device is not suitable for current format's Audio Playback.")
            }
        }
        return deviceAndSource(device = dev!!, source = sou)
    }
}