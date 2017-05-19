package soal10;

import soal9.Animal;

/**
 * Created by hafnic on 5/19/17.
 */
public class Dog extends Animal{

    public void bark() {
        System.out.println("Wooofff");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.getData();
    }

}
