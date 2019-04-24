package Common_API;

/*
* 字符串的存储方式是 字符数组
* 两种赋值方式，直接赋值，对象赋值
* 推荐使用直接赋值，节约内存空间
*
* */

public class String_Demo {

    public static void main(String[] args) {
        /*
        * 推荐使用第一种
        * 第一种str指向内存中的常量池（共享变量），只创建一个对象
        * */
        String str1 = "测试";
        System.out.println(str1);
        /*
        * 第二种方法创建了两个对象，一个在常量池种，一个在内存中通过new关键字创建
        * */
        String string = new String("测试");
        System.out.println(string);
        /*
        * 自动前往常量池种寻找对象，节约内存空间
        * */
        String str2 = "测试";
        System.out.println(str2);

        System.out.println(str1 == string); //false，str1常量池，string在内存中
        System.out.println(str1 == str2); //true, str1和str2均指向常量池对象

        System.out.println("-------------------------------------------");

       /*
       * 四种情况分析：直接赋值字符串连接时
       * 如果在编译是确定已有对象，就使用已有对象，否则创建对象
       *
       * */

       String a = "a";
       String a1 = "a" + 1;
       String a2 = "a1";
       System.out.println(a1 == a2);

       final String b = "b";
       String b1 = "b" + 1;
       String b2 = "b1";
       System.out.println(b1 == b2);

       String c = getC();
       String c1 = "c" + 1;
       String c2 = "c1";
       System.out.println(c1 == c2);

       final String d = getD();
       String d1 = "d" +1;
       String d2 = "d2";
        System.out.println(d1 == d2);


    }

    private static String getC(){
        return "c";
    }

    private static String getD(){
        return "d";
    }

}
