package Container_Demo;

import Model.Employee;
import Model.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Demo {
    public static void main(String[] args) {

        HashSet<Student> hashSet = new HashSet<>();
        Student s1 = new Student(001, "David", 20);
        Student s2 = new Student (002,"Hellen", 19);
        Student s3 = new Student(003,"Amy",19);
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
//        Student[] stud = new Student[10];
//        stud = hashSet.toArray(stud);
        Iterator<Student> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
