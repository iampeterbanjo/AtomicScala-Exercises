import com.atomicscala.AtomicTest._

// Exercise 1
class Family(args:String*) {
	def familySize(): Int = {
		args.length
	}
}

val family1 = new Family("Mom", "Dad", "Sally", "Dick")
family1.familySize() is 4
val family2 = new Family("Dad", "Mom", "Harry")
family2.familySize() is 3

// Exercise 2
class FlexibleFamily(parent1:String, parent2:String, kids:String*) {

	def familySize(): Int = {
		kids.length + 2
	}
}

val family3 = new FlexibleFamily("Mom", "Dad", "Sally", "Dick")
family3.familySize() is 4
val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
family4.familySize() is 3

// Exercise 3
val familyNoKids = new FlexibleFamily("Mom", "Dad")
familyNoKids.familySize() is 2

// Exercise 9
def squareThem(numbers:Int*): Int = {
	var sum = 0
	for(x <- numbers) {
		sum += x * x
	}
	sum
}

squareThem(2) is 4
squareThem(2, 4) is 20
squareThem(1, 2, 4) is 21