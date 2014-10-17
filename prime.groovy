int x = 2
int primetotal = 0
int c = 1
int primeindicator = 0
while (primetotal <= 1000) {

	while (c <= x) {
		if (x%c == 0) {
			primeindicator++
		}
		c++
	}
	if (primeindicator == 2) {
		println x
		primetotal++
	}
		x++
		c=1
		primeindicator = 0
	
}