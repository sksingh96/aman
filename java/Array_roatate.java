//with Shift
class Test{
	public static void main(String[] args){	
		int []a= {4,3,2,10,12,1,5,6};
		int l=a.length;
		int b[]=new int[l];
		int x=2;
		int y=2;
		int b1=x+y;
		for(int i=0;i<l;i++){
			b[b1]=a[x];
			if(b1==l-1)
				b1=0;
			else
				b1++;
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





//Without  Shift
class Array_roatate{
	public static void main(String[] args){	
		int []a= {4,3,2,10,12,1,5,6};
		int l=a.length;
		int b[]=new int[l];
		int x=2;
		int b1=x+1;
		for(int i=0;i<l;i++){
			b[b1]=a[x];
			if(b1==l-1)
				b1=0;
			else
				b1++;
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













	































	



