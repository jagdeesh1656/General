# Find unique in a list of integers in O(N) time and constant space

def rotate(array):
	array2 =[]
	te = array[len(array) - 1]
	for i in range(len(array) - 1, 0, -1):
		array[i] = array[i - 1]
	array[0] = te
	return array
# array = [9, 3, 3, 1, 9, 7, 1, 7, 0]
# array = [1, 2, 0, 0, 1, 1, 1]
array = [9, 4, 7, 9, 4, 1, 7, 9, 9]
end = len(array) - 1
counter = 0
res = array[0]
for i in range(1, len(array)):
	res = res ^ array[i]

print (res)