package com.company;
/*
Slide 16
Write a program in Java to find the first capital letter in a string using recursion

 */

public class ExerciseB {

    public static char firstUpperCase(String stringWord, int i) {
        //create an if statement to write the base case (when to stop), when char reach 0 character
        if (stringWord.charAt(i) == 0)
            return 0;

        //create another if statement to write the base case (when to stop), when the char uppercase of the
        //individual string character is an upper case letter
        if (Character.isUpperCase(stringWord.charAt(i)))
            //return that string character
            return stringWord.charAt(i);

        //return the method using the parameter and to find the character that has the upper case
        return firstUpperCase(stringWord, i + 1);
    }


    public static void main(String args[]) {

        String string = "2nd i Is Upper case";

        //
        char upperCaseNotGiven = firstUpperCase(string, 0);

        if (upperCaseNotGiven == 0)
            System.out.println("upperCaseNotGiven");

        else
            System.out.println(upperCaseNotGiven);
    }
}