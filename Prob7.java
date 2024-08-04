  public class Prob7{

	public static void main(String[] args) {
        int number = 12345;
        int sum = 0;

       
        sum += number % 10;         
        number /= 10;              
        sum += number % 10;         
        number /= 10;               
        sum += number % 10;         
        number /= 10;               
        sum += number % 10;         
        number /= 10;               
        sum += number;              

        System.out.println("Sum of digits of 12345 is: " + sum);
    }
}