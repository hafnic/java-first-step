package soal8;

/**
 * Created by hafnic on 5/16/17.
 */

import java.util.*;

public class SoalDataStructure {

    public static void main(String[] args) {

        ArrayList<Integer> angka = new ArrayList<Integer>();

        for (int i=1; i <= 10; i++) {
            angka.add(i);
        }

        for (int j = 0; j < angka.size(); j++) {
            System.out.println(angka.get(j));
        }

    }
}