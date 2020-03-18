
public class Sub_String {
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				for(int q=i;q<=j;q++)
				{
				   System.out.print(a[q]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
