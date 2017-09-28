array = [-1000000,1000000]
new_array = []
for i in range(len(array)):
	if array[i] > 0:
		new_array.append(array[i])

if len(new_array) == 0:
	print ("1")
else:
	mini = min(new_array)
	if mini != 1:
		print ("1")
	else:
		new_array.sort()
		found = False
		for i in range(len(new_array) - 1):
			if abs(new_array[i] - new_array[i+1]) > 1:
				print (int(new_array[i] + 1))
				found = True
				break
		if not found:
			print (max(new_array) + 1)