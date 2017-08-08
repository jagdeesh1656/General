string1 = "abcde"
string2 = "aebc"
dictionary = {}

if len(string2) == len(string1):

	for character in string2:
		if character not in dictionary.keys():
			dictionary[character] = 0

	for character in string1:
		if character not in dictionary.keys():
			print ("Not a permutation")
			break

# Instead of a dictionary, if we have used a int array of 128 the space complexity would be O(1)
