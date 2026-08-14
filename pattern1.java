import java.util.Scanner;
public class pattern1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbr to print star pattern: ");
        int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }



        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }



        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+"  ");
        //     }
        //     System.out.println();
        //     System.out.println();
        // }



        char alphabet = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(alphabet++ + " ");
            }
            System.out.println();
        }
    }
}