#1028
a = input()
print(a)

# 1029
a = float(input())
print('%.11f' % a)

# 1033
a = int(input())
print(format(a, 'x').upper())

# 1034
a = input()
print(int(a, 8))

# 1035
a = input()
n = int(a, 16)
print("{0:o}".format(n))
print(format(n, 'o'))

# 1036
a = input()
print(ord(a))

# 1037
a = int(input())
print(chr(a))

# 1038
a, b = input().split()
print(int(a) + int(b))

a, b = map(int, input().split())
print(a+b)

# 1040
a = int(input())
print(-a)

# 1041
a = input()
print(chr(ord(a)+1))

# 1042
a, b = map(int, input().split())
print(int(a/b))
print(a//b)

# 1042
a, b = map(int, input().split())
print(a % b)

# 1044
a = int(input())+1
print(a)

# 1045
a, b = map(int, input().split())
print(a+b)
print(a-b)
print(a*b)
print(a//b)
print(a % b)
print("%.2f" % (a / b))

# 1046
a, b, c = map(int, input().split())
print(a+b+c)
print("%.1f" % ((a+b+c)/3))

# 1047
a = int(input())
print(a << 1)

# 1048
a, b = map(int, input().split())
print(a << b)

# 1049
a, b = map(int, input().split())
if a > b:
    print("1")
else:
    print("0")

# 1050
a, b = map(int, input().split())
if a == b:
    print("1")
else:
    print("0")

# 1051
a, b = map(int, input().split())
if b >= a:
    print("1")
else:
    print("0")

# 1052
a, b = map(int, input().split())
if a != b:
    print("1")
else:
    print("0")
