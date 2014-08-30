val hour = 6

val isOpen = {
	val opens = 9.00
	val closes = 20.00
	println(f"Operating hours: ${opens} - ${closes}")
	
	if(hour >= opens && hour <= closes) {
		true
	} else {
		false
	}
}

println(isOpen)