# API Testing Project - QTrip

## Overview
This project focuses on **API testing** for the QTrip travel website. The goal of this project was to perform **manual and automated End-to-End testing** of the APIs associated with various modules of QTrip.

### Project Highlights:
- Conducted **manual API testing** using **Postman** for different web pages of QTrip.
- Automated API tests using the **Rest Assured Framework** in **Java**.
- Integrated the API tests with **UI Tests** to ensure a complete testing process.
- Designed a **TestNG project** to execute automated testing with the option to selectively run tests using an **XML file**.

## Scope of Work:
1. Analyzed the QTrip application and its **API Documentation**.
2. Designed API tests covering different **functional modules** of the QTrip application.
3. Executed **manual API tests** using **Postman**.

## Skills Used:
- **Test Case Design**
- **Test Data Enumeration**
- **API Testing**
- **Postman**
- **Rest Assured**
- **Java**
- **TestNG**

## Tools and Technologies:
- **Postman**: Used for manual API testing.
- **Rest Assured**: Java-based library for automating API tests.
- **TestNG**: Used for managing test execution and grouping tests.
- **Maven/Gradle**: (Depending on your project setup) For dependency management and running tests.
- **Java**: Programming language for writing automated tests.

## Project Structure:
1. **API Tests**: Test scripts designed to validate the API responses, status codes, and data returned from various endpoints of the QTrip application.
2. **TestNG Configurations**: Includes TestNG XML files for organizing and selectively running test suites.
3. **Manual Test Cases**: API tests executed manually using **Postman** are documented for reference and comparison against automated results.

## How to Run:
1. Clone the repository.
2. Import the project into your IDE (e.g., IntelliJ IDEA, Eclipse).
3. Ensure **Java**, **Rest Assured**, **TestNG**, and other dependencies are correctly set up.
4. Run the **TestNG** tests or manually test APIs via **Postman** collections.

### Running Automated API Tests:
```bash
mvn test
```
or
```bash
gradle test
```

## Manual Testing with Postman:
For manual testing, import the provided **Postman collection** into your Postman application and execute the API requests.

## Reporting:
After the test execution, the project generates detailed test reports that outline the status and results of the tests, providing insights into the success/failure of each API endpoint.
