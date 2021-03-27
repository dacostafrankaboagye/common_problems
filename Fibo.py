## fibonacci
n = int (input("Enter the number of terms : "))

if n <= 0:
  print("False Value")
elif n == 1:
  print(1)
else:
  count, n1, n2 = 0, 1, 2
  while count < n:
    print(n1)
    nth = n1 + n2
    n1 = n2
    n2 = nth
    count += 1
    
