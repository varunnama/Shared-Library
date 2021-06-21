def getBuildProperties() {
      
      def buildParameter = [choice(choices:['UAT','STAGE'], description: 'Select Correct Environment for deployment',name:'Environment')]
              
      return buildParameter
}