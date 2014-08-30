// def matcher(s1: String , s2: String): Unit = s1 match {
//	case `s2` => println("s1 and s2 are equal")
//	case _ => println("s1 and s2 are NOT equal")
//}

//matcher("Sam", "Kathy")

val s1 = "Sam"
val s2 = "Sam"
val result = if(s1.toUpperCase.contentEquals(s2)) "" else "NOT"
println(f"s1 and s2 are ${result} equal")