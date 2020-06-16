Project IMMJ Test 
 - 
**Tech used in the project are -**
- Java 8 
- Maven 
- TestNG and Junit
- Cucumber and Gherkin
- IDE used IntelliJ

IMMJ TEST
├── src
|     |__main
|     |  |__ java
|     |    |__ Immj
|     |      |__BasePage
|     |      |__BrowserSelector
|     |      |__Computers
|     |      |__LoadProp
|     |      |__Utils
|     |__test
|       |__java
|       |  |__ Immj
|       |    |__Hooks
|       |    |__RunTest
|       |    |__StepDefinitions
|       |__resources
|       |  |__BrowserDriver
|       |  |__Immj
|       |    |__Feature files
|       |  |__Screenshots
|       |__TestData
|         |__TestDataConfig.properties
├── pom.xml
│  
└── ReadMe.md


I have used the Page Object Model framework for setup of the project.
 
The **Resources folder** includes, The _feature file_ which has the test cases documented in Cucumber Gherkin format.

The **Test Data folder** includes the _Config file_ which has the Test Data stored in it - It can be used to add in more or make changes to the test data.

The **Screenshot folder** includes the screenshots captured when the test fails.

The **BrowserDriver folder** includes the _exe files_ required to run the automation on required browser - at the moment I have only included Chrome driver, Firefox Driver.

In **Hooks** ( located in Test section of the project ) - contains the methods to use before and after the tests.

The **Utils class** has the reusable methods that can be used where-ever required.

Being a **Maven** Project the dependencies will be imported automatically.

**The test can be run in 3 ways using the Runner Configurations
- Junit
- Cucumber Feature


**Improvements**
This is a very basic framework it is quite simple - and hence could be improved more.
- With a few more tweaks around the framework and to the pom file we could integrate allure reporting in the framework.
- We could also integrate Testng to the test and make use of its various annotations depending upon the complexity of the project.
- Integrate it with Jenkins for regression runs as well as integrate with Browserstack or Saucelabs for cross browser or device testing  
