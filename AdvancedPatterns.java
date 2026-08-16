import java.util.Scanner;
public class AdvancedPatterns{
    public static void main(String[]main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1; j++){
                if(i==1 || i==n || j==1 || j==n+1){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        

System.out.println();

for(int i=1; i<=n; i++){
    for(int gap=1; gap<=n-i; gap++){
        System.out.print("   ");
    }
    for(int star=1; star<=i; star++){
        System.out.print("*  ");
    }
    System.out.println();
}

System.out.println();


for(int i=1; i<=n; i++){
            int number = 1;
            for(int j=1; j<=n-i+1; j++){
                System.out.print(number++ + "  ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        int number = 1; 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number++ + "  ");
            }
            System.out.println();
        }        
        System.out.println();
        
        
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i%2!=0 && j%2!=0) || (i%2==0 && j%2==0)){
                    System.out.print("1  ");
                }
                else{
                    System.out.print("0  ");
                }
            }   
            System.out.println();
        }

        System.out.println();


        int sv = 1;
        int gv = n-2;
        for(int i=1; i<=n; i++){
            for(int star=1; star<=sv; star++){
                System.out.print("*  ");
            }
    
            for(int gap=1; gap<=gv; gap++){
                System.out.print("   ");
    
            }
            for(int star=1; star<=sv; star++){
                System.out.print("*  ");
    
            }
            System.out.println();
            if(i==n/2){
                continue;
            }
            else if(i>n/2){
                sv--;
                gv += 2;
            }
            else{
                sv++;
                gv -= 2;
            }
        }
        
    }
}