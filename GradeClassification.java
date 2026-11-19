// november 17, 2026 | more arrays 
import java.util.Scanner;

public class GradeClassification {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int grades = input.nextInt();
        
        int[] number = new int[grades];
        int passCount = 0;
        int failCount = 0;
        
        for (int i = 0; i < grades; i++){
            number[i] = input.nextInt();
            if (number[i] >= 75){
                passCount++;
            } else {
                failCount++;
            }
        }
        System.out.println("Results: ");
        System.out.println("Pass: " + passCount);
        System.out.println("Fail: " + failCount);
    }
}
