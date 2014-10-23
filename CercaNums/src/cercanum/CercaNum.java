package cercanum;

import java.util.Arrays;
import java.util.Random;

public class CercaNum {

    static int[] numeros = new int[500000];
    static boolean numTrobat = false;

    public static void main(String[] args) {

        long startTime;
        long stopTime;


        int numAcercar = 222222;
        int index = 0;

        long tempsTrigat = 0;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            Random r = new Random();
            int numRand = r.nextInt(500000);
            numeros[i] = numRand;
        }

        Arrays.sort(numeros);

        while (!numTrobat && index < numeros.length) {
            if (numeros[index] == numAcercar) {
                System.out.println("S'ha trobat el numero a la pos " + index + "!!!");
                stopTime = System.currentTimeMillis();
                tempsTrigat = stopTime - startTime;
                numTrobat = true;
            }
            index++;
        }
        if (!numTrobat) {
            stopTime = System.currentTimeMillis();
            tempsTrigat = stopTime - startTime;
            System.out.println("El numero no apareix a la llista!");
        }


        System.out.println("S'ha trigat " + tempsTrigat + " milisegons.");
    }

}
