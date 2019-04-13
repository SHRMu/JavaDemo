package Common_API;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date_Demo {
    public static void main(String[] args) {
        //已过时
        Date date = new Date();
        System.out.println(date);

        Calendar calendar1 = Calendar.getInstance();
        System.out.println(calendar1.getTime());//方法一
        System.out.println("year " + calendar1.get(Calendar.YEAR));
        System.out.println("month " + calendar1.get(Calendar.MONDAY));

        System.out.println("--------------------------------------------------");
        Calendar calendar = new GregorianCalendar();//方法二
        System.out.println(calendar.getTime());

        DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(dateFormat.format(date));

    }
}
