def hasFinalLetter (para1,para2):
   final=[]
   for i in para1:
      if i[-1] in para2:
         final.append(i)
   return final

#--------------------------------------------------------------------------

def isDivisible (maxint,tup):
    final=[]
    cnt=1
    for cnt in range(maxint+1):
        if cnt%tup[0]==0 and cnt%tup[1]==0:
            final.append(cnt)
    return final


