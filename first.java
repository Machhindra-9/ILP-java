import java.util.Scanner;
class first{
    public int num1;
    public int num2;
    public first(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int add(){
        return num1+num2;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        first one = new first(a,b);
        System.out.println("addition of two no is "+one.add());
        sc.close();
    }
}