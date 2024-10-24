import java.util.Scanner;
public class BirthDateTime {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int birthYear = SafeInput.getRangedInt(in,"Enter your birth year", 1950,2015);
        int birthMonth = SafeInput.getRangedInt(in,"Enter your birth month in numbers", 1,12);
        int birthDay = 0;
        switch(birthMonth){
            case 2: birthDay= SafeInput.getRangedInt(in, "Enter your birth day", 1,29);
            case 1,3,5,7,8,10,12: birthDay=SafeInput.getRangedInt(in,"Enter your birth day",1,31);
            case 4,6,9,11: birthDay=SafeInput.getRangedInt(in,"Enter your birth day",1,30);
        }
        int birthHour = SafeInput.getRangedInt(in,"Enter your birth hour",1, 24);
        int birthMinute = SafeInput.getRangedInt(in,"Enter your birth minute",1,59);

    }
}
