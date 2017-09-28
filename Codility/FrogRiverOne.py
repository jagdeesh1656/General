# array = [1, 3, 2, 2, 5, 5, 5, 5, 1, 1, 2, 4]
array = [1, 3, 1, 4, 2, 3, 5, 4]
# array = [1, 2, 6, 3, 3, 4, 5, 4, 4, 4, 5]
finalDestination = 5
jumps = {}

for i in range(len(array)):
	if array[i] in range(1, finalDestination + 1) and array[i] not in jumps.keys():
		last_leaf = array[i]
		jumps[array[i]] = i
	if sum(range(1, finalDestination + 1)) == sum(jumps.keys()):
		break

if sum(range(1, finalDestination + 1)) == sum(jumps.keys()):
	print (jumps[last_leaf])
else:
	print (-1)
