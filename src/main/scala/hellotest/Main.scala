package hellotest

import mainargs.{main, arg, ParserForMethods, Flag}

object Main:

  // external entry point into Scala application
  def main(args: Array[String]): Unit = 
    ParserForMethods(this).runOrExit(args.toIndexedSeq)
    ()

  // internal main method with arguments annotated for parsing
  @main
  def run(
      @arg(short = 'c', doc = "size of the sliding word cloud") cloudSize: Int = 10,
      @arg(short = 'l', doc = "minimum word length to be considere") minLength: Int = 6,
      @arg(short = 'w', doc = "size of the sliding FIFO queue") windowSize: Int = 1000,
      @arg(short = 's', doc = "number of steps between word cloud updates") everyKSteps: Int = 10,
      @arg(short = 'f', doc = "minimum frequency for a word to be included in the cloud") minFrequency: Int = 3
   ): Unit =
    println("Hello mainargs!")
    println(s"Today's date is ${java.time.LocalDate.now}.")
    println()
    println("You provided the following command-line arguments:")
    println(s"cloudSize = $cloudSize")
    println(s"minLength = $minLength")
    println(s"windowSize = $windowSize")
    println(s"everyKSteps = $everyKSteps")
    println(s"minFrequency = $minFrequency")

end Main
