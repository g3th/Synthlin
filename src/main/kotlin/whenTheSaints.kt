package synth
import javax.sound.sampled.*

class Tune(source: SourceDataLine?, audioFormat: AudioFormat, rate: Float ) {
    
    val soundGen = SoundGen(source!!, audioFormat, rate)
    val volume = 30
    
    fun play() {
        soundGen.sample(10000, volume, NOTES.C1.PLAY)
        soundGen.sample(10000, volume, NOTES.E1.PLAY)
        soundGen.sample(10000, volume, NOTES.F1.PLAY)
        soundGen.sample(60000, volume, NOTES.G1.PLAY)
        soundGen.sample(10000, volume, NOTES.C1.PLAY)
        soundGen.sample(10000, volume, NOTES.E1.PLAY)
        soundGen.sample(10000, volume, NOTES.F1.PLAY)
        soundGen.sample(60000, volume, NOTES.G1.PLAY)
        soundGen.sample(10000, volume, NOTES.C1.PLAY)
        soundGen.sample(10000, volume, NOTES.E1.PLAY)
        soundGen.sample(10000, volume, NOTES.F1.PLAY)
        soundGen.sample(24000, volume, NOTES.G1.PLAY)
        soundGen.sample(24000, volume, NOTES.E1.PLAY)
        soundGen.sample(24000, volume, NOTES.C1.PLAY)
        soundGen.sample(24000, volume, NOTES.E1.PLAY)
        soundGen.sample(60000, volume, NOTES.D1.PLAY)
        soundGen.sample(10000, volume, NOTES.E1.PLAY)
        soundGen.sample(10000, volume, NOTES.E1.PLAY)
        soundGen.sample(10000, volume, NOTES.D1.PLAY)
        soundGen.sample(32000, volume, NOTES.C1.PLAY)
        soundGen.sample(10000, volume, NOTES.C1.PLAY)
        soundGen.sample(23000, volume, NOTES.E1.PLAY)
        soundGen.sample(23000, volume, NOTES.G1.PLAY)
        soundGen.sample(10000, volume, NOTES.G1.PLAY)
        soundGen.sample(52000, volume, NOTES.F1.PLAY)
        soundGen.sample(10000, volume, NOTES.C1.PLAY)
        soundGen.sample(10000, volume, NOTES.E1.PLAY)
        soundGen.sample(10000, volume, NOTES.F1.PLAY)
        soundGen.sample(24000, volume, NOTES.G1.PLAY)
        soundGen.sample(24000, volume, NOTES.E1.PLAY)
        soundGen.sample(24000, volume, NOTES.C1.PLAY)
        soundGen.sample(24000, volume, NOTES.D1.PLAY)
        soundGen.sample(60000, volume, NOTES.C1.PLAY)
    }
}