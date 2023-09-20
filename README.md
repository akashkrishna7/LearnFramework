# LearnFramework
A simple framework setup

# Web Testing Framework with Selenium, TestNG, and Maven

## Overview

This repository contains a web testing framework built using Selenium WebDriver, TestNG, and Maven. The framework is designed to facilitate automated testing of web applications. It includes a base class for setting up WebDriver, a sample test case.

## Features

- Integration of Selenium WebDriver for web automation.
- TestNG for test case management and execution.
- Maven for project build and dependency management.
- Environment configuration using property files.
- Easy-to-use base class for WebDriver setup and teardown.
- Sample test cases for reference.

## Project Structure

The project follows a standard Maven project structure:

- `src/test/java`: Contains test source code.
- `src/test/resources`: Stores resources such as TestNG XML configuration and property files.
- `src/test/java/config`: For environment classes
- `pom.xml`: Maven project configuration file.

## Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:

- Java Development Kit (JDK)
- Maven
- WebDriver (e.g., ChromeDriver)
- IDE (e.g., IntelliJ IDEA or Eclipse)
  

## Installation

### 1. Clone the repository:

  **HTTPS :** ```https://github.com/akashkrishna7/LearnFramework.git```
   
**SSH:** ```git@github.com:akashkrishna7/LearnFramework.git```
   
 **Github CLI:** ```gh repo clone akashkrishna7/LearnFramework```


### 2. Set up WebDriver:

  Download the appropriate WebDriver for your browser and system.
  Update the WebDriver path in the WebBase.java class if necessary.
  Open the project in your preferred IDE.
  
  Build the project using Maven:
  
  ```mvn clean install```

## Customization

Customize the WebBase.java class for specific WebDriver configurations.
Modify and expand the sample test cases in the web.test package.
  
