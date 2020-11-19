package learn.java.base;

import com.alibaba.fastjson.JSON;

public class BaseDemo {

    protected static void checked(CheckedFunction function) {
        try {
            function.handle();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    protected static String getThreadName() {
        return Thread.currentThread().getName();
    }

    protected static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected static void ptWithMillis(Object o) {
        print(curMills() + "=>" + toStr(o));
    }

    protected static void ptInfo(Object o) {
        print(curMills() + "|" + getThreadName() + "=> " + toStr(o));
    }

    protected static long curMills() {
        return System.currentTimeMillis();
    }

    protected static void print(Object o) {
        System.out.println(toStr(o));
    }

    protected static String toStr(Object o) {
        if (o instanceof String || o instanceof Number) {
            return (String) o;
        } else {
            return JSON.toJSONString(o);
        }
    }
}
