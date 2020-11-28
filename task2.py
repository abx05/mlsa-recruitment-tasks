#start of code

def sub():
    #first line input:
    n , k = input().split()
    n , k = [int(n), int(k)]

    #second line input:
    s = input()

    #third line input:
    lst=[]
    lst=[item for item in input().split()] #characters entered into a list
    lsts=list(s) #split string into a list of characters
    x=0
    c=0
    str=""
    lstc=[]
    while (x<= n-1):
        if lst.count(lsts[x])!=0:
            lstc.append(lsts[x])
            str+=lsts[x]
            y=0
            k=2
            while k <=len(str):
                while y+k<=len(str):
                    ss=str[y:y+k]
                    if lstc.count(ss)==0:
                        lstc.append(ss)
                    y+=1
                k+=1
                y=0
        else :
            str=""
        x+=1
    print(len(lstc))    
    
sub()

        