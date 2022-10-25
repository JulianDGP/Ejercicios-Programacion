package beecrowd;
import java.util.Scanner;

public class PascalsTriangle {
    public static int sumar(int n) {
        int suma=0;
        for(int i=0; i<n; i++) {
            suma += Math.pow(2, i);
        }
        return suma;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        byte q = in.nextByte();
        for(byte i=0; i<q; i++) {
            byte n = in.nextByte();
            System.out.println(sumar(n));
        }
    }
}
