from collections import OrderedDict

def printDictionaryToString(dictionary, string2):
	for key in dictionary.keys():
		string2 = string2 + key + str((dictionary[key][1] - dictionary[key][0]) + 1)
	print (string2)

string1 = "aaccccbfbbabbba"
string2 = ""
dictionary = OrderedDict()

for i in range(len(string1)):
	if string1[i] not in dictionary.keys():
		dictionary[string1[i]] = [i, i]
	else:
		if dictionary[string1[i]][1] + 1 != i:
			printDictionaryToString(dictionary, string2)
			dictionary = OrderedDict()
			dictionary[string1[i]] = [i, i]
		else:
			dictionary[string1[i]][1] = i
print (dictionary)