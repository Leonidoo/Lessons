import java.util.Scanner;

public class Task_112193 {
    static long lcm(long a, long b){
        return a * b / gcd(a,b);
    }

    static long gcd(long a, long b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(lcm(s.nextInt(), s.nextInt()));
    }
}
