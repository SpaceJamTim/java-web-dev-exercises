package org.launchcode.java.demos.lsn1datatypes;
/* Packages help to encapsulate your code.
Encapsulation refers to the practice of shielding your code from outside influences.
 Without declaring a package, a Java class exists within the default package.
 In larger applications, leaving all classes in the default package risks naming conflicts and bugs

* */
import java.util.Scanner;
/* We could use the java.util.Scanner class without any problem and without any import statement,
provided that we always refer to it by its full name.
 “Available” classes include:

1)  All the classes you define in the .java and .class files in your current working directory.
2)  All the classes that get shipped with the software.
*/
public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner input;
/* Scanner objects make getting input from the user, a file, or even over the network relatively easy.*/
        input = new Scanner(System.in);
        /*We want our program to prompt the user to enter in a number in the command line.
        We do this by creating a Scanner instance using the word new and then calling the constructor and passing it the System.in object:*/
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close();

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}
