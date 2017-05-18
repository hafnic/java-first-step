package soal9;

/**
 * Created by hafnic on 5/18/17.
 */
public class Animal {
    String whatsItsName;
    int howOld;
    boolean isAlive;

    public Animal(String name, int age, boolean alive)
    {
        whatsItsName = name;
        howOld = age;
        isAlive = alive;
    }

    public void getData() {
        System.out.println("nama: "+whatsItsName);
        System.out.println("umur: "+howOld);
        System.out.println("hidup gak?: "+isAlive);
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("Omen",3,true);

        animal1.getData();

    }
}


