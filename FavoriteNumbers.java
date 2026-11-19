// november 17, 2026 | arrays
import java.util.Scanner;

public class FavoriteNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] number = new int[6];
        
        for (int i = 1; i < 6; i++){
            number[i] = input.nextInt();
        }
        System.out.println("Your favorite numbers are: ");
        for (int i = 1; i < 6; i++){
            System.out.println("Number " + i + ": " + number[i]);
        }
    }
}
