# Math Calculator

A robust test automation framework built in Java using Selenium WebDriver and TestNG. This framework is designed to test a demo web application that features a percent calculator. The framework ensures comprehensive functional testing and integrates modern automation best practices.

## Key Features

### 1. **Modular Design**
- The framework is structured into distinct layers:
  - **Test Scripts**: Contains the test cases for various functionalities.
  - **Utility Functions**: Reusable methods to support test execution.
  - **Test Data**: Externalized test data to ensure flexibility and reusability.

### 2. **Data-Driven Testing**
- Test cases are parameterized using:
  - Excel files
  - JSON files

### 3. **Cross-Browser Testing**
- Supports testing across multiple browsers:
  - Google Chrome
  - Mozilla Firefox
  - Microsoft Edge

### 4. **Reporting**
- Generates detailed HTML reports using TestNG.
- Includes logs for better traceability of test results.

### 5. **CI/CD Integration**
- Seamlessly integrates with GitHub Actions for automated test execution.
- Enables continuous feedback on code changes.

## Files in the Project

### 1. `PercentCalculator.java`
- Implements the logic for percent calculator in the demo web application.

### 2. `PercentCalculatorJunit.java`
- Contains JUnit test cases for validating the percentage.

### 3. `PercentCalculatorTestNG.java`
- Contains TestNG test cases to ensure broader testing functionality and supports advanced features like parallel execution.

## How to Run

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```bash
   cd test-automation-framework
   ```

3. Install dependencies and configure the environment as needed.

4. Run the TestNG test cases:
   ```bash
   mvn test
   ```

5. View the TestNG HTML report:
   - Reports are generated in the `test-output` folder.

## Project Structure
```
|-- RandomNumGen.java
|-- RandomNumJUnit.java
|-- RandomNumTestNG.java
|-- test-data/
|-- utilities/
|-- test-output/
```

## Technologies Used
- **Programming Language**: Java
- **Test Frameworks**: Selenium WebDriver, TestNG, JUnit
- **Build Tool**: Maven
- **Version Control**: GitHub

## Future Enhancements
- Add support for mobile browser testing.
- Enhance reporting with screenshots for failed test cases.
- Integrate with tools like Jenkins for advanced CI/CD pipelines.

## Contributing
Contributions are welcome! Please open issues or submit pull requests to suggest improvements or report bugs.
---

Happy Testing!

