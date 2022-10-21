import java.util.Scanner;

public class BirthDateTime{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year=0;
        int month=0;
        int day=0;
        int hrs=0,min=0;

        year = SafeInput.getRangedInt(in, "Enter your birth year between 1950 to 2010",1950,2010);
        month = SafeInput.getRangedInt(in, "Enter your birth month between 1 to 12",1,12);

        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = SafeInput.getRangedInt(in, "Enter your birth day between 1 to 31",1,31);
                break;
            case 2:
                day = SafeInput.getRangedInt(in, "Enter your birth day between 1 to 29",1,29);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = SafeInput.getRangedInt(in, "Enter your birth day between 1 to 30",1,30);
                break;
        }
        hrs = SafeInput.getRangedInt(in, "Enter your birth hour 1 to 24",1,24);
        min = SafeInput.getRangedInt(in, "Enter your birth minute 1 to 59",1,59);

        System.out.println("\nYour were born on : "+month+"/"+day+"/"+year+" at "+hrs+":"+min);

    }

}