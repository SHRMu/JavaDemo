package MultiThread_Demo;
/*
* 买票系统，多线程共享数据，需要保证线程安全
* 不能多线程同时修改数据
* 实现方法一：synchronized(){}同步代码块
*
* */

public class Thread_Syn_Demo {
    public static void main(String[] args) {
        SynchroRunnable sr = new SynchroRunnable();
        new Thread(sr).start();
        new Thread(sr).start();
    }
}

class SynchroRunnable implements Runnable{
    private int tickets = 10;
    //需要同步的对象
    private Object obj = new Object();
    @Override
    public void run() {
        while (tickets>1){
            //方法一
            synchronized (obj){
                tickets --;
                try {
                                Thread.sleep(200);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                System.out.println("剩余的票数为 " + tickets);
            }
        }

    }
}
