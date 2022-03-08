package com;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字的区间:");
        //100-999
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int a,b,c;
        System.out.println("水仙花数：");
        for (; i<j ; i++){
            a = i/100;
            b = i%100/10;
            c = i%10;
            if (a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }

    }
}
