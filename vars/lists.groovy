def listvalue(string applicationname) {

    echo "Function Input: ${applicationname}"
      
     def CHOICES = []
     
      CHOICES.add('A')
      CHOICES.add('B')
      CHOICES.add('C') 

     println CHOICES

 return CHOICES
}