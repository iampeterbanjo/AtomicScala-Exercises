import com.atomicscala.AtomicTest._

// Exercise 1

class ClothesWasher (modelName: String, capacity: Double) {
	
	def this(modelName: String) = {
		this(modelName, 100)
	}
	
	def this(capacity: Double) = {
		this("Dyson", capacity)
	}
}

// Exercise 2
class ClothesWasher2 (modelName: String = "Dyson", capacity: Double = 100)


// Exercise 4
class ClothesWasher3 (modelName: String, capacity: Double) {
	val result = ""
	
	def wash(): String = {
		"Simple wash"
	}
	def wash(bleach: Int, softener: Int): String = {
		s"Wash used $bleach bleach and $softener fabric softener"
	}
}

val washer = new ClothesWasher3("LG 100", 3.6)
washer.wash(2, 1) is "Wash used 2 bleach and 1 fabric softener"
washer.wash() is "Simple wash"