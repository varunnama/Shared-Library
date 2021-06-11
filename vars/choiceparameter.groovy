def getBuildProperties() {
       def buildParameter
       buildParameter= [choice(choices:['Build Only','Dev','Test'], description: 'Select Correct UCD environment', name: 'Environment')]
       
       return buildParameter
}