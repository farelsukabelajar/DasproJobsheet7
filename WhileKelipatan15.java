import java.util.Scanner;

public class WhileKelipatan15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0;

        System.out.print("Masukan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
            i++;
        }

        double rataRata;

        if (counter != 0) {
            rataRata = (double) jumlah / counter;
        } else {
            rataRata = 0;
        }

        System.out.printf("Banyaknya bilangan %d dari 1-50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1-50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-Rata bilangan kelipatan %d dari 1-50 adalah %2f\n", kelipatan, rataRata);

    }
}
