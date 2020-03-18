
public class Leader_Recursive {
	
		  
		  static int []a= {5,17,15,20,7,8,3,2,1};
		  static int n = a.length;

		  public static void main(String[] args){
		   leader(a,0);
		  }
		  public static int leader(int []a,int s)
		  {
		    if(s==n-1)
		    {
		      System.out.print(a[s]+" ");
		      return a[s];
		    }
		    int latest = leader(a,s+1);
		    if (a[s]>latest){
		      latest=a[s];
		      System.out.print(latest+" ");
		    }
		    return latest;
		  }
		}
