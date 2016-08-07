//Incomplete. Do not use this code for reference.

import java.util.*;
public class JustifyText {
     static void justifytext(List<String> str,int k)
     {
    	 List<String> result = new ArrayList();
    	 int numblanks=1;
    	 int templength=0;
    	 int currLine=0;
    	 StringBuilder eachline=new StringBuilder();
    	 int i=0;
    	 while(i<str.size())
    	 {
    		 
    		 templength+=str.get(i).length();
    		 if(templength+(result.size()-1)<k)
    			 result.add(str.get(i));
    		 if(templength+(result.size()-1)>k)
    		 {
    			 templength-=str.get(i).length();
    			 numblanks = k-templength;
    			 //numblanks/=result.size();
    			 buildLine(result,numblanks,k);
    			 currLine++;
    			 
    		 }
    		 else
    		 if(templength+(result.size()-1)==k)
    		 {
    			 String temp="";
    			 int j=0;
    			 while(!result.isEmpty())
    			 {
    				 temp+=result.remove(j)+" ";
    			 }
    			 result.add(temp);
    			 currLine++;
    				 
    		 }
    		 i++;
    	
    	 }
    	 for(String s:result)
    		 System.out.println(s);
     }
     static void buildLine(List<String> result,int numblanks,int k)
     {
             int j=0;
             String blanks="";
             String temp="";
             for(int i=0;i<numblanks;i++)
            	 blanks+=" ";
             while(!result.isEmpty() && temp.length()<k)
             {
            	 temp+=result.remove(j)+blanks;
             }
             
             result.add(temp);
     }
     public static void main(String[] args)
     {
    	 List<String> list = new ArrayList();
    	 list.add("The");
    	 list.add("quick");
    	 list.add("brown");
    	 list.add("fox");
    	 list.add("jumped");
    	 list.add("over");
    	 list.add("the");
    	 list.add("lazy");
    	 list.add("dogs");
    	 justifytext(list,11);
     }
}
