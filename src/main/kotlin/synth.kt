package synth
import javax.sound.sampled.*

fun main() {
    val rate = 44100f
    val audioFormat = AudioFormat(rate, 8, 1, true, false)
    val source = AudioSystem.getSourceDataLine(audioFormat)
    val tune = Tune(source, audioFormat, rate)
    repeat(2) {
        tune.play()
    }
}