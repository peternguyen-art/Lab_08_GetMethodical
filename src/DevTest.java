import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("getNonZeroLenString method");
        String name = SafeInput.getNonZeroLenString(in, "Enter yo name");

        System.out.print("getInt method");
        int age = SafeInput.getInt(in, "Enter your age");

        System.out.print("getDouble method");
        double myDouble = SafeInput.getDouble(in, "Enter a double value");

        System.out.print("getRangedInt method");
        int rangedInt = SafeInput.getRangedInt(in, "Enter your value in range", 10, 77);

        System.out.print("getRangedDouble method");
        double rangedDouble = SafeInput.getRangedDouble(in,"Enter your double in range",2.8,67.56);

        System.out.print("getYNConfirm method");
        boolean myBoolean = SafeInput.getYNConfirm(in,"Enter your answer");
    }
}