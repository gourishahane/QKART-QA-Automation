## QKart Automation Project

## Description
QKart is an e-commerce platform offering a seamless shopping experience with functionalities like user registration, login, product search, and cart management.This project focuses on automating the testing of QKart’s core functionalities using Selenium, Java, and the TestNG framework.
The project involved debugging failing test cases, enhancing script reliability, modularizing code for maintainability, and implementing data-driven testing.

## Key Features
- Automated end-to-end tests for user registration, login, product search, and cart functionalities.
- Debugged and fixed existing test case issues with the help of logs and breakpoints.
- Ensured synchronization using implicit and explicit waits.
- Enhanced code maintainability with modular methods and dynamic XPath locators.
- Migrated the tests to the TestNG framework, enabling grouping, prioritization, and parameterization of tests.
- Performed data-driven testing using Apache POI.

## Installation and Setup
1. Prerequisites
Java 11 or above
Maven or Gradle for dependency management
IDE (e.g., IntelliJ IDEA, Eclipse)
2. Clone the Repository
git clone https://github.com/username/QKart-Automation.git  
3. Install Dependencies
Ensure the pom.xml or build.gradle file contains the required dependencies for:
- Selenium
- TestNG
- Apache POI (for data-driven testing)
Run the following command to install dependencies:
mvn install  
4. Configure TestNG XML
Modify the testng.xml file to include the desired test cases and groups:
xml
Copy code
<suite name="QKart Tests">
  <test name="Sanity Tests">
    <classes>
      <class name="testcases.RegisterTest" />
      <class name="testcases.LoginTest" />
    </classes>
  </test>
</suite>  
5. Execute Tests
Run the tests using Maven:
  gradlew test
   
## Automated Test Cases
1. Automate the registration process for new users.
2. Validate the login functionality for registered users.
3. Automate the product search functionality.
4. Validate the addition, modification, and persistence of cart items.
5. Data-Driven Testing: Automate tests using data from external files.

## Enhancements and Features

1. Synchronization and Reliability
- Used explicit waits to handle dynamic elements and avoid synchronization issues.
- Implemented implicit waits for consistent element loading across test cases.
2. Improved Locators with XPath
- Replaced incorrect or fragile locators with dynamic XPath for more robust element identification.
3 Logging and Debugging
- Added detailed log statements for better traceability.
- Used IDE breakpoints to debug failing test cases.
4 TestNG Framework Features
- Grouping: Created sanity and regression groups for better test management.
- Prioritization: Assigned priorities to execute critical test cases first.
- Listeners: Captured screenshots for test events such as failures and success.

## Skills Utilized
- Automation Tools: Selenium, TestNG
- Programming: Java
- Test Design: Modular methods, data-driven approach
- Debugging: IDE tools, breakpoints, logs
- Dynamic Locators: XPath optimization
- Data Handling: Apache POI for Excel-based data-driven tests
  
## Contact Information
- Name: Gouri Shahane
- Email: gouri.shahane@gmail.com
- GitHub: github.com/gourishahane
- LinkedIn: linkedin.com/in/gourishahane
