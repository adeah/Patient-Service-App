# Patient-Service-App
A patient service application - Take Home Test


You must have the following installed on your computer
- Java jdk 1.8 or later
- IDE (Eclipse or IntelliJ)
- Chrome Browser

#Steps
- Open Eclipse
- Go to File > Import > Git > Projects from Git
- click Next
- Choose Clone URI
- Click Next
- Enter https://github.com/adeah/Patient-Service-App.git in the URI field
- Click Next, allow project to clone
- Click Next 
- Click Finish

When Project is done cloning, 
- right-click project, go to maven > update project
- Check force Update of snapshot/Releases
- Click okay

To Run Create Patient test,
- Make sure the app is running (if app is not running on localhost:3000, please insert the right url to the app in line 42 of createPatientTest.java
in the 'steps' package - you can find that in src/test/java. line 42: driver.get("your url or host"))
- Right-click testng.xml (usually the last file in the project)
- Run as TestNG Suite

You can view results, 
- refresh the project
- Go to the target folder > open the report.html in a browser
- or simple view results in the testng Results tab or stack trace


