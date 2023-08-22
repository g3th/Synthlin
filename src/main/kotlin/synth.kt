package synth
import javax.sound.sampled.*

fun main() {
    val rate = 44100f
    val audioFormat = AudioFormat(rate, 8, 1, true, false)
    val info = AudioSystem.getMixerInfo()
    val devices = Devices(info, audioFormat)
    val device = devices.pickDevice()
    val tune = Tune(device?.source, audioFormat, rate)
    repeat(2) {
        tune.play()
    }
}