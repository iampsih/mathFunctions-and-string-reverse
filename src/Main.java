import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] a = new int[101];
        int n = scn.nextInt(), sum = 0;
        for(int i = 0; i < n; ++i) {
            a[i] = scn.nextInt();
            sum += a[i];
        }
        Arrays.sort(a, 0, n - 1);
        for(int i = 0; i < n; ++i) {
            System.out.println(a[i]);
        }
        //max & min
        System.out.println(a[0] + " " + a[n - 1]);
        //sum & average
        System.out.println(sum + " " + sum / n);
        //Mediana
        if(n % 2 == 0) System.out.println(a[1] / 2 + a[n] / 2);
        else System.out.println(a[n/2]);
    }
}