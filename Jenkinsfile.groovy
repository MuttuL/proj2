node {
   stage('Ant Check'){
      echo 'Im from jenkins from ant'     
   }
   stage('Preparation') { 
   git 'https://github.com/MuttuL/proj2.git'
    
   }
}
