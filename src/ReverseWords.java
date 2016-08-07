
public class ReverseWords {
    static void reversewords(String str)
    {
    	String[] arr = str.split(" ");
    	for(int i = arr.length-1;i>=0;i--)
    		System.out.print(arr[i]+" ");
    }
    public static void main(String []args)
    {
    	String str = "";
    	reversewords(str);
    }
}
