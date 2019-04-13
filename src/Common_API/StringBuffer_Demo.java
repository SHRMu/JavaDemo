package Common_API;

/*
* String类型不可变
* StringBuffer适合字符串连接，提升代码效率
* 同时 线程安全 效率低 适合多线程使用
* */
public class StringBuffer_Demo {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a + b + 3;

        StringBuffer sb = new StringBuffer("");
        sb.append(a).append(b).append(3);
        System.out.println(sb.toString());


    }
}
