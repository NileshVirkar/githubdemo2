pipeline {
    agent any
    stages {
        stage('build') {
            script {
                
                def changeLogSets = currentBuild.changeSets
for (int i = 0; i < changeLogSets.size(); i++) {
  def entries = changeLogSets[i].items
  for (int j = 0; j < entries.length; j++) {
    def entry = entries[j]
    def files = new ArrayList(entry.affectedFiles)
    for (int k = 0; k < files.size(); k++) {
      def file = files[k]
      println file.path
    }
  }
}
                //sh 'mvn clean install'
                //sh '/var/jenkins_home/corona/scanboxwrapper/bin/gammascanner -c ./repository-configuration.json -u http://192.168.2.38:3001/ -t eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTYyNjg3Nzc5OTU4NywiaWF0IjoxNjI2ODc3Nzk5fQ.-o4yorCUTl2DkL-f0qOMTKcEO4L_FJ33xQE1DJkGjdhBpRtzNfO9OwMs-4QBvulqRB6UiNCvlqYh-aFMsRRWew -r 5e4384bcbe27ddacff695e49ffc66846'
                //sh '/var/jenkins_home/embold_RepoLevel_QualityGate_and_Rating_Check.sh http://192.168.2.38:3001 5e4384bcbe27ddacff695e49ffc66846 eyJhbGciOiJFUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTYyNjg3Nzc5OTU4NywiaWF0IjoxNjI2ODc3Nzk5fQ.-o4yorCUTl2DkL-f0qOMTKcEO4L_FJ33xQE1DJkGjdhBpRtzNfO9OwMs-4QBvulqRB6UiNCvlqYh-aFMsRRWew 5.0'
            }
        }
    }
}
