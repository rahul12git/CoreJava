package Recursion;

import java.util.Scanner;
// print the 5*5=25,5*5*5=125
public class CalculatePower {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int n=sc.nextInt();
        int xn= power(x,n);
            System.out.println(xn);
        }
    public static int power(int x,int n){
            if(n==0){
                return 1;
            }
            int xnm1= power(x,n-1);
            int xn=x * xnm1;
            return xn;
        }
    }



