import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class BalanceParentheses {

	public static void main(String []args)
	{
		String str="((a+b))((";
		StringBuilder sb=new StringBuilder();
		balanceparentheses(str,sb);
	}
	static void balanceparentheses(String str,StringBuilder sb)
	{

      
        Deque<Integer> dq = new LinkedList<Integer>();
        for(int i=0; i < str.length(); i++){
            //skip non bracket characters
            if(str.charAt(i) != '(' && str.charAt(i) != ')'){
                continue;
            }
            
            //add opening brackets
            if(str.charAt(i) == '('){
                dq.addFirst(i);
            }
            else if(str.charAt(i) == ')'){
                //if top is opening bracket just remove from stack else add closing bracket
                if(!dq.isEmpty() && str.charAt(dq.peekFirst()) == '('){
                    dq.pollFirst();
                }else{
                    dq.addFirst(i);
                }
            }
        }
        int index = 0;
        //iterate through list again and don't add leftover
        //characters from stack in final result
        for(int i=0; i < str.length(); i++){
            if(!dq.isEmpty() && i == dq.peekLast()) {
                dq.pollLast();
            }else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
	
}

