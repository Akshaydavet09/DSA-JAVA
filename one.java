import java.util.Scanner;

public class one {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to convert into decimal: ");
        int n = sc.nextInt();

        int sumPiece = 0;
        for(int i=0 ; n>=1; n/=10){
            int lastNum = n%10;
            int piece = lastNum * (int) Math.pow(2, i++);
            sumPiece += piece; 
        }

        System.out.println(sumPiece);

    }
}