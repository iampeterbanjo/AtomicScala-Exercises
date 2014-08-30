val distance = 3
val activity = "biking"

def willDo = {	
	println(f"running: ${ activity == "running" && distance <= 6 }")
	println(f"biking: ${ activity == "biking" && distance <= 20 }")
	println(f"swimming: ${ activity == "swimming" && distance <= 1 }")
}

willDo