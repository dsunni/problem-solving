# 1010
n = int(input())
print(n)

# 1011
n = input()
print(n)

# 1012
n = float(input())
print('%.6f' % n)

# 1013
a, b = input().split()
print(a, b)

# 1014
a,b = input().split()
print(b, a)

# 1015
a = float(input())
print('%.2f' % a)

# 1017
a = input()
print(a, a, a)

# 1018
a = input()
print(a)

# 1019
a, b, c = input().split('.')
print('%04d.' % int(a) + '%02d.' % int(b) + '%02d' % int(c))

# 1020
a = input()
print(a.replace('-', ''))

# 1023
a, b = input().split('.')
print(a)
print(b)

# 1024
a = input()
for i in list(a):
    print("'" + i + "'")

# 1025
a = input()
for i in range(0, len(a)):
    print('[' + a[i] + '0'*(len(a)-i-1) + ']')

# 1026
a, b, c = input().split(':')
print(int(b))

# 1027
a = input().split('.')
for i in reversed(a):
    print(i, sep="-")