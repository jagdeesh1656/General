array = [0, 1, 2, 3, 4, 5]
turns = 6

if array is None:
	print (None)
else:
	turns = turns % len(array)
	if (turns == 0):
		print (array)
	else:
		while turns > 0:
			temp = array[len(array) - 1]
			index = len(array) - 1
			while (index >= 0):
				array[index] = array[index - 1]
				index = index - 1
			array[0] = temp

			turns = turns - 1
		print (array)