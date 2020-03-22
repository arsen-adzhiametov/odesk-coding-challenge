import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Arsen Adzhiametov on 7/31/13.
 */
public class Temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i != 0) {

            int[] temps = new int[i];

            for (int j = 0; j < i; j++) {
                temps[j] = sc.nextInt();
            }

            Arrays.sort(temps);

            Integer positiveCandidate = null;
            for (int j = 0; j < temps.length; j++) {
                if (temps[j] >= 0) {
                    positiveCandidate = temps[j];
                    break;
                }
            }

            Integer negativeCandidate = null;
            for (int j = temps.length - 1; j > 0; j--) {
                if (temps[j] <= 0) {
                    negativeCandidate = temps[j];
                    break;
                }
            }

            if (negativeCandidate == null) {
                System.out.println(negativeCandidate);
            } else if (negativeCandidate == null) {
                System.out.println(negativeCandidate);
            } else {
                System.out.println(Math.abs(negativeCandidate));
            }

        } else {
            System.out.println(0);
        }
    }
}
