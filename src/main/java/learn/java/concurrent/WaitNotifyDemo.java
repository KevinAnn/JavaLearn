package learn.java.concurrent;

import learn.java.base.BaseDemo;

public class WaitNotifyDemo extends BaseDemo {

    public static void main(String[] args) {
        WaitNotifyDemo demo = new WaitNotifyDemo();
        demo.waitDemo();
    }

    private void waitDemo() {
        Runnable runnable = () -> checked(() -> {
            synchronized (this) {
                System.out.println(this);
                ptInfo("start");
                ptInfo("wait");
                this.wait();
                ptInfo("continue");
            }
        });
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(this);
            }
        };

        Thread a = new Thread(runnable), b = new Thread(runnable);
        a.start();
        b.start();
        sleep(1000);
        runnable1.run();
        synchronized (runnable) {
            ptInfo("notify");
            System.out.println(runnable);
            System.out.println(runnable1);
            runnable.notify();
        }

    }

}
