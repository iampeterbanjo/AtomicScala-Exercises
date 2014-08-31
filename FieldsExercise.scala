import com.atomicscala.AtomicTest._

import com.atomicscala.AtomicTest._

class Cup2 {
	var percentFull = 0
	val max = 100
	
	def add(increase:Int):Int = {
		percentFull += increase
		if(percentFull > max) {
			percentFull = max
		}
		percentFull // Return this value
	}
}

// Exercise 2
class Cup3 {
	var percentFull = 0
	val max = 100
	val min = 0
	
	def add(increase:Int):Int = {
		percentFull += increase
		if(percentFull > max) {
			percentFull = max
		}
		if(percentFull < min) {
			percentFull = min
		}
		percentFull // Return this value
	}
}

val cup = new Cup2
cup.add(50) is 50
cup.add(70) is 100

val cup3 = new Cup3
cup3.add(45) is 45
cup3.add(-55) is 0
cup3.add(10) is 10
cup3.add(-9) is 1
cup3.add(-2) is 0

// Exercise 3
cup3.percentFull = 56
cup3.percentFull is 56

// Exercise 4
class Cup4 {
	var percentFull = 0
	val max = 100
	val min = 0
	
	def add(increase:Int):Int = {
		percentFull += increase
		if(percentFull > max) {
			percentFull = max
		}
		if(percentFull < min) {
			percentFull = min
		}
		percentFull // Return this value
	}
	
	def set(amount: Int) = percentFull = amount
	def get(): Int = percentFull
}

val cup4 = new Cup4
cup4.set(56)
cup4.get() is 56