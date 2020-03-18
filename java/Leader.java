
public class Leader {
	public static void main(String[] args)
	{		int []a= {5,17,15,10,20,8,3,2,1};
	
	     int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]<=a[j])
				{
					i=j;
				
				}
				if(j==n-1)
				{
					System.out.println(a[i]);
				}
			}
			
		}
	}
	}




