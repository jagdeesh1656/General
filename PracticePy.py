from math import floor,sqrt, ceil

st = "haveaniceday"
s = 12
rows_max = floor(sqrt(s))
cols_max = ceil(sqrt(s))
rows = cols = 0

while rows_max <= cols_max:
	if (rows_max * cols_max) >= s:
		rows = rows_max
		cols = cols_max
		break
	else:
		rows_max = rows_max + 1

m = []
k=0
while k <= s:
	for i in range(rows):
		print (i)
		m[i] = st[k: min(k+cols,s)]
		k = k+cols