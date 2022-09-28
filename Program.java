package practice;

public class Program
{
 public static void main(String[] args) {
	int i,j,k,n=5;
	for(i=1;i<=n;i++)
	{
		k=1+i-1;
		for(j=1;j<=n;j++)
		{
			if(j<=i)
			{
				
				System.out.print(k++);
				
			}
		}
		System.out.println();
	}
}
}
