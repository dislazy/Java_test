package com.bigonelab.test;

public class CreateVar {


int a= 0;

    public static void main(String[] args) {
        int a = 10;
        System.out.println(System.identityHashCode(a));
        test1(10);
    }

    // pubic 外部可访问 / private 外部不可访问/ protected  外部可以访问但受限
    private void test(){

    }

    protected void test1(){

    }
    //静态代码块 -- 相当于init
    {

    }

    private static void test1(int a){
        System.out.println(System.identityHashCode(a));
    }
}