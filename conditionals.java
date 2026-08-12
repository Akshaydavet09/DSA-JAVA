import java.util.Scanner;

public class conditionals {
    public static void main(String[]args){
    // int a = 21;
    // int b = 30;
    // if(a>b){
    //     System.out.println("a is larger than b");
    // }else{
    //     System.out.println("b is larger than a");
    // }

    // if(a%2==0){
    //     System.out.println("a is even");
    // }else{
    //     System.out.println("a is odd");
    // }

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter your income: ");
    // int income = sc.nextInt();

    // if(income<500000){
    //     System.out.println("Income tax is 0");
    // }
    // else if(income>=500000 && income<1000000){
    //     int tax = (20*income)/100;
    //     System.out.println("Income tax is: "+ tax);
    // }
    // else{
    //     int tax = (30*income)/100;
    //     System.out.println("Income tax is: "+ tax);
    // }



    // calculator
    Scanner sc = new Scanner(System.in);
    // System.out.println("Press 1 for add 2 for subtract 3 for multiply 4 for divide.");
    // int operator = sc.nextInt();
    // System.out.println("Enter your Operand 1: ");
    // int a = sc.nextInt();
    // System.out.println("Enter your Operand 2: ");
    // int b = sc.nextInt();
    // int result = 0;
    // switch (operator) {
    //     case 1: result = a+b;
    //         break;
    //     case 2: result = a-b;
    //         break;
    //     case 3: result = a*b;
    //         break;
    //     case 4: result = a/b;
    //         break;
    
    //     default: System.out.println("You entered wrogn number");
    //         break;
    // }
    // System.out.println("Result is: " + result );


    System.out.println("Enter Year to check its leap or not: ");
    int year = sc.nextInt();
    if(year%400==0 || (year%4==0 && year%100!=0)){
        System.out.printf("%d is a leap year!", year);
    }
    else{
        System.out.printf("%d is not a leap year!", year);
    }
}
}
