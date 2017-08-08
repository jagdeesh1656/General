def swap(i, j):
    temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
n = int(input())
arr = [int(temp) for temp in input().strip().split(' ')]
for i in range(n - 1):
    for j in range(i + 1, n):
        if arr[i] > arr[j]:
            swap(i, j)
            print (' '.join(map(str, arr)))