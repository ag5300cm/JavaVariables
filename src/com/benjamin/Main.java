package com.benjamin;

public class Main {
    //The main method

    public static void main(String[] args) {
	// write your code here

        //Create a String variable ot store "MCTC"
        String college = "MCTC";
        //Print (or display in the console) the
        //data in the variable called college
        System.out.println(college);
        //Print a String literal plus our variable
        System.out.println("I am attending " + college);

        //Declare an integer variable to store a whole number, store 6
        int javaCredits = 6;
        System.out.println("Java is " + javaCredits + " credits");

        javaCredits = 7;
        javaCredits = 10000;
        System.out.println("Java is " + javaCredits + " credits");

        javaCredits = 6;
        System.out.println("Java is " + javaCredits + " credits");

        //Declare and initialize a double variable
        //double variables store floating-point numbers
        double textbookPrice = 21.61; //Slide 35 shows price 21.61, 36 shows 45.99
        System.out.println("The textbook cost $" + textbookPrice);

        //I'm a single line comment

        /* I'm a longer comment.
           It will take more than one line
           to explain this code.
         */

        /* Primitive types e.g. double, int, boolean
            Have lowercase names
            Only store data
            Simple, fast internal representation E.g. int a = 6;

           Object types e.g. String, ArrayList, types you define
            Have Uppercase names
            An object can potentially store more complex data,
            And can do things, can call methods on objects
         */

        String hello = "Hello";
        String upper = hello.toUpperCase();
        System.out.println(upper);

        //sout hit tab to get below, sout all lowercase
        System.out.println(); //print out an empty line

        String thisClass = "Java Programming";
        String classCode = "ITEC 2545-01";
        String characters = "@#!!#'#$()^*&%";
        String quote = "Java is to JavaScript as Car is to Carpet.";
        String aStringWithANewLine = "College = MCTC\nProgram = ITEC";
        String needEscapes = "Tab \t double quote \" in this String";
        String moreEscapes = "Backslash \\ and newline \n and double quote \" in this String";

        System.out.println(thisClass);
        System.out.println(classCode);
        System.out.println(characters);
        System.out.println(quote);
        System.out.println(aStringWithANewLine);
        System.out.println(needEscapes);
        System.out.println(moreEscapes);

        /* double: double-precision floating point numbers Java's default
            Stores numbers with decimal places e.g. 123.456
            If storing a number like 40, write as 40.0
            can store numbers larger then a float
         */

        double textbookPrice2 = 21.61;



    }
}
