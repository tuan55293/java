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
public class btArray1 {
    public static void nhapmang(int[] a, int n){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap gia tri:");
        for(int i=0; i<n;i++){
            System.out.print("a[" + i + "]");
            a[i] = sc.nextInt();           
        }
    }
    public static void inmang(int[] a ,int n){
        System.out.print("phan tu trong mang : ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+ ",");
        }      
    }
    public static void trungbinhcong(int a[],int n){
        int tong = 0;
        float trungbinh;
        for(int i=0;i<n;i++){
            tong += a[i];
        }
        trungbinh = ((float)tong/n);
        System.out.println("trung binh cong cua mang la: "+ trungbinh);
    }
    public static void tongchan(int a[],int n){
        int tc = 0;
        for(int i=0;i<n;i++){
            if(a[i] % 2 == 0){
                tc = tc + a[i];
            }
        }
        System.out.println("Tong phan tu chan : "+tc);
    }
    public static void timkiem(int a[],int n){
         Scanner sc= new Scanner(System.in);
         int k;
         System.out.print("nhap phan tu muon tim: ");
         k = sc.nextInt();
         for(int i=0;i<n;i++){
             if(a[i]==k){
                 System.out.println("Tim thay "+k+" o vi tri "+i);
             }
         }
    }
    public static void sapxep(int[] a, int n){
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("Phan tu da sap xep: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+",");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("nhap so phan tu: ");
        n = sc.nextInt();
        int [] a= new int[n];
        nhapmang(a,n);
        inmang(a, n);
        trungbinhcong(a, n);
        tongchan(a, n);
        timkiem(a, n);
        sapxep(a, n);
    }
}
