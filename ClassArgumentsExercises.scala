import com.atomicscala.AtomicTest._

class Family(args:String*) {
	def familySize(): Int = {
		args.length
	}
}

val family1 = new Family("Mom", "Dad", "Sally", "Dick")
family1.familySize() is 4
val family2 = new Family("Dad", "Mom", "Harry")
family2.familySize() is 3