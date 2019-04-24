package Common_API;
/*
* 字符串的常用方法
* */

import java.util.Arrays;

public class String_Method_Demo {
    public static void main(String[] args) {
        String str = " dfadfqae  vn1243  ";
        System.out.println(str.charAt(str.length()-1));
        char[] chars = str.toCharArray(); // String >>>> char[]
        String string = new String(chars); // char[] >>>> String
        System.out.println(string);
        String stringOff = new String(chars,0,3);
        System.out.println(stringOff);

        byte[] bytes = str.getBytes();// String >>> byte[]
        String string01 = new String(bytes);
        String string02 = new String(Arrays.toString(bytes));

        System.out.println(string01);
        System.out.println(string02);

        System.out.println(str.replaceAll("\\d","*"));
        System.out.println(str.substring(2,4));
        System.out.println(str.split("1")[1]);

        System.out.println(str.contains("a"));
        System.out.println(str.indexOf("1"));
        System.out.println(str.compareTo("dfadfqaevn1243")); //0 means equal

        System.out.println(str.trim()); //去除收尾空格

        System.out.println(String.valueOf(1).getClass());
    }
}
