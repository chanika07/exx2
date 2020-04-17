package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int sum =0;
    int sum1=0;
	while(true){
        int x = sc.nextInt();
        if (x<=0)break;
        int y = sc.nextInt();
        int z = sc.nextInt();

         if (z == 0){
            System.out.println(x*y);
             sum +=x*y;
        }
        else if (z==1){
            System.out.println((x*y)+10);
            sum +=(x*y)+10;
        }
    }System.out.println(sum);

    }
}
