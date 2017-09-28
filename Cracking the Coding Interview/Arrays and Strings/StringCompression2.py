string1 = "abcdefghijklmmnopqrstuvwxyzzzzzzzzzaaaabbbbccc"
# string1 = "aabccd"
string2 = ""
counter = 1

for i in range(len(string1) - 1):
	if string1[i] == string1[i + 1]:
		counter = counter + 1
	elif string1[i] != string1[i + 1]:
		string2 = string2 + string1[i] + str(counter)
		counter = 1
if counter >= 1:
	string2 = string2 + string1[-1] + str(counter)
print (string2)