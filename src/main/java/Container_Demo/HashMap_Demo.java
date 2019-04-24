package Container_Demo;

import java.util.*;

public class HashMap_Demo {
    public static void main(String[] args) {
        TestHashMap();
    }

    private static void TestHashMap(){
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(001, "Hello");
        hashMap.put(002,"World");
        hashMap.put(003, "Java");

        //遍历方法一
        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //遍历方法二
        Set<Integer> integerSet = hashMap.keySet();
        for (Integer i :
                integerSet) {
            System.out.println(i +" : " + hashMap.get(i));
        }

        Collection<String> values = hashMap.values();
        for (String str :
                values) {
            System.out.println(str);
        }

        //lamda表达是
        hashMap.forEach((key, value) -> System.out.println(key+""+value) );
    }
}
