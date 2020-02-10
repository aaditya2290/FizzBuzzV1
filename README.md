Fizz Buzz Kata

The Fizz Buzz Kata which has been implemented using Java and JUnit is a simple program which takes integer from 1 to 100 as input and 
returns "Fizz" if the number is divisible by 3, "Buzz" if the number is divisible by 5, "FizzBuzz" if the number is divisible by both 3
and 5 or the number itself for any other case.

Prerequisites:
1. Java - Version 1.6 or higher
2. JUnit - Version 4.12 (added as a dependency in pom.xml)
3. Maven - For dependency management
4. Eclipse or Spring Tool Suite or IntelliJ Idea or any other IDE which supports Java.

Methods to run test cases:

1. Using Eclipse
Download the project as a .zip file and unzip it to a folder.
In eclipse go to File - Import - Existing Maven Project - Next - Browse (to extracted folder) and click Finish.
Right click on project in project Explorer and click Run As - Maven Install.
Open FizzBuzzTest class and right click file and choose Run As -> JUnit Test.

2. Using Command prompt
Download project as zip file and unzip the same to a folder. 
Open a command prompt and goto the project(extracted) folder and execute below commands:
mvn clean
mvn install
After completion of above steps, test report will be available in below path
<PROJECT_ROOT_FOLDER>\target\surefire-reports\TEST-bnp.kata.fizzbuzz.FizzBuzzTest.xml

Methods to run application:

1. Using eclipse with main method
Right click on main method in FizzBuzz class and choose run as Java Application to display Fizz Buzz conversion for
number from 1 to 100.

2. Using Command Prompt
After successful maven build go to <ProjectDirectory>\target\classes and execute below command
java -classpath .\ bnp.kata.fizzbuzz.FizzBuzz

Author
G46362




