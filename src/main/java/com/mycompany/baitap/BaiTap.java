package com.mycompany.baitap;

import java.util.Scanner;
public class BaiTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ,b;
        System.out.println("Nhap so thu nhat: ");
         a = sc.nextInt();
        System.out.println("Nhap so thu hai: ");
         b = sc.nextInt();
        int sum = a + b;          
        int sub = a - b;  
        int mult = a * b;     
        int div = a / b;     
        int mod = a % b;
        System.out.println("Sum: " + sum);
        System.out.println("Sum: " + sub);
        System.out.println("Sum: " + mult);
        System.out.println("Sum: " + div);
        System.out.println("Sum: " + mod);

    }
}
