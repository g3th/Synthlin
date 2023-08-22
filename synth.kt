package synth
import javax.sound.sampled.*

fun clearScreen(){
    ProcessBuilder("cmd", "/c", "cls").redirectOutput(ProcessBuilder.Redirect.INHERIT).start().waitFor()
}

fun main() {
    val rate = 44100f
    val audioFormat = AudioFormat(rate, 8, 1, true, false)
    clearScreen()
    println("\u001B[48;5;16m")
    val info = AudioSystem.getMixerInfo()
    val devices = Devices(info, audioFormat)
    val device = devices.pickDevice()
    val tune = Tune(device?.source, audioFormat, rate)
    clearScreen()
    println("Playing:")
    repeat(2) {
        tune.play()
    }
}