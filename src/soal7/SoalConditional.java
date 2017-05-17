package soal7;

/**
 * Created by hafnic on 5/16/17.
 */
public class SoalConditional {

    public void ganjilAtoGenap(int nomor) {

        if (nomor%2==1) {
            System.out.println(nomor +" itu  nomor ganjil lho!");
        } else {
            System.out.println(nomor +" itu nomor genap lho!");
        }
    }


    public static void main(String[] args) {

        SoalConditional cekGanjilGenap = new SoalConditional();
        cekGanjilGenap.ganjilAtoGenap(97);
    }
}
