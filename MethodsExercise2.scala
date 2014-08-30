def getSquareDouble(x:Double):Double = x * x

val result = getSquareDouble(1.2)
val expect = 1.44
assert(result == expect, f"Expected $expect and got $result")
println(result)