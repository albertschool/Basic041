package com.company;

import java.util.Scanner;

public class Main {

    public static void Q1() {
        Scanner input = new Scanner(System.in);
        String idNum, newID;
        for (int i=0; i<10; i++) {
            System.out.println("Enter old ID number:");
            idNum = input.next();
            if (idNum.substring(0,1).equals("5")) {
                newID = "44"+idNum.substring(1);
            } else {
                newID = idNum;
            }
            System.out.println("The new ID number is: "+newID);
        }
    }

    public static void Q2() {
        Scanner input = new Scanner(System.in);
        String str1, str2;
        int count = 0;
        for (int i=0; i<10; i++) {
            System.out.println("Enter 1st string:");
            str1 = input.next();
            System.out.println("Enter 2nd string:");
            str2 = input.next();
            if (str1.length() == str2.length()) {
                if (str1.charAt(0) == str2.charAt(0)) {
                    if (str1.charAt(str1.length()-1) == str2.charAt(str2.length()-1)) {
                        count++;
                    }
                }
            }
        }
        System.out.println("Number of similar strings: "+count);
    }

    public static void Q3() {
        Scanner input = new Scanner(System.in);
        String sentence;
        System.out.println("Enter the sentence:");
        sentence = input.nextLine();
        for (int i=sentence.length()-1; i>=0; i--) {
            System.out.println(sentence.substring(i,sentence.length()));
        }
        for (int i=1; i<=sentence.length(); i++) {
            System.out.println(sentence.substring(0,i));
        }
    }

    public static void Q4() {
        Scanner input = new Scanner(System.in);
        String sentence, backward ="";
        System.out.println("Enter the sentence:");
        sentence = input.nextLine();
        for (int i=sentence.length()-1; i>=0; i--) {
            backward += sentence.charAt(i);
        }
        System.out.println(backward);
    }

    public static void Q5() {
        Scanner input = new Scanner(System.in);
        String sentence, doubleSent ="";
        System.out.println("Enter the sentence:");
        sentence = input.nextLine();
        for (int i=0; i<sentence.length(); i++) {
            doubleSent += sentence.charAt(i);
            doubleSent += sentence.charAt(i);
        }
        System.out.println(doubleSent);
    }

    public static void Q6() {
        Scanner input = new Scanner(System.in);
        String sentence, spaceFree ="";
        System.out.println("Enter the sentence:");
        sentence = input.nextLine();
        for (int i=0; i<sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                spaceFree += sentence.charAt(i);
            }
        }
        System.out.println(spaceFree);
    }

    public static void Q7() {
        Scanner input = new Scanner(System.in);
        String sentence;
        char chr;
        int count = 0;
        System.out.println("Enter the sentence:");
        sentence = input.nextLine();
        System.out.println("Enter the char:");
        chr = input.next().charAt(0);
        for (int i=0; i<sentence.length(); i++) {
            if (sentence.charAt(i) == chr) {
                count++;
            }
        }
        System.out.println("Number of chars in sentence: "+count);
    }

    public static void main(String[] args) {
        Q1();
        Q2();
        Q3();
        Q4();
        Q5();
        Q6();
        Q7();
    }
}
