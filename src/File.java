import java.io.*;
public class File {
   public static void main(String[] args) throws IOException
   {
	   FileReader inputfile;
	try {
		inputfile = new FileReader("/Users/gayathri/sample.txt");
		 BufferedReader br = new BufferedReader(inputfile);
		 String line="";
		 while((line=br.readLine())!=null)
		 {
			 System.out.println(line);
		 }
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	   
   }
}
