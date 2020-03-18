public class InsertionSort {
    public static void main(String[] args)
	{
		int []arr= {25,5,10,3,6,2};
		sort(arr);
		print(arr);
	}
	public static void sort(int []a)
	{
		int n=a.length;
		for(int i=1;i<n;i++)
		{
			int  key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j=j-1;
				
			}
			a[j+1]=key;
			for(int q:a)
				System.out.print(q+" ");
			System.out.println();
		}
	}
	public static void print(int []a)
	{ 
		System.out.println("++++++++++++++");
		System.out.println("Sorted Array is");
		for(int z:a)
		{
			System.out.println(z);
		}
	}
}