package Container_Demo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Demo {
    public static void main(String[] args) {
        treeSet();
    }

    private static void treeSet(){
        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("World");
        set.add("Java");
        System.out.println(set);
    }

    private static void treeSet(Comparator comparator){
        Set<String> set = new TreeSet<>(comparator);

    }

}
