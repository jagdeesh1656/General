def solution(N):
    counter = 0
    orig = N
    count = []
    maxi = 0
    while N != 0:
        if N % 2 == 0:
            counter = counter + 1
        if N % 2 == 1:
            if maxi < counter:
                maxi = counter
            counter = 0
        N = int(N / 2)
    
    if (orig & (orig - 1)) == 0:
        return counter
    else:
        return maxi
    return 0

print (solution (1041))