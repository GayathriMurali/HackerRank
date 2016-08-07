public class QuickSort {
	
	static void quicksort(int []a,int low,int high)
	{
	    if(a.length < 1) return;
	    if(low<=high) {
	    int pivot = findpivot(a,low,high);
	    quicksort(a,low,pivot-1);
	    quicksort(a,pivot+1,high);
	    }

	}
	static int findpivot(int []a, int start,int end)
	{
		int pivot = start, temp;
        while (start <= end) {
            while (start <= end && a[start] <= a[pivot]) start++;
            while (start <= end && a[end] > a[pivot]) end--;
            if (start > end) break;
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
        }
        temp = a[end];
        a[end] = a[pivot];
        a[pivot] = temp;
        return end;
    }
	 
	public static void main(String []args) {
		int[] a = {37,42,3,55,2,10,5};
		quicksort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
