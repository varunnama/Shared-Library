def getBuildProperties() {
       def buildParameter
      buildParameter = [choice(choices:['UAT','STAGE'], description: 'Select Correct Environment for deployment',name:'Environment')]
                
     // buildParameter = params.Environment
       return buildParameter
}

/*def call(name){
echo "Hey ${name}, welcome !!!"
}*/