class Sailboat {
	def raise(): String = { "Sails raised" }
	def lower(): String = { "Sails lowered" }
	
	val flare = new Flare
	def signal(): String = { flare.light() }
}

class Motorboat {
	def on(): String = { "Motor on" }
	def off(): String = { "Motor off" }
	
	val flare = new Flare
	def signal(): String = { flare.light() }
}

class Flare {
	def light(): String = { "Flare used!" }
}

// In each of the Sailboat and Motorboat classes, add a method signal
// that creates a Flare object and calls the light method on the Flare. 
// Satisfy the following:
val sailboat = new Sailboat
val sailboatSignal = sailboat.signal()
println(s"sailboat $sailboatSignal")

assert(sailboatSignal == "Flare used!", s"Expected - Flare used! Got $sailboatSignal" )

val motorboat = new Motorboat
val motorboatSignal = motorboat.signal()
println(s"motorboat $motorboatSignal")

assert (motorboatSignal == "Flare used!", s"Expected - Flare used! Got $motorboatSignal")