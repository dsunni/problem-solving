# 1079
a = input().split()
for i in a:
    print(i)
    if i == 'q':
        break

# 1080
sum = 0
num = int(input())
for i in range(num):
    sum = sum + i
    if sum >= num:
        print(i)
        break

# 1081
n, m = map(int, input().split())
for i in range(n):
    for j in range(m):
        print(i+1, j+1)

# 1082
a = int(input(), 16)
for i in range(1, 16):
    print(('%X' % a) + '*' + ('%X' % i) + '=' + ('%X' % (a*i)))

# 1083
a = int(input())
for i in range(1, a+1):
    if i % 3 == 0:
        print('X', end=" ")
    else:
        print(i, end=" ")

# 1084
a, b, c = map(int, input().split())
cnt = 0
for i in range(a):
    for j in range(b):
        for k in range(c):
            print(i, j, k)
            cnt += 1
print(cnt)

# 1085
h, b, c, s = map(int, input().split())
print("%.1f MB" % (h * b * c * s / 8 / 1024 / 1024))

# 1086
w, h, b = map(int, input().split())
print("%.2f MB" % (w*h*b/8/1024/1024))

# 1087
a = int(input())
tot = 0
for i in range(1, a+1):
    tot = tot + i
    if tot >= a:
        break
print(tot)

# 1088
a = int(input())
for i in range(1, a+1):
    if i % 3 == 0:
        continue
    print(i, end=" ")

# 1089
a, d, n = map(int, input().split())
for i in range(n-1):
    a = a + d
print(a)

# 1090
a, r, n = map(int, input().split())
for i in range(n-1):
    a = a*r
print(a)

# 1091
a, m, d, n = map(int, input().split())
for i in range(n-1):
    a = a * m
    a = a + d
print(a)

# 1092
a, b, c = map(int, input().split())
day = 1
while day % a != 0 or day % b != 0 or day % c != 0:
    day += 1
print(day)

# 1093
num = int(input())
ranMap = map(int, input().split())

ranList = list(ranMap)
numArr = [0 for i in range(23)]

for i in range(num):
    numArr[ranList[i]-1] += 1

for i in range(len(numArr)):
    print(numArr[i], end=" ")

# 1093 - 2번째 풀이방법
a = int(input())
b = input().split()
arr = []

for i in range(24):
    arr.append(0)
for i in range(a):
    arr[int(b[i])] += 1
for i in range(1, 24):
    print(arr[i], end=" ")

# 1094
a = int(input())
b = input().split()
for i in reversed(b):
    print(i, end=" ")

# 1095
a = int(input())
b = input().split()
min = 10000
for i in range(a):
    if min >= int(b[i]):
        min = int(b[i])
print(min)

# 1096
pan = [[0 for i in range(19)] for i in range(19)]
num = int(input())

for i in range(num):
    a, b = map(int, input().split())
    pan[a-1][b-1] = 1

for i in pan:
    for j in i:
        print(j, end=" ")
    print()

# 1098
h, w = map(int, input().split())
pan = [[0 for i in range(w)]for i in range(h)]
n = int(input())

for i in range(n):
    l, d, x, y = map(int, input().split())
    for j in range(l):
        pan[x - 1][y - 1] = 1
        if d == 0:
            y += 1
        else:
            x += 1

for i in pan:
    for j in i:
        print(j, end=" ")
    print()

# 1099 Last Pang >ㅡ<
antMap = []
for i in range(10):
    antMap.append(list(map(int, input().split())))

x = 1
y = 1
while True:
    if antMap[x][y] == 0:
        antMap[x][y] = 9
    elif antMap[x][y] == 2:
        antMap[x][y] = 9
        break
    if (antMap[x][y+1] == 1 and antMap[x+1][y] == 1) or (x == 8 and y == 8):
        break
    if antMap[x][y+1] != 1:
        y += 1
    elif antMap[x+1][y] != 1:
        x += 1

for i in antMap:
    for j in i:
        print(j, end=" ")
    print()
