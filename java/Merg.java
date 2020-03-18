class Merg{
	public static void main(String[] args){
		
			    int [][]a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},};
			    for(int i=0;i<a.length;i++)
			    {
			      for(int j=0;j<a.length;j++)
			      {
			        System.out.print(a[i][j]+" ");
			      }
			      System.out.println();
			    }
			    int  [][]b=new int[4][4];
			    for(int i=0;i<a.length;i++)
			    {
			      for(int j=0;j<a.length;j++)
			      {
			        b[i][j]=a[a.length-1-j][i];
			      }
			    }
			    
			        System.out.print("++++++++++++++++++++");
			     
			    for(int i=0;i<a.length;i++)
			    {
			      for(int j=0;j<a.length;j++)
			      {
			        System.out.print(b[i][j]+" ");
			      }
			      System.out.println();
			    }
	}
}