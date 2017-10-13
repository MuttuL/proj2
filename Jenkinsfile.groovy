node {
   def mvnHome
   stage('Preparation') { 
   // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/MuttuL/proj2.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
      mvnHome = tool 'M3'
   }
}
