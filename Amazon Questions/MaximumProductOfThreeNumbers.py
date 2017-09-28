array = [-2, 6, -3, -1, 9, 0]

maxProductUntilHere = array[0]
maxProduct = array[0]

for i in range(1, len(array)):
	maxProductUntilHere = max(maxProductUntilHere, maxProductUntilHere * array[i])
	# print (maxPronductUntilHere)
	maxProduct = max(maxProduct, maxProductUntilHere)

print (maxProduct)