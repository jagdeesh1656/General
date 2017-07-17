def func(atring, ip, allWordsDone):

	count = 0
	op_poss = []
	wc = 0
	for word in string.split(' '):
		print (ip, all(ip.values()))
		if all(ip.values()) == True:
			for w in ip.keys():
				ip[w] = False
			break
		if word in ip.keys() and allWordsDone == False and ip[word] == False:
			op_poss.append(count)
			ip[word] = True
		count = count + 1
	return op_poss

def getString(string, start, end):
	count = 0
	st = ""
	for word in string.split(' '):
		if start <= count and count <= end:
			st = st + word + " "
		count = count + 1
	return st

string = "this is a test this is a programming test this is a programming test in any language"
# string = "this is the best problem i have ever solved"
ip = {"this":False, "a":False, "test":False, "programming":False}
# ip = {"this":False, "is":False, "best":False}
count = 0
op_poss = []
allWordsDone = False
wc = 0
for word in string.split(' '):
	wc = wc + 1
mini = wc
op_s = ""

while (len(string.split(' ')) > len(ip)):

	op_poss = func(string, ip, allWordsDone)

	if len(op_poss) == len(ip):
		if abs((op_poss[len(op_poss) - 1] - op_poss[0]) + 1) < mini:
			mini = abs((op_poss[len(op_poss) - 1] - op_poss[0]) + 1)
			op_s = getString(string, op_poss[0], op_poss[-1])
	string = string[string.find(' ') + 1:]

if op_s is "":
	print ("No Sub-Segment found")
else:
	print (op_s)