package Reflection_Demo;

import Model.Student;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Package_Demo {

    @Test
    public void test01(){
        Student student = new Student();
        Class<? extends Student> aClass = student.getClass();
        //获取所在包信息
        Package aPackage = aClass.getPackage();
        System.out.println("package information : " + aPackage);

        //获取公共的方法 包括继承的Object方法
        Method[] methods = aClass.getMethods();
        for (Method m:
             methods) {
            //System.out.println(m);
            if (m.getName().contains("toString")){
                System.out.println("toString : ");
                try {
                    Constructor<? extends Student> constructor = aClass.getConstructor(int.class, String.class, int.class);
                    Student hund = constructor.newInstance(111, "Hund", 111);
                    Object invoke = m.invoke(hund);
                    System.out.println(invoke);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method m:
             declaredMethods) {
            if (m.getName().contains("readBook")){
                m.setAccessible(true);
                try {
                    m.invoke(aClass.newInstance());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
