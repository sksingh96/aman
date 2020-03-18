
public class SelectionSort1 {
		  public static void main(String[] args) {
		    int a[] = {12,25,10,4,2,8};
		    for(int i:a)
		     System.out.print(i+" ");
		    System.out.println();

		    selectionSort(a);
		    
		    for(int i:a)
		     System.out.print(i+" ");
		    System.out.println();
		  }
		  public static void selectionSort(int a[]){
		    for(int j=0;j<a.length;j++){
		      int min = a[j], ind = j;
		      for(int i=j;i<a.length;i++){
		        if(min>a[i]){
		          min=a[i];
		          ind = i;
		        }
		      }
		      swap(a,j,ind);
		    }
		  }
		  public static void swap(int a[], int f, int s){
		    int temp=a[f];
		    a[f]=a[s];
		    a[s]=temp;
		  }
		}


