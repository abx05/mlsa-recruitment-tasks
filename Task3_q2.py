def f():
    a,b=input().split()
    a,b=[int(a),int(b)]
    lst=[]
    i=2
    x=0
    while i<int(a/2):
        if(a%i==0):
            
            lst.append(i)
        i+=1
       
    i=2    
    c=0
    while c<=len(lst)-1:
        if b%lst[c]!=0:
            x=lst[c]
        c+=1
        i+=1
    print(x)
f()