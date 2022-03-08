package com;

public class demo1 {
    public static void main(String[] args) {
        int year;
        System.out.println("1900-2000之间的所有闰年:");
        for(year=1900;year<=2000;year++){
            if ((year%4==0&&year%100!=0)||(year%400==0)){
                System.out.print(year+"-");
            }
        }

    }
}
