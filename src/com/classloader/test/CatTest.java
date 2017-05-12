package com.classloader.test;


public class CatTest
{
    public static void main(String[] args) throws Exception{  
        System.out.println("---------------Cat.class开始------------------");  
        System.out.println(Cat.class);//通过类.class获得Class对象  
        System.out.println("---------------Cat.class结束------------------");  

/*        System.out.println("---------------Class.forName开始------------------");  
        System.out.println(Class.forName("com.classloader.test.Cat"));//通过Class.forName(全路径)获得Class对象  
        System.out.println("---------------Class.forName结束------------------");  */
          
        System.out.println("---------------cat.getClass()开始------------------");  
        Cat cat = new Cat();  
        System.out.println(cat.getClass());//通过Class.forName(全路径)获得Class对象  
        System.out.println("---------------cat.getClass()结束------------------");  
    }  

}
