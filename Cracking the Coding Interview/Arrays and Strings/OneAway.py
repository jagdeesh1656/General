def checkReplaceOrEqual(string1, string2):
	if len(string1) == len(string2):
		if string1 == string2:
			print ("equal")
			return True
		i = 0
		count = 0
		for character in string1:
			if character != string2[i]:
				count = count + 1
			i = i + 1
		if count == 1:
			print ("1 replace")
			return True

def checkInsertOrDelete(string1, string2):
	string2 = string2[::-1]
	j = len(string2) - 1
	count = 0

	for character in string1:
		if character != string2[j]:
			count = count + 1
			continue
		j = j - 1

	if count == 1:
		print ("1 insert/ delete")

string1 = "pale"
string2 = "ale"

if len(string1) == len(string2):
	checkReplaceOrEqual(string1, string2)
else:
	checkInsertOrDelete(string1, string2)