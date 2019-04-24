package Common_API;

/*
* 通过实现comparable接口定义比较规则
* */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Comparator_Demo {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,3,8,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String[] str = {"Ellen", "Ali", "Steven", "Hellen"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        System.out.println("--------------------------------------------------");

        Cat cat1 = new Cat("Mia", 2);
        Cat cat2 = new Cat("Haha", 10);
        Cat cat3 = new Cat("Mi", 4);
        Cat[] cats = {cat1,cat2,cat3};
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));

        System.out.println("--------------------------------------------------");

        Calendar calendar = new GregorianCalendar(2000, 12,1);
        Employee employee01 = new Employee("Danis", 50, calendar.getTime());
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2017,10,15);
        Employee employee02 = new Employee("Amy", 23, calendar1.getTime());
        Employee employee03 = new Employee("Erik", 30, new Date());
        Employee[] employees = {employee01, employee02, employee03};
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));
    }
}

class Cat implements Comparable{
    private String name ;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Object o) {

        Cat cat = (Cat)o;
        if (this.age < cat.age){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age;
    }
}

class Employee implements Comparable<Employee>{
    private String name ;
    private int age;
    private Date enterDate;

    public Employee(String name, int age, Date enterDate) {
        this.name = name;
        this.age = age;
        this.enterDate = enterDate;
    }

    @Override
    public int compareTo(Employee ee) {
        if (this.enterDate.before(ee.enterDate)){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        DateFormat dt = new SimpleDateFormat("ddMMyyyy");

        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", enterDate=" + dt.format(enterDate) +
                '}';
    }
}
