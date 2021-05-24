import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col  = sc.nextInt();
        int matrix[][] = new int [rows][col]1;
        int transpose[][] = new int [rows][col];
 if(((rows>=3)&&(rows<=10))&&((col>=3)&&(col<=10)))
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0; j<col;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        } 
        System.out.println("Entered matrix is:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0; j<col;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0; j<col;j++)
            {
               transpose[i][j] = matrix[j][i];
            }
        } 
        System.out.println("Transpose matrix is:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0; j<col;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }  
    }
else
{
    System.out.println("invalid input");
}
    }
}