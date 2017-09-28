def permute(array):

	permList = []
	if len(array) == 1:
		permList.append(array[0])

	if len(array) == 2:
		permList.append(array[0])
		permList.append(array[1])
		permList.append(array[0], array[1])
		permList.append(array[1], array[0])

	
	return permList	

array = [0, 1, 2, 3, 4, 5, 6, 7, 8]
permute(array)