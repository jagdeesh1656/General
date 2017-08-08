x = 10
y = 85
d = 30

if x == y:
	jumps = 0
else:
	jumps =  round((y - x) / d, 0)
	if (d * int(jumps) >= (y - x)):
		print(int(jumps))
	else:
		print (int(jumps) + 1)
