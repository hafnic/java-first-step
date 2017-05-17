package soal5;

/**
 * Created by hafnic on 5/16/17.
 */
public class SoalFungsi {

    int a=3;
    int b=4;
    int c=5;
    int fungsiX;

    public void fungsiKuadrat(int x) {
       //f(x)=ax^2+bx+c=0
        fungsiX=a*(x*x)+b*x+c;
        System.out.println("hasil dari fungsi(x)="+a+"x^2+"+b+"x+"+c+", jika x="+x+", adalah = "+fungsiX);
    }

    public static void main(String[] args) {
        SoalFungsi fungsi1 = new SoalFungsi();
        fungsi1.fungsiKuadrat(3);

    }
}
