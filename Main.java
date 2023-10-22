import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("1 - 100 arasındaki asal sayılar: ");

        for (int i = 2; i > 1 && i < 100; i++) {
            Boolean dogruMu = true;

            for (int a = 2; a < i; a++) {
                if (i % a == 0) {
                    dogruMu = false;
                    break;
                }
            }
            if (dogruMu) {
                System.out.print(i + " ");

            }
        }

    }


}

