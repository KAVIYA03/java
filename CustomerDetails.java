import java.util.Scanner;
class CustomerDetails
{
	public static void main(String[] args)
	{
		  Scanner sc=new Scanner(System.in);
		  System.out.println("no.of custumerID: ");
		  int n= sc.nextInt();
		  String[] cus= new String[n];
		  System.out.println("enter custumerID: ");
		  for(int i=0;i<n;i++)
		  {
			  cus[i]=sc.next();
		  }
		  System.out.println("invalid custumerID: ");
		  for(int i=0;i<n;i++)
		  {
			  if(cus[i].length()<6)
			  System.out.print(cus[i]+" ");
		}
	}
}