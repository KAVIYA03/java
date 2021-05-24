import java.util.Scanner;

public class ArrayMaxAndRepeated {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        int max =arr[0];
        int count=0;
        for(int i=0;i<n;i++)
        {
        arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            /*if(arr[i]==max)
            {
                count++;
            }*/
        }
       
        for(int i =0;i<n;i++)
        {
            if(arr[i]==max)
            {
                count++;
            }
        }
        System.out.println(max+" "+count);
       
    }
    
}