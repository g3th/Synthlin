# Synthlin
## A Kotlin Synth
## Synth using PCM Waveforms

Attempt to create a Kotlin synth using sound synthesis, and the javax.sound.sampled package. 

Just plays 'When the Saints' at the moment, but will eventually be expanded into a full-GUI/TUI so that sounds can be shaped.

Launch with:

```kotlinc synth.kt device.kt generator.kt whenTheSaints.kt -include-runtime -d synth.jar```

```java -jar synth.jar```

Or if using IntelliJ:

- Install JDK and Kotlin for your environment (i.e. scoop or apt)

- Mark 'Synthlin' directory as Source

- Pick your JDK Version

- Select your Kotlin Compiler Version

- mkdir/md a 'compiler-output' folder in the 'Synthlin' directory

- Choose 'compiler-output' as your compiler output folder (File -> Project -> Compiler Output)

