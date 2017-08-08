listoflists = [[1,2], [3, 4], [4, 5], [5, 6]]
d = {}
s = [[]]
for items in listoflists:
	if items[0] in d.keys():
		temp = []
		if items[1] not in d.keys():
			d[items[1]] = [[]]
		else:
			temp = d[items[1]]
		for li in d[items[0]]:
			li.append(items[1])
			temp.append(li)
	else:
		temp2 = []
		temp2.append(items[0])
		temp2.append(items[1])
		s.append(temp2)

		if items[0] not in d.keys():
			d[items[0]] = [temp2]
		else:
			d[items[0]].append(temp2)

		if items[1] not in d.keys():
			d[items[1]] = [temp2]
		else:
			d[items[1]].append(temp2)

print (d)