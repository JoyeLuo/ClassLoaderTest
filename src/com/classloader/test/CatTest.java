package com.classloader.test;


public class CatTest
{
    public static void main(String[] args) throws Exception{  
        System.out.println("---------------Cat.class��ʼ------------------");  
        System.out.println(Cat.class);//ͨ����.class���Class����  
        System.out.println("---------------Cat.class����------------------");  

/*        System.out.println("---------------Class.forName��ʼ------------------");  
        System.out.println(Class.forName("com.classloader.test.Cat"));//ͨ��Class.forName(ȫ·��)���Class����  
        System.out.println("---------------Class.forName����------------------");  */
          
        System.out.println("---------------cat.getClass()��ʼ------------------");  
        Cat cat = new Cat();  
        System.out.println(cat.getClass());//ͨ��Class.forName(ȫ·��)���Class����  
        System.out.println("---------------cat.getClass()����------------------");  
    }  

}
