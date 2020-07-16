# 1053
a = int(input())
print(int(not a))

# 1054
a, b = map(int, input().split())
if a & b:
    print("1")
else:
    print("0")

# 1055
a, b = map(int, input().split())
if a | b:
    print("1")
else:
    print("0")

# 1056
a, b = map(int, input().split())
x = bool(a)
y = bool(b)
if (x and not y) or (not x and y) :
    print("1")
else:
    print("0")

print(a^b)

# 1057
a, b = map(int, input().split())
x = bool(a)
y = bool(b)
if (a & b) or (not a and not b):
    print("1")
else:
    print("0")

# 1058
a, b = map(int, input().split())
x = bool(a)
y = bool(b)
if (x is False) and (y is False):
    print("1")
else:
    print("0")

# 1059
a = int(input())
print(~a)

# 1060
a, b = map(int, input().split())
print (a&b)

# 1061
a, b = map(int, input().split())
print(a|b)

# 1062
a, b = map(int, input().split())
print(a^b)

# 1063
a, b = map(int, input().split())
if a > b:
    print(a)
else:
    print(b)

# 1064
a, b, c = map(int, input().split())
print(min(a, b, c))
min = a if (a<b) else b
min = b if (b<c) else c
print(min)

# 1065
a = map(int, input().split())
for i in a:
    if i % 2 == 0:
        print(i)

# 1066
a = map(int, input().split())
for i in a:
    if i % 2 == 0:
        print("even")
    else:
        print("odd")

# 1067
a = int(input())
if a > 0:
    print("plus")
else:
    print("minus")
if a % 2 == 0:
    print("even")
else:
    print("odd")

# 1068
a = int(input())
if a >= 90:
    print("A")
elif a >= 70:
    print("B")
elif a >= 40:
    print("C")
else:
    print("D")

# 1069
a = input()
if a == 'A':
    print("best!!!")
elif a == 'B':
    print("good!!")
elif a == 'C':
    print("run!")
elif a == 'D':
    print("slowly~")
else:
    print("what?")

# 1070
a = int(input())
if a == 12 or a == 1 or a == 2:
    print("winter")
elif a == 3 or a == 3 or a == 5:
    print("spring")
elif a == 6 or a == 7 or a == 8:
    print("summer")
else:
    print("fall")

# 1071
a = input().split()
for i in a:
    if i == '0':
        break
    else:
        print(i)

# 1072
num = int(input())
a = input().split()
for i in a:
    print(i)

# 1073
while True:
    a = int(input())
    if a == 0:
        break;
    else:
        print(a)

# 1074
a = int(input())
for i in range(a, 0, -1):
    print(i)

# 1075
a = int(input())
for i in range(a-1, -1, -1):
    print(i)

# 1076
a = input()
for i in range(int(ord('a')), int(ord(a))+1):
    print(chr(i), end=" ")

# 1077
a = int(input())
for i in range(a+1):
    print(i)

# 1078
a = int(input())
sum = 0
for i in range(a+1):
    if i % 2 == 0:
        sum += i
print(sum)