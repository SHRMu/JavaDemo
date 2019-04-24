package Container_Demo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList_Demo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(22);
        list.add(7);

        ListIterator<Integer> iterator = list.listIterator(list.size());

//        while (iterator.hasNext()){
//            System.out.println(iterator.nextIndex()+":"+iterator.next());
//        }

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
