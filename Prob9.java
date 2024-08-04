import java.util.Scanner;

public class Prob9 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the amount to be withdrawn in hundreds: ");
        int amountInHundreds = scanner.nextInt();
        scanner.close();

        
        int hundredNotes = amountInHundreds / 100;
        int remainingAmount = amountInHundreds % 100;

        int fiftyNotes = remainingAmount / 50;
        remainingAmount = remainingAmount % 50;

	 int tenNotes = remainingAmount / 10;	
        System.out.println("Currency notes to be given:");
        System.out.println("100 notes: " + hundredNotes);
        System.out.println("50 notes: " + fiftyNotes);
        System.out.println("10 notes: " + tenNotes);
    }
}