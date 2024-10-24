import java.util.Scanner;

public class FavNumbers {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int favInt = SafeInput.getInt(in, "Enter your favourite integer");

        double favDb = SafeInput.getDouble(in, "Enter your favorite double number");

    }
}
