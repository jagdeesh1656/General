def push(stack, score, totalScore):

	temp = stack[-1]
	if type(score) is int:
		stack.append([score, score + temp[1]])
	elif score == 'Z':
		stack = stack[:-1]
	elif score == 'X':
		stack.append([(temp[0] * 2), temp[1] + (temp[0] * 2)])
	elif score == '+':
		temp2 = stack[-2]
		stack.append([temp[0] + temp2[0], temp[1] + temp[0] + temp2[0]])
	return stack

stack = []
strikes = [5, -2, 4, 'Z', 'X', 9, '+', '+']
totalScore = 0
if strikes[0] == 'Z' or strikes[0] == 'X' strikes[0] == '+':
	stack.append([0, 0])
else:
	stack.append([strikes[0], strikes[0]])

strikes = strikes[1:]

for score in strikes:
	stack = push(stack, score, totalScore)

print (stack[-1][1])
