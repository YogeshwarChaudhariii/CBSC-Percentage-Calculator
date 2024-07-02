// CBSC Percentage Calculator

import java.util.Scanner;

public class CBSC {
    public static void main(String[] args) {
        
        float total = 0;

        System.out.println("CBSE Percentage Calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total marks of the subject (Eg. Max 100) : ");
        int total_marks = input.nextInt();
        System.out.println("Enter marks of subject 1");
        float sub1 = input.nextFloat();
        total = total + sub1;
        System.out.println("Enter marks of subject 2");
        float sub2 = input.nextFloat();
        total = total + sub2;
        System.out.println("Enter marks of subject 3");
        float sub3 = input.nextFloat();
        total = total + sub3;
        System.out.println("Enter marks of subject 4");
        float sub4 = input.nextFloat();
        total = total + sub4;
        System.out.println("Enter marks of subject 5");
        float sub5 = input.nextFloat();
        total = total + sub5;

        float grandTotal = total * 100 / (total_marks * 5);
        System.out.println("Your total Percentage are : " + grandTotal + "%");
    }
}

// sub is known as subject

