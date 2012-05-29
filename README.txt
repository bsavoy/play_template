Change before use:

in application.conf:

	# CloudBees MySQL Database
	db.url=jdbc:mysql://DB_HOST/db_name
	db.driver=com.mysql.jdbc.Driver
	db.user=username
	db.pass=password

Do before use:

Create database:
	bees db:create -u DB_USER -p DB_PASSWORD DBNAME

Publish:
	play bees:app:deploy cloudbees-test --key <apikey> --secret <api secret> \
      --app-name <name of app in cloudbees>
      --app-domain <account name in cloudbees>