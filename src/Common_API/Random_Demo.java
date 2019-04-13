package Common_API;

import java.util.Random;

public class Random_Demo {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextDouble());
        System.out.println(random.nextInt(100));
    }
}
