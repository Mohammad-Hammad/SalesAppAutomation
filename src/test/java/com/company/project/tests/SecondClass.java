package com.company.project.tests;

public class SecondClass {
    public static void printButtonText() {
        FirstClass firstClass = new FirstClass();
        firstClass.theICCID(); // Call the method to set the value
        String a = firstClass.getICCID(); // Now this will return "123456789"
        System.out.println(a);
    }
    public static void main(String[] args){
        printButtonText();
    }
}