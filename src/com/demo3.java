package com;

public class demo3 {
    public static void main(String[] args)
    {
        float for_sum=0;
        float j_sum=1;//阶乘的和
        for(int i=1;i<=20;i++)
        {
            j_sum=i*j_sum;
            for_sum=for_sum+(float)(1/j_sum);
        }
        System.out.println("用for求1+1/2!+1/3!+1/4!...的前20项之和："+for_sum);
        int n=1;
        float k_sum=1;//阶乘的和
        float do_sum=0;
        do
        {
            k_sum=k_sum*n;
            n++;
            do_sum=do_sum+(float)(1/k_sum);
        }while(n<=20);
        System.out.println("用do-while求1+1/2!+1/3!+1/4!...的前20项之和："+for_sum);
    }
}
