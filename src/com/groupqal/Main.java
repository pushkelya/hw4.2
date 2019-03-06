package com.groupqal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string --> ");
        String str = sc.nextLine();
        System.out.println("Unique Chars --> " + getUnique(str));
    }


    static String getUnique(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (temp.indexOf(ch) == -1) {
                temp = temp + ch;
            } else {
                temp.replace(String.valueOf(ch),"");
            }
        }

        return temp;

    }

}
