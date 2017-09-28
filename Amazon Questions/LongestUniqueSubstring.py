string = "seattleseehawkslpo"

maxSustringUntilHere = ""
maxSustring = ""

for i in range(len(string) - 1):
	if string[i] != string[i + 1]:
		maxSustringUntilHere = maxSustringUntilHere + string[i]
	else:
		maxSustring = max(maxSustring, maxSustringUntilHere + string[i])
		maxSustringUntilHere = ""

print (maxSustringUntilHere)
print (max(maxSustring, maxSustringUntilHere))
print (max("tlese", "ehawkslp"))