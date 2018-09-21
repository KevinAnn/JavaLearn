package learn.java.constructorDemo;

public class ConstructorDemo {

    ConstructorDemo(){
        System.out.println("constructorDemo!");
    }

    ConstructorDemo(int a){
        System.out.println(a);
    }

    ConstructorDemo(String b, String c){
        System.out.println(b + c);
    }

    public static void main(String[] args) {
//        new constructordemo(1);
        System.out.println("=======================");
        System.out.println(new LizihaoConstructorDemo(3,"Kevin"));
    }




}



class LizihaoConstructorDemo {

    private Integer a ;
    private String b ;
    private Float c ;
    LizihaoConstructorDemo() {
        init();
    }

    LizihaoConstructorDemo(Integer a ) {
        init(a);
    }

    LizihaoConstructorDemo(Integer a , String b ) {
        init(a,b);
    }


    LizihaoConstructorDemo(Integer a, String b , Float c) {
        init(a,b,c);
    }

    @Override
    public String toString() {
        return "LizihaoConstructorDemo{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", c=" + c +
                '}';
    }

    private void init(Integer a, String b, Float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void init(Integer a, String b) {
        init(a, b, 12.1F);
    }

    private void init(Integer a) {
        init(a,"lizihao_default");
    }

    private void init() {
        init(1);


    }




}