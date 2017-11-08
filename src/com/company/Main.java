package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int j = 0,otvet = 0;
        char[] znak = new char[100];
        int[] a = new int[100];
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for (int i = 0; i<str.length();i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '=') {
                a[j] = nums(str.substring(0,i));
                znak[j] = str.charAt(i);
                j++;
                str = remove(str,i);
                i = 0;
            }
        }
        j = 0;
        otvet = a[0];
        for (int i = 1;i<99;i++) {
            if (znak[j] == '+') {
                otvet += a[i];
                j++;
            } else {
                if (znak[j] == '-') {
                    otvet -= a[i];
                    j++;
                }
            }
        }
        System.out.println(otvet);
    }
    public static int nums (String num) {
        int n = Integer.parseInt(num);
        return n;
    }
    public static String remove(String s, int pos) {
        return s.substring(pos+1,s.length());
    }
}