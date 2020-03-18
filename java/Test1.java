
class Test1{
	public static void main(String[] args){	
		int []a= {1,2,3,4,5};
		int l=a.length;
		int b[]=new int[l];
		int x=2;
		int y=a[x];
		
		for(int i=0;i<l;i++){

		 int temp=a[x+1];
		 a[x+1]=y;
		 temp=y;
			
			if(x==l-1)
				x=0;
			else
				  x++; 		
		}
		for(int i:a)
		  System.out.print(i+" ");
		System.out.println("++++++++++++++++++++++++");
		for(int q:b){
			System.out.print(q+" ");
		}
	}
}