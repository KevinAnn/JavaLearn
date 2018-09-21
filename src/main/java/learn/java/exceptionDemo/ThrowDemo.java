package learn.java.exceptionDemo;

public class ThrowDemo {


    public static void exceptionDemo() throws Exception {
        String a = "abc";
        int b = Integer.parseInt(a);
    }
    public static void main(String[] args) {

        System.out.println("begin...");

        try {
            exceptionDemo();
        } catch (Exception e) {
            System.out.println("转换出错！");
        }

        System.out.println("ending...");











    }
}
