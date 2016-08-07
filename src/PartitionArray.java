
public class PartitionArray {
	public static void main(String[] args){
		int[] a = {37,42,3,55,2,10,5};
		partition(a,0,a.length-1,6);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	static void partition(int[] a,int low,int high,int k) {
		
		int pivot = a[k];
		while(low<high)
		{
			 while(low<=high && a[low]<=pivot) low++;
			 while(low<=high && a[high]>pivot) high--;
			 if(low > high) break;
			 int temp = a[low];
			 a[low] = a[high];
			 a[high] = temp;
		}
		int temp = a[high];
		a[high] = pivot;
		a[k] = a[high];
	}

}
