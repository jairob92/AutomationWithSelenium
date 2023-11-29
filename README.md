# Selenium Java Web Automation Project (POM)

This web automation project, built with Selenium WebDriver and Java, follows the Page Object Model (POM) pattern. It serves as a practical exercise where I apply my basic automation knowledge. The project aims to automate repetitive tasks in a web application.

## Page Object Model (POM)
This project follows the Page Object Model (POM) to organize the user interface automation code. POM separates user interface actions from test logic, enhancing code modularity and maintenance.

- **Pages Package (src/test/java/pageObjects):** Contains classes representing specific pages of the web application. Each class defines UI elements and methods to interact with them.

- **Tests Package (src/test/java/testCases):** Holds test case classes that use page classes to perform actions on the web application.

- **Utilities (src/test/java/utilities):** Includes utility classes, such as the implementation of the ExtendReport, used to generate a detailed report of test results.

  [ExtendReport](https://extentreports.com/): Utilized for creating comprehensive and visually appealing test reports. It enhances the visibility of test execution results, making it easier to analyze and interpret the outcomes.

## Logging (config/log4j2.xml): 

Configuration file for Log4j2, a logging library. Log4j2 is used to record events and messages during the execution of the automation project, providing valuable insights into the execution flow and potential issues.Log results are available in the "logs" folder within the project directory.

## Conclusion

With this project, I take my initial steps to delve into automation with Java. It serves as a foundational exploration into automated QA, and I hope to evolve this project with more extensive tests and advanced topics in automated quality assurance in the future.

Feel free to explore and enhance the project as you deepen your understanding and skills in automated testing. Happy coding!







