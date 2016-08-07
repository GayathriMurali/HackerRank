import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Sum {
	public static void main(String[] args) {
		// Set<Integer> numbers = new HashSet<Integer>();
		int[] arr = {2, 3, 10, 6, 4, 8, 1};
		int max_diff = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] - arr[j] > 0)
					continue;
				else {
					if (Math.abs(arr[i] - arr[j]) > max_diff)
						max_diff = Math.abs(arr[i] - arr[j]);
				}
			}
		}
		System.out.println(max_diff);
		//if (max_diff > 0)
			//return max_diff;
		//return -1;
	}
}
