package MultiThread_Demo;

/*
* 通过调用Thread.sleep()方法，强制线程休眠，让出CPU执行权
* */

public class Thread_Sleep_Demo {
    public static void main(String[] args) {
        new SumThread().start();
        new Thread(new SumRunnable()).start();
    }

}

class SumThread extends Thread{
    @Override
    public void run() {
        for (int i = 0 ; i< 100; i++){
            System.out.println("当前线程为 " + Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SumRunnable implements Runnable{
    @Override
    public void run() {
        int sum = 0;
        for (int i =0; i < 100; i++){
            System.out.println("current Thread is "+ Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sum += i;
        }
    }
}
