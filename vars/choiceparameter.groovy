def getBuildProperties() {
       def buildParameter
      // buildParameter= [input message: 'Select Env for deploy', parameters: [choice(choices: ['UAT', 'STAGE'], description: 'Select correct env for deploy', name: 'Environment')]]
                
       buildParameter = 'a'
       return buildParameter
}