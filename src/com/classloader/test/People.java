package com.classloader.test;


public class People
{
    public static void main(String[] args) throws Exception { 
    System.out.println( ".............使用不同方式加载类..................." );

    System.out.println(People.class);

    People a = new People();

    System.out.println(a.getClass());

    System.out.println(Class.forName( "com.classloader.test.People" ));

    System.out.println("..............使用不同的方式创建对象...................");

    System.out.println(a);

    System.out.println(People.class.newInstance());

    System.out.println(a.getClass().newInstance()); 

    System.out.println(Class.forName("com.classloader.test.People").newInstance());
    }

}
