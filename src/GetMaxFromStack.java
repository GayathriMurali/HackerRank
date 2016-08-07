
public class GetMaxFromStack {
       
   public static void main(String[] args) {
	   CustomStack s = new CustomStack();
	   s.push(2);
	   s.push(2);
	   s.push(1);
	   s.push(5);
	   s.push(4);
	   s.push(5);
	  // s.push(10);
	  // s.push(2);
	  // s.push(1);
	  // s.push(7);
	  // s.push(11);
	   s.pop();
	   s.pop();
	   int n = s.getmax();
	   System.out.println(n);
   }
   
   

    
	

}
