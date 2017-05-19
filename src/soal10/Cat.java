package soal10;

import soal9.Animal;

/**
 * Created by hafnic on 5/19/17.
 */
public class Cat extends Animal {

    public void meow() {
        System.out.println("Meooooooooooooong");
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();

        cat1.meow();
        cat1.getData();
    }


    // ngisor iki kenopo stack overflow???
    /*
    public String meow() {
        System.out.println("Meooooooooooooong");
        return meow();
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.meow();
    }
     */

}
