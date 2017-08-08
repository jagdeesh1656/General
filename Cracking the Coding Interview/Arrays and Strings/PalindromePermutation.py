string1 = "a"
length = len(string1)
dictionary = {}
count = 0

for character in string1:
	char = character.lower()
	if char not in dictionary.keys():
		dictionary[char] = 1
	else:
		dictionary[char] = dictionary[char] + 1

if length % 2 == 0:
	for key in dictionary.keys():
		if dictionary[key] == 2:
			count = count + 1
	if count == len(dictionary):
		print ("Permutation of a Palindrome")
else:
	for key in dictionary.keys():
		if dictionary[key] == 2:
			count = count + 1
	if count == len(dictionary) - 1:
		print ("Permutation of a Palindrome")