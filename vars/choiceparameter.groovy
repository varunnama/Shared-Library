def getBuildProperties() {
      
      def buildParameter = [choice(choices:['UAT','STAGE'], description: 'Select Correct Environment for deployment',name:'Environment')]
      echo "Select Environment: ${buildParameter}"          
      return buildParameter
}