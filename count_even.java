import java.util.Scanner;

public class count_even {
    public int count_even_no(long a) {
        int count = 0;
        while (a > 0) {
            if ((a % 10) % 2 == 0) {
                count++;
            }
            a = a / 10;
        }
        return count;
    }

    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){    //scanner object automatically get closed by this way
        System.out.println("enter the no for input");
        long a = sc.nextInt();
        count_even abc = new count_even();
        System.out.println("the no of even digits is "+abc.count_even_no(a));
        }
        
    }
}
