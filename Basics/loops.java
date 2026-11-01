import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number to conting till then: ");
        // int n = sc.nextInt();
        // int counter = 1;
        // int addition = 0;
        // while(counter<=n){
        // addition += counter;
        // counter++;
        // }
        // System.out.println(addition);

        // System.out.println("Enter a number to print square pattern");
        // int n = sc.nextInt();
        // for(int i=0; i<n; i++){
        // for(int j=0; j<n; j++){
        // System.out.print("* i");
        // }
        // System.out.println();
        // }

        // int digits = 0;
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        // int number = n;
        // for(;n>0;n/=10){
        // digits++;
        // }
        // System.out.printf("Digits in %d is %d.",number,digits);
        // System.out.println();

        // int reverse = 0;
        // for(; number>0; number/=10){
        // reverse += (number%10)* Math.pow(10,digits-1);
        // digits--;
        // }
        // System.out.printf("Reverse of number is %d", reverse);

        // int number = sc.nextInt();
        // int reverse = 0;
        // int ld = 0;
        // for(; number>0; number/=10){
        // ld = number%10;
        // reverse = (reverse*10) + ld;
        // }
        // System.out.println(reverse);

        // for(;true;){
        // System.out.println("Enter a number: ");
        // int number = sc.nextInt();
        // if(number%10==0){
        // continue;
        // }
        // System.out.println(number);
        // }

        // System.out.println("Enter a number to find its prime or not: ");
        // int number = sc.nextInt();
        // boolean value = false;
        // for(int i=2; i<=Math.sqrt(number); i++){
        // if(number%i==0){
        // value = true;
        // break;
        // }
        // }
        // if(value){
        // System.out.println("It is a composite number");

        // }else{
        // System.out.println("It is a prime number");
        // }


        // int odd = 0;
        // int even = 0;
        // System.out.println("Press 0 to exit");
        // for (; true;) {
        //     System.out.println("Enter a number: ");
        //     int number = sc.nextInt();
        //     if(number==0){
        //         break;
        //     }
        //     if(number%2==0){
        //         even += number;
        //     }
        //     else{
        //         odd += number; 
        //     }
        // }
        // System.out.printf("Result of odd is %d", odd);
        // System.out.println();
        // System.out.printf("Result of even is %d", even);



        int factorial = 1;
        System.out.println("Enter a number to find its factorial: ");
        int number = sc.nextInt();
        if(number==1 || number==0){
            factorial = 1;
        }
        for(int i=number; i>1; i--){
            factorial*=i;
        }
        System.out.println("Factorial is: "+ factorial);
    }
}  