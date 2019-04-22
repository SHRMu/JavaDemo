package Container_Demo;

import Model.Employee;

import java.util.Vector;

public class Vector_Demo {
    public static void main(String[] args) {
        Vector<Employee> vector = new Vector<>();
        vector.add(new Employee("Emma", 19));
        for (Employee e:
             vector) {
            System.out.println(e.toString());
        }


    }
}
