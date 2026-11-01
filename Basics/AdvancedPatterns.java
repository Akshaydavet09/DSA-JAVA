import java.util.Scanner;

public class AdvancedPatterns {
    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n + 1; j++) {
        // if (i == 1 || i == n || j == 1 || j == n + 1) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // System.out.println();

        // for (int i = 1; i <= n; i++) {
        // for (int gap = 1; gap <= n - i; gap++) {
        // System.out.print(" ");
        // }
        // for (int star = 1; star <= i; star++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // System.out.println();

        // for (int i = 1; i <= n; i++) {
        // int number = 1;
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print(number++ + " ");
        // }
        // System.out.println();
        // }

        // System.out.println();

        // int number = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(number++ + " ");
        // }
        // System.out.println();
        // }
        // System.out.println();

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // if ((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)) {
        // System.out.print("1 ");
        // } else {
        // System.out.print("0 ");
        // }
        // }
        // System.out.println();
        // }

        // System.out.println();

        // int sv = 1;
        // int gv = n - 2;
        // for (int i = 1; i <= n; i++) {
        // for (int star = 1; star <= sv; star++) {
        // System.out.print("* ");
        // }

        // for (int gap = 1; gap <= gv; gap++) {
        // System.out.print(" ");

        // }
        // for (int star = 1; star <= sv; star++) {
        // System.out.print("* ");

        // }
        // System.out.println();
        // if (i == n / 2) {
        // continue;
        // } else if (i > n / 2) {
        // sv--;
        // gv += 2;
        // } else {
        // sv++;
        // gv -= 2;
        // }
        // }

        // System.out.println();

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n * 2 - 1; j++) {
        // if (j <= n * 2 - i && j >= n - i + 1) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // System.out.println();

        // int frontBarrier = n / 2 - 1;
        // int endBarrier = n / 2 + 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j < n; j++) {
        // if (j > frontBarrier && j < endBarrier) {
        // System.out.print("* ");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // if (i >= 1 && i <=n/2) {
        // if(i==n/2){
        // continue;
        // }
        // frontBarrier -= 1;
        // endBarrier += 1;
        // } else {
        // frontBarrier += 1;
        // endBarrier -= 1;
        // }
        // }

        int frontBarrier = (n * 2) / 2 - 1;
        System.out.println(frontBarrier);
        int endBarrier = (n * 2) / 2 + 1;
        System.out.println(endBarrier);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n * 2; j++) {
                if (j > frontBarrier && j < endBarrier) {
                    // System.out.println(i);.
                    if ( (i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0) ) {
                        System.out.print(i + "  ");
                        continue;
                    }else {
                        System.out.print("   ");
                        continue;
                    }
                }
                System.out.print("   ");
            }
            System.out.println();
            System.out.println();
            frontBarrier -= 1;
            endBarrier += 1;

        }

    }
}