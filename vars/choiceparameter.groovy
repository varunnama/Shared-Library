def getBuildProperties() {
       def buildParameter
      [parameters{choice(name:'Environment', choices:['UAT','STAGE'], description: 'Select Correct Environment for deployment')}]
                
      buildParameter = params.Environment
       return buildParameter
}

/*def call(name){
echo "Hey ${name}, welcome !!!"
}*/