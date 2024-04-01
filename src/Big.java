import java.math.BigInteger;

public class Big {
    public static BigInteger factorial(int n){
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void printFactorialTable(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.printf("%d \t %d %n", i, factorial(i));
        }
    }
    public static void main(String[] args) {
        printFactorialTable(30);
    }
}