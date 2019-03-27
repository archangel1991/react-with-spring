#!groovy

def defaultRecipients = 'zoltan.sebok@dorsum.eu,jozsef.bohm@dorsum.eu,boglarka.marosi@dorsum.eu,daniel.kohajda@dorsum.eu,abigel.csabai@dorsum.eu,mark.farkas@dorsum.eu,gabor.boros@dorsum.eu,barbara.szasz@dorsum.eu,gergely.bartos@dorsum.eu'
def defaultSlave = "js-1"
def jobName = env.JOB_NAME
def mvnGoals = BRANCH_NAME == "master" ? "-U clean package jelastic:deploy" : "-U clean package"
def branch = BRANCH_NAME.startsWith("tpoc") ? "POC" : (BRANCH_NAME.startsWith("demo") ? "Demo" : "Dev")

script {
	env.REACT_APP_PROJECT_IDENTIFIER = branch 
	env.JOB_NAME = jobName + "_" + branch
	echo "Branch name: ${BRANCH_NAME}"
	echo "ProjectIdentifier: ${env.REACT_APP_PROJECT_IDENTIFIER}"
	echo "JobName: ${env.JOB_NAME}"
}
echo "recipients: ${defaultRecipients}"
lock(jobName) { 
	timestamps {
		
		checkoutGit1 {
			slave = defaultSlave
			recipients = defaultRecipients
		}

		buildMaven1 {
			slave = defaultSlave
			recipients = defaultRecipients
			
			jdkTool = "JDK 1.8"
			mavenTool = "Maven 3.3.3"
			nodejsTool = "NodeJS 8.11.3"

			goals = mvnGoals
			
		}

		notificationEmail1 {
			slave = defaultSlave
			recipients = defaultRecipients
		}
	}
}
script {
	env.JOB_NAME = jobName
	}