def bppc():
    print("Enter respective values")
    x,y,z =input().split() #list of values to be input with space after each and press enter when all three are final
    x , y, z = [float(x), float(y), float(z)]
    lite = "NO"
    if (y%x + z  >= x):
        lite ="YES"
    print (lite)
bppc()

