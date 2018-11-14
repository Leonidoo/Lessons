import java.util.Scanner;

public class Task_3061 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 1;
        int k = 0;
        int n = s.nextInt();

        do {
            a *= 2;
            k++;
        } while (a < n);
        System.out.println(k);
    }
}
