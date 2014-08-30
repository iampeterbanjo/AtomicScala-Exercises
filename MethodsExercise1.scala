def getSquare(x:Int):Int = {x * x}

val result = getSquare(5)
val expect = 25
assert(result == expect, f"Expected $expect and got $result")
println(result)