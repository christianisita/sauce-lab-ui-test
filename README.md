# About
This repository contains UI automation test script using sample web: https://saucedemo.com

# Precondition
- Ensure java is installed 
- Ensure maven is installed

# How To Run
1. Clone this repository to your local machine
2. From terminal cd to this project path on your local ex: ```cd sauce-lab-ui-test```
3. Run this command to install every dependency
   ```mvn clean install```

To run test suites, run using this command:

   For Positive Case Suites:
   ```mvn test -DsuiteXmlPath=src/test/java/com/example/positive-suite.xml```

   For Negative Case Suites:
   ```mvn test -DsuiteXmlPath=src/test/java/com/example/positive-suite.xml```
