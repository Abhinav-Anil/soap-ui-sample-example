# soap-ui-sample-example
How to deploy soap ui on amazon web service
Steps:
  1. Downlaod Spring Suite Tools 4
  2. Go to file -> Choose spring starter project
  3. Create your package and file name
  4.Copy ,paste and replace the pom.xml which has been given in your file and run maven build
  5.Copy and paste calcultor.wsdl file in /src/main/resources
  6. Copy and paste WebServiceConfig and CalcultorWebServiceImpl in your /src/main/java
  7. Now clean ,install ,update and bulid the maven
  8.Now your .jar file has been created  into your target file
  9. Run spring boot tools
  10.go to browser and write localhost:5000/services(chnage server.port=5000 in your application under /src/main/resources )
  11.Login to your aws and deploy the code
