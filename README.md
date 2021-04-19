## Micronaut 2.4.1 Documentation

- [User Guide](https://docs.micronaut.io/2.4.1/guide/index.html)
- [API Reference](https://docs.micronaut.io/2.4.1/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/2.4.1/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

## Setup
1. Install Java 11 -> https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
  - Once installed, follow the installation process if any.
2. Setup java 11 on your machine (put on top of system path)
  - Go to System Properties on your machine (windows)
  - Click Environment Variables...
  - Under System Variables look for Path, click Edit...
  - A new window should pop up, select New and add the location of the bin folder of Java 11
    - Mine looks like this: `C:\Program Files (x86)\Java\jdk-11\bin`
      - NOTE: It is very important that you have this path variable at the top so other java versions do not interfere!

3. Ensure that Java 11 is set
  - Open powershell or command prompt
  - Type `java --version`
    - you should see java 11 show up
4. Setup Gradle Project
  - Go to the project directory in your command shell or powershell window
  - Run `./gradlew build --refresh-dependencies`
  - Once finished, run `./gradlew clean build`
5. Run the API
  - Run `./gradlew run` in the project directory
