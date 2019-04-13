package MultiThread_Demo;

/*
* 线程实现的两种方法
* */
public class Thread_Create_Demo {

    public static void main(String[] args) {
        //thread main
        System.out.println("current thread name is :" + Thread.currentThread().getName());
        //thread 0
        MyThread mt = new MyThread();
        mt.start(); //线程启动调用start()而不是run() ！！！
        //thread 1
        MyRunnable mr = new MyRunnable();
        Thread thread = new Thread(mr); //要创建thread并把runnable放进去
        thread.start();
    }
}

/*
* 第一种方式
* */
class MyThread extends Thread{
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <10000; i++){
            sum += i;
        }
        System.out.println("currrent thread name is : " + Thread.currentThread().getName());
        System.out.println("sum result is : "+ sum);
    }
}

/*
* 第二种方法
* 推荐 ！！！
* */
class MyRunnable implements Runnable{
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <10000; i++){
            sum += i;
        }
        System.out.println("currrent thread name is : " + Thread.currentThread().getName());
        System.out.println("sum result is : "+ sum);
    }
}
