// Summary 2
// Exercise 1
val intsVector = Vector(1, 4, 5, 98)
val charsVector = Vector('k', 's', 'n', 'd', 'D', 'H')

println(s"intsVector min = ${ intsVector.sorted.min }")
println(s"charsVector min = ${ charsVector.sorted.min }")

val vectorsVector = Vector(intsVector, charsVector)
var allElements = ""

for(vect <- vectorsVector){
	for(x <- vect){
		allElements += x
	}
}

println(allElements)