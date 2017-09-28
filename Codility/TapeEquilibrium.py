array = [1000, 1000]
maxSum = sum(array)
minimum = None
leftSum = 0

for i in range(1, len(array)):
	leftSum = leftSum + array[i - 1]
	print (leftSum, maxSum - leftSum)
	if minimum is None:
		minimum = abs((2 * leftSum) - maxSum)
	elif abs((2 * leftSum) - maxSum) < minimum:
		minimum = abs((2 * leftSum) - maxSum)

print (minimum)