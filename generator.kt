package synth
import kotlin.math.PI
import kotlin.math.*
import javax.sound.sampled.*

enum class NOTES(val PLAY: Float){
    C1(265.4f),
    D1(299.4f),
    E1(335.4f),
    F1(360.4f),
    G1(395.4f),
}

class SoundGen(val source: SourceDataLine, val audioFormat: AudioFormat, val rate: Float) {

    fun sample(length: Int, volume: Int, note: Float){
        val Note = note
        source.open(audioFormat)
        source.start()
        for (i in 0..length) {
            val n1 = (i.toFloat() / rate) * Note * 2f * PI
            val h1 = (sin(n1) * volume).toInt().toByte()
            val buf = byteArrayOf(h1)
            source.write(buf, 0, 1)
        }
        source.drain()
        source.stop()
        source.close()
    }
}