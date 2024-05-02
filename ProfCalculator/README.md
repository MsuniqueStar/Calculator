# Simple Calculator GUI in Java

## Dependencies

The GUI of the calculator is based on JavaFX. The newest version requires at least Java 17 to work properly. Below you can find instructions for setting up the project with Eclipse or via terminal. As practice for later tasks, we recommend the usage of Eclipse.

## Setup

### Eclipse

The project comes with a project specification for Eclipse (.project) and, thus, can be easily imported as follows:

- Open Eclipse.
- In the menu bar, click on `File` --> `Import`.
- In the dialog, select `General` --> `Existing Projects into Workspace`.
- In the next dialog, select this directory as the root directory. (Do _not_ select `Copy Projects into Workspace` as this will duplicate the Calculator directory.)
- After selecting the root directory, the project `ProfCalculator` should appear as a found project. Make sure it is selected.
- Click on Finish.
- On the left side, Eclipse should show the project in the project explorer now.
- To install the necessary project dependencies, right click on `pom.xml` --> `Maven` --> `Update Project` --> complete the dialog.
- To run the project, right click on `pom.xml` --> `Run as` --> `Maven Build` --> specify goal as "compile exec:java" --> Click `Run`.

### Command Line

#### How to build

`mvn clean compile`

The command generates target .class files. This will also install missing dependencies.

#### How to run

`mvn clean compile exec:java`

The command will compile and run the exec.mainClass target which is specified in the pom.xml.

## Your Changes

### I added the following feature to the calculator

Name:

Short Description:

### I removed the following feature from the calculator

Name:

Short Description:

