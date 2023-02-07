import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("n1 sayısını giriniz : ");
        int n1 = scanner.nextInt();

        System.out.println("n2 sayısını giriniz : ");
        int n2 = scanner.nextInt();

        int i = 1;
        int k = 1;
        int ebob = 1;
        int ekok = 1;

        if (n1 < n2) {
            while (i < n2) {
                i++;
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }

        } else {
            while (i < n2) {
                i++;
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
        }
        System.out.println("Ebob = " + ebob);

        while (k <= (n1 * n2)) {
            k++;
            if ( k % n1 == 0 && k % n2 == 0) {
                ekok = k;
                break;
            }
        }
        System.out.println("Ekok = " + ekok);
    }
}