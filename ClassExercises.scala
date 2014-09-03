import com.atomicscala.AtomicTest._

println("\nExercise 1")
class Dimension(h:Int, w:Int) {
	var width = w
	var height = h
}

val c = new Dimension(5,7)
c.height is 5
c.height = 10
c.height is 10
c.width = 19
c.width is 19

println("\nExercise 2")
class Info(var name:String, var description: String)

val info = new Info("stuff", "Something")
info.name is "stuff"
info.description is "Something"
info.description = "Something else"
info.description is "Something else"

println("\nExercise 3")
info.name = "This is the new name"
info.name is "This is the new name"

println("\nExercise 4")
class SimpleTime(val hours: Int, val minutes: Int) {
	
	def subtract(simpleTime: SimpleTime): SimpleTime = {
		val skip = simpleTime.minutes > minutes || simpleTime.hours > hours
		val newHours = if (skip) { 0 } else { hours - simpleTime.hours	}
		val newMinutes = if (skip) { simpleTime.minutes } else {	minutes - simpleTime.minutes }
			
		new SimpleTime(newHours, newMinutes)
	}
}

val t1 = new SimpleTime(10, 30)
val t2 = new SimpleTime(9, 30)
val st = t1.subtract(t2)
st.hours is 1
st.minutes is 0
val st2 = new SimpleTime(10, 30).subtract(new SimpleTime(9, 45))
st2.hours is 0
st2.minutes is 45
val st3 = new SimpleTime(9, 30).subtract(new SimpleTime(10, 0))
st3.hours is 0
st3.minutes is 0

println("\nExercise 5")
class SimpleTimeDefault(val hours: Int, val minutes: Int = 0) {
	
	def totalTime(hrs: Int, mins: Int): Int = {
		hrs * 60 + mins
	}
	
	def subtract(simpleTime: SimpleTimeDefault): SimpleTimeDefault = {
		val newTime = totalTime(hours, minutes) - 
			totalTime(simpleTime.hours, simpleTime.minutes)
		
		new SimpleTimeDefault(newTime/60, newTime % 60)
	}
}

val anotherT1 = new SimpleTimeDefault(10, 30)
val anotherT2 = new SimpleTimeDefault(9)
val anotherST = anotherT1.subtract(anotherT2)
anotherST.hours is 1
anotherST.minutes is 30
val anotherST2 = new SimpleTimeDefault(10).subtract(new SimpleTimeDefault(9, 45))
anotherST2.hours is 0
anotherST2.minutes is 15