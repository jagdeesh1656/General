array = [1, 3]

sumi = sum (array)
maxSum = array[0]
for i in range(1, len(array)):
	if array[i] > maxSum:
		maxSum = array[i]
maxiSum = int((maxSum * (maxSum + 1)) / 2)
print (abs(maxiSum - sumi))
