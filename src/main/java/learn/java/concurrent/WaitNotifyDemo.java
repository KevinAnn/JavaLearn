package learn.java.concurrent;

import com.google.common.collect.Lists;
import learn.java.base.BaseDemo;

import java.util.List;

public class WaitNotifyDemo extends BaseDemo {

    public static void main(String[] args) {
        new WaitNotifyDemo().waitAndNotifyDemo();
    }

    /**
     * wait必须在synchronized中使用
     *
     * 注意lambda表达式会创建一个全新的接口对象，和匿名内部类并不完全相同
     */
    private void waitDemo() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    System.out.println(this);
                    ptInfo("start");
                    ptInfo("wait");
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ptInfo("continue");
                }
            }
        };
//        Runnable runnable = () -> {
//            synchronized (this) {
//                System.out.println(this);
//                ptInfo("start");
//                ptInfo("wait");
//                try {
//                    this.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                ptInfo("continue");
//            }
//        };

        Thread a = new Thread(runnable), b = new Thread(runnable);
        a.start();
        b.start();
        sleep(1000);
        synchronized (runnable) {
            ptInfo("notify");
            System.out.println(runnable);
            runnable.notifyAll();
        }

    }

    /**
     * 实现交替打印两个list中的内容
     */
    private void waitAndNotifyDemo() {
        List<Integer> list1 = Lists.newArrayList(1, 2, 3, 4, 5);
        List<Integer> list2 = Lists.newArrayList(100, 200, 300, 400, 500);

        final Object lock = new Object();

        Thread t1 = new Thread(() -> checked(() -> {
            synchronized (lock) {
                for (Object o : list1) {
                    ptInfo(o);
                    lock.notify();
                    lock.wait();
                }
            }
        }));

        Thread t2 = new Thread(() -> checked(() -> {
            synchronized (lock) {
                for (Object o : list2) {
                    ptInfo(o);
                    lock.notify();
                    lock.wait();
                }
            }
        }));

        t1.start();
        t2.start();

    }

}
