import java.util.Scanner;

public class armstrong {
    public int count(int digits) {
        int count = 0;
        while (digits > 0) {
            count++;
            digits = digits / 10;
        }
        return count;
    }

    public int return_cube(int digits,int count){
        int cube = 0;
        int tmp = 1;
        while(digits> 0){
            tmp=1;
            int rem = digits%10;
            for (int i = 0; i < count; i++) {
                tmp = tmp*rem;
            }
            cube = tmp+cube;
            digits = digits/10;
        }
        return cube;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        // code to implement armstrong no
        armstrong am = new armstrong();
        int count = am.count(no);
        if (no == am.return_cube(no, count)){
        System.out.println("it is armstrong no");
        }else {
        System.out.println("no is not armstrong no");
        }
        sc.close();
    }
}
