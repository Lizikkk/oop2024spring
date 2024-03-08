import java.util.Scanner;

public class MinutesIntoSeconds{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Minutes:");
        double Minutes = scanner.nextDouble();
        int intMinutes = (int)(Minutes);
        int seconds = intMinutes * 60 ;
        System.out.println( + intMinutes + " minutes is equal to "  + seconds + " seconds");
        
    }
}