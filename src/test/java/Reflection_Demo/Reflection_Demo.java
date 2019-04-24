package Reflection_Demo;


/*
* 反射: 通过对象获取类信息
* 方法一: 通过对象的getclass()方法
* 方法二: 类名.class
* 方法三: 通过Class类的forName方法
*
* 获取class类后可以实例化对象
* */

import Model.Student;
import org.junit.Test;

public class Reflection_Demo {
    // method 1
    @Test
    public void test01(){
        Student student = new Student();
        System.out.println(student.getClass());
    }

    //method 2
    @Test
    public void test02(){
        Class studClass = Student.class;
        System.out.println(studClass);
    }

    //method 3
    @Test
    public void test03(){
        try {
            Class<?> studClass = Class.forName("Model.Student");
            System.out.println(studClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
