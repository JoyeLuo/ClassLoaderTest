package com.classloader.test;


public class People
{
    public static void main(String[] args) throws Exception { 
    System.out.println( ".............ʹ�ò�ͬ��ʽ������..................." );

    System.out.println(People.class);

    People a = new People();

    System.out.println(a.getClass());

    System.out.println(Class.forName( "com.classloader.test.People" ));

    System.out.println("..............ʹ�ò�ͬ�ķ�ʽ��������...................");

    System.out.println(a);

    System.out.println(People.class.newInstance());

    System.out.println(a.getClass().newInstance()); 

    System.out.println(Class.forName("com.classloader.test.People").newInstance());
    }

}
