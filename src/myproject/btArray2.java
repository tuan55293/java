/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.util.Scanner;

/**
 *
 * @author MON
 */
public class btArray2 {
    public static void nhapmang(int[] a, int n){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap gia tri:");
        for(int i=0; i<n;i++){
            System.out.print("a[" + i + "]");
            a[i] = sc.nextInt();           
        }
    }
    public static void Max(int a[],int n){
        int max=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]==max){
                System.out.println("Max "+ max+" o vi tri "+ i);
            }
        }
    }
    public static void tanggt(int a[],int n){
        for(int i=0;i<n;i++){
            if(i % 2 != 0){
                a[i]= a[i] + 3;
            }
        }
    }
    public static void tong(int a[],int n){
        int tong = 0;
        for(int i=0;i<n;i++){
            tong += a[i];
        }
        System.out.println("tong cac gia tri mang la : "+ tong);
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("nhap so phan tu: ");
        n = sc.nextInt();
        int [] a= new int[n];
        nhapmang(a, n);
        Max(a, n);
        tanggt(a, n);
        tong(a, n);
    }
}
