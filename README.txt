To deploy this on CloudBees, follow those steps:

Create database:
	bees db:create -u DB_USER -p DB_PASSWORD DBNAME

Change in application.conf:
	# CloudBees MySQL Database
	db.url=jdbc:mysql://DB_HOST/DBNAME
	db.driver=com.mysql.jdbc.Driver
	db.user=DB_USER
	db.pass=DB_PASSWORD

Add playframework-plugin to your Jenkins plugins

Create a new software project in Jenkins, changing the following:
	- Add your repository where your code with the above modifications is.
	- In build, Add build step -> Play with:
		war -o ../tmp/APP_NAME --zip
	- Add build step -> Execute shell with:
		cp -f ../tmp/APP_NAME.war ./APP_NAME.war
		rm -r ../tmp
	- In post-build actions check "Archive the artifacts":
		APP_NAME.war
	- Also check "Deploy to CloudBees" with those parameters:
		CloudBees Site: USERNAME
		Application Id: USERNAME/APP_NAME
		Filename Pattern: APP_NAME.war
