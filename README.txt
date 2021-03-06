To deploy this on CloudBees, follow those steps:

Create database:
	bees db:create -u DB_USER -p DB_PASSWORD DBNAME

Bind database as datasource:
	bees app:bind -db DBNAME -a MYAPP_ID -as PlayDB

Add playframework-plugin to your Jenkins plugins

Create a new software project in Jenkins, changing the following:
	- Add this git repository (or yours with this code) on Jenkins
	- In build, Add build step -> Execute shell with:
		rm -r jenkins
	- Add build step -> Play with:
		war -o ../tmp/APP_NAME --zip
	- Add build step -> Execute shell with:
		mkdir jenkins
		cp ../tmp/APP_NAME.war jenkins/APP_NAME.war
	- Also check "Deploy to CloudBees" with those parameters:
		CloudBees Site: USERNAME
		Application Id: USERNAME/APP_NAME
		Filename Pattern: jenkins/APP_NAME.war
