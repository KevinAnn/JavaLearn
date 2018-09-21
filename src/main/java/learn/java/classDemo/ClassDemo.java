package learn.java.classDemo;

/**
* Description: 学习static关键字、学习获取类中的变量
* @author Kevin
* @date 2018/8/12 11:23
*/
public class ClassDemo {

    static int a = 1;
    int b = 2;
    String aa = "aa";

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
        //实例化NewClass对象
        NewClass newClass = new NewClass();
        //打印newClass.returnA()
        System.out.println(newClass.returnA());
        //打印newClass.returnB()
        System.out.println(newClass.returnB());

    }

}

class NewClass {

    /**
     * Description: 返回从ClassDeme中获取的a值
     * @param: []
     * @return: int
     * @Date: 2018/8/12 11:18
     */
    public int returnA() {
        //直接从ClassDemo中获取static的a值
        int a = ClassDemo.a;
        //返回a
        return a;
    }



    /**
     * Description: 返回从ClassDemo中获取的b值
     * @param: []
     * @return: int
     * @Date: 2018/8/12 11:20
     */
    public int returnB() {
        //实例化ClassDemo对象
        ClassDemo classDemo = new ClassDemo();
        //调用getB()方法获取b值
        int b = classDemo.getB();
        //返回b
        return b;







    }

























}