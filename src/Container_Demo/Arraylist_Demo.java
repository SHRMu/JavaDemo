package Container_Demo;

import Model.Employee;

import java.util.ArrayList;
import java.util.List;

public class Arraylist_Demo {
    public static void main(String[] args) {
        List list = new ArrayList();
        //可以添加不同类型的对象
        list.add(new Employee("Hellen",20));
        list.add("hello");

        int size = list.size();
        System.out.println(size);

        //加入泛型检查加入元素类型，方便后期统一处理
        List<Employee> ee = new ArrayList<>();
        ee.add(new Employee("Carl",30));

        Employee[] ees = new Employee[ee.size()];
        ees = ee.toArray(ees);
        System.out.println(ees[0]);

    }


}
