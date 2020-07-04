# Prerequisites
* JDK `8` or higher
* Gradle use `4.0.1`
* Appium `V1.8.1` or higher
* TestNG
* java-client, Version: `7.0.0`
* Allure `2.2.1` or higher


### How to run test and check the test report
1. After cloning the project, go to the directory `".\flutter-app-automation`
2. Build the automation project with gradle.
3. After step 2, run allure report with allure.
4. Check the report in generated allure report in its server

##### NB. 
If you want to share the allure report link to others, make sure that your PC is turned on and you and the shared user must be in same network

### Building with Gradle
```sh
$ gradle clean test
```
Downloaded files (including the Gradle distribution itself) will be stored in the Gradle user home directory (typically `user_home/.gradle`).

### Building report with Allure

```sh
$ gradle allureserve
```
For first time report generation with allure, Need to run in the following command:
```sh
$ gradle allurereport allureserve
```
