package Reflection_Demo;

import Model.Student;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Newinstance_Demo {


    // getClass()获取类
    // newInstance()调用无参构造
    @Test
    public void test01(){
        Student student = new Student();
        Class<? extends Student> studentClass = student.getClass();
        try {
            //默认调用无参数构造方法
            Student newStudent = studentClass.newInstance();
            newStudent.setId(001);
            newStudent.setName("Erik");
            newStudent.setAge(22);
            System.out.println(newStudent.toString());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test02(){
        Class studClass = Student.class;
        //获取所有的构造器
        Constructor[] constructors = studClass.getConstructors();
        for (Constructor con:
             constructors) {
            System.out.println(con.getParameterCount());
            Class[] parameterTypes = con.getParameterTypes();
            //获取构造方法的对应参数类型
            for (Class param:
                 parameterTypes) {
                System.out.println(param);
            }
        }

        try {
            Constructor studClassConstructor = studClass.getConstructor(int.class, String.class, int.class);
            Object mary = studClassConstructor.newInstance(002, "Mary", 30);
            System.out.println(mary.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test03(){
        Class studClass = Student.class;
        //只能获取public属性
        Field[] fields = studClass.getFields();
        System.out.println("以下为获取的公有属性：");
        for (Field field:
             fields) {
            System.out.println(field);
        }

        //获取私有属性
        Field[] declaredFields = studClass.getDeclaredFields();
        System.out.println("以下为获取的私有属性：");
        for (Field field:
                declaredFields) {
            int modifiers = field.getModifiers(); //属性
            Class<?> type = field.getType(); //类型
            String name = field.getName(); //名称
            System.out.println(Modifier.toString(modifiers) +" "+type +" "+ name);
        }

    }


}
