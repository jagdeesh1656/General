row = 4
col = 4
n = 4

# rObstacle = 5
# cObstacle = 5
# rObstacle = 4
# cObstacle = 2
rObstacle = 0
cObstacle = 0

lstop = False
rstop = False
tstop = False
bstop = False
trstop = False
tlstop = False
blstop = False
brstop = False

count = 0
left = abs(col)
for i in range(left, 0, -1):
	if (row, i) != (row, col) and (row, i) != (rObstacle, cObstacle) and lstop is False:
		count = count + 1
	if (row, i) == (rObstacle, cObstacle):
		lstop = True
right = abs(col + 1)
for i in range(right, n + 1):
	if (row, i) != (row, col) and (row, i) != (rObstacle, cObstacle) and rstop is False:
		count = count + 1	
	if (row, i) == (rObstacle, cObstacle):
		rstop = True
top = abs(row)
for i in range(row, n + 1):
	if (i, col) != (row, col) and (i, col) != (rObstacle, cObstacle) and tstop is False:
		count = count + 1
	if (i, col) == (rObstacle, cObstacle):
		tstop = True
bottom = abs(1 - col)
for i in range(row, 0, -1):
	if (i, col) != (row, col) and (i, col) != (rObstacle, cObstacle) and bstop is False:
		count = count + 1
	if (i, col) == (rObstacle, cObstacle):
		bstop = True

t_r = []
row = row + 1
col = col + 1
while row <= n and col <= n:
	if (row, col) == (rObstacle, cObstacle):
		break
	row = row + 1
	col = col + 1
	count = count + 1
row = 4
col = 4

t_l = []
row = row - 1
col = col + 1
while row >= 1 and col <= n:
	# t_l .append([row, col])
	if (row, col) == (rObstacle, cObstacle):
		break
	row = row - 1
	col = col + 1
	count = count + 1
row = 4
col = 4

b_l = []
row = row - 1
col = col - 1
while row >= 1 and col >= 1:
	# b_l .append([row, col])
	if (row, col) == (rObstacle, cObstacle):
		break
	row = row - 1
	col = col - 1
	count = count + 1
row = 4
col = 4

b_r = []
row = row + 1
col = col - 1
while row <= n and col >= 1:
	# b_r .append([row, col])
	if (row, col) == (rObstacle, cObstacle):
		break
	row = row + 1
	col = col - 1
	count = count + 1
row = 4
col = 4

print (count)