# Given a String or a List of Strings, write an algorithm to check if there are any duplicate characters in the string.

input = ["amazon", "seattle", "houston", "amber", "tina", "abcdefghijklmnopqrstuvwxyz"]
for word in input:
	integer = 0
	for character in word:
		value = ord(character) - 97
		if (integer & (1 << value)) != 0:
			print ("Duplicate found in ", word, " ", character)
			break
		integer = (integer | (1 << value))


# Ask the interviewer if the string's character set is ASCII or Unicode
# ASCII has 128 characters
# If the string has more than 128 characters, then it surely has duplicates in it !!
# if (str.length() > 128)
#	return false