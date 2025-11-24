
# Unit Testing Framework

This is a simple example of using TestNG to test a simple class contained in a JAR file with tests pre-conditions and post-conditions implemented with appropriate annotations.

## Technologies and tools
- **Language**: Java JDK 17
- **Automation Framework**:
  - Selenium WebDriver
  - WebDriverManager
- **Testing**: TestNG

## Requirements
- Write unit tests for Calculator-1.0.jar
- Write tests using any testing framework (JUnit or TestNG)
- Each class should test only one method of the library
- Tests pre-conditions and post-conditions should be implemented with appropriate annotations
- **For TestNG only**: create `.xml` configuration file and use it to run tests. Create at least one test group. Some tests can depend on this group, or this group can be used to exclude/include tests from launch using XML-suite;
- Create parametrized tests (data-driven approach);
- Configure and execute tests in parallel mode.
 
## Maven command line to run tests from scratch
- To install the Calculator.jar file (lets me use the Calculator dependency that I put in the pom.xml file):
- ```mvn install:install-file "-Dfile=libs\calculator.jar" "-DgroupId=com.epam.tat" "-DartifactId=calculator" "-Dversion=1.0" "-Dpackaging=jar"```
- To run the tests:
  `mvn "-DsuiteXmlFile=src/test/resources/testng.xml" clean test`

## Notes
- The tests fail because the cos method in the calculator.jar file has an error (it returns the sin value). So the tan method also fails.

