call mvn -B -s settings.xml -DskipTests=true clean install
call java -Dspring.profiles.active="datajpa,heroku" -DDATABASE_URL="postgres://sioeiafljaauoa:5387132c839b516e99ba086e761af2762d972a7f8632a0e7952df4036de15a40@ec2-54-246-84-100.eu-west-1.compute.amazonaws.com:5432/df25cip16hg7a4" -jar target/dependency/webapp-runner.jar target/*.war
:: call java -Dspring.profiles.active="datajpa,heroku" -DDATABASE_URL="postgres://user:password@localhost:5432/topjava" -jar target/dependency/webapp-runner.jar target/*.war
