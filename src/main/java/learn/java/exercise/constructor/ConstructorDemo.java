package learn.java.exercise.constructor;

public class ConstructorDemo {


    ConstructorDemo() {
        System.out.println("this is a no-parameter constructor");
    }

    ConstructorDemo(String word) {
        System.out.println(word);
    }



    public static void main(String[] args) {
        // no-parameter constructor
        new ConstructorDemo();

        // one-parameter constructor
        new ConstructorDemo("this is a constructor with one parameter");


    }

















}
