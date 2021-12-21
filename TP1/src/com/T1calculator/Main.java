package com.T1calculator;

import java.util.Scanner;
/*
the above code import a package.
package are library which is a mechanism to encapsulate a group
of classes, sub packages and interfaces.
import java.util.* <<import all the package>>
java.util is the package and Scanner is the class hence
<< import java.util.Scanner >>

-- Built-in Packages are large number of classes which are part of
java API eg. java.lang, java.io, java.util etc

--User-defined packages

        // Name of the package must be same as the directory
        // under which this file is saved
        package myPackage;  /// this define a package... myPackage(package name);

        public class MyClass
        {
            public void getNames(String s)
            {
                System.out.println(s);
            }
        }

        Now we can use the MyClass class in our program
        import 'MyClass' class from 'names' myPackage
        import myPackage.MyClass;

        public class PrintName
        {
            public static void main(String args[])
            {
                // Initializing the String variable
                // with a value
                String name = "GeeksforGeeks";

                // Creating an instance of class MyClass in
                // the package.
                MyClass obj = new MyClass();

                obj.getNames(name);
            }
        }
*/

public class Main {

    public static void main(String[] args) {
	System.out.println("name pleas :");
    Scanner input  = new Scanner(System.in);
    String name = input.nextLine();
    System.out.println(name);
    }
}
