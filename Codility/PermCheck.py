array = [1000000, 1000000]
found = False

array = set(array)
if len(array) == 1:
	print (1)
	found = True
if len(array) == max(array):
	if (max(array) * (max(array) + 1)) / 2 == sum(array) and not found:
		print (1)
		found = True

if not found:
	print (0)