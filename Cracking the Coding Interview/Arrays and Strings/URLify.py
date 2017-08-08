string1 = "Mr John Smith"
string2 = ""
count = 0
space = "%20"

for character in string1:
	if character == " ":
		string2 = string2 + space
	else:
		string2 = string2 + string1[count]
		
	count = count + 1

print (string2)

# You can even go through the entire string first and count the spaces and triple it to get the final string length
# then re-scan it from back, replacing characters
# no extra string here.