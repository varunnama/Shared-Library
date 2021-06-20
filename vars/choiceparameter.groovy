def getBuildProperties() {
       def buildParameter
      buildParameter= [parameters{choice(name:'Environment', choices:['UAT','STAGE'], description: 'Select Correct Environment for deployment')}]
                
      echo "Selected: ${params.Environment}"
       return buildParameter
}

/*def call(name){
echo "Hey ${name}, welcome !!!"
}*/