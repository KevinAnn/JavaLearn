package learn.java.enumDemo;


class Animal{

    public void eat(){
        System.out.println("吃");
    }

    public void walk(){
        System.out.println("走");
    }

    public void swim(){
        System.out.println("游");
    }

}

class   Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }

    @Override
    public void walk(){
        System.out.println("狗走路");
    }

}


public class PolymorphismDemo {

    public static void main(String[] args) {
        Animal animal = new Dog();

        animal.eat();
        animal.walk();
        animal.swim();





    }



}
