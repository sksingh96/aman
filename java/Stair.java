public class Stair {
	public static void main(String []args)
	{
		int i=7;
		System.out.println(stair(i));
	}
	static int stair(int x)
	{
		if(x==1)
		    return 1;
		if(x==2)
			return 2;
		return stair(x-1)+stair(x-2); 
	}
}
