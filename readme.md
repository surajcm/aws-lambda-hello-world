<h1 align="center">
    aws-lambda-hello-world
</h1>

A basic template for aws lambda.

##### Initial Setup
Set the environment variables:
M2_HOME, JAVA_HOME etc

##### Build command :
`mvn clean compile package`

##### To Run the application :
`mvn clean package shade:shade`

##### If you have a ~/.m2/settings.xml that points to your organization's maven repo, and wants to use the public maven repo
`mvn clean package shade:shade -s settings.xml`




