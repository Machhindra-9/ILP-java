import java.util.Scanner;
public class req_AVG{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements you want to create");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the two element to set limits");
        int lowerLimit = sc.nextInt();
        int upperLimit = sc.nextInt();
        int sum = 0;
        if( (lowerLimit > 0 && lowerLimit < arr.length) && (upperLimit > 0 && upperLimit < arr.length ) && lowerLimit < upperLimit){
            for(int i=lowerLimit+1;i<upperLimit;i++){
                sum+=arr[i];
            }
        }
        System.out.println("The average of the range of no is "+sum/(upperLimit-1-lowerLimit)+"sum is = "+sum);
    }
}