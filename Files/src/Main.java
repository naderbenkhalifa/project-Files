import java.io.*;
public class Main {
	
	
	  public static void main(String[] args) throws Exception {
	   
	    
	   
	  
	    PrintWriter writer = new PrintWriter(new File("C:/Users/hedi/Desktop/write.txt"));
	    writer.write("Hello, Welcome to java \r\n");
	    writer.write("Hello \r\n");
	    writer.write("java");
	    
	    
	 
	    
	    
	    
	    
	    
	    
	    
	    writer.flush();
	    writer.close();
	   //}
	    try
	    {
	     
	      File file = new File("C:/Users/hedi/Desktop/write.txt");    
	      
	      FileReader fr = new FileReader(file);  
	         
	      BufferedReader br = new BufferedReader(fr);  
	      StringBuffer sb = new StringBuffer();    
	      String line;
	      while((line = br.readLine()) != null)
	      {
	       
	        sb.append(line);      
	       sb.append("\n"); 
	       
	      }
	      fr.close();    
	      System.out.println("Contenu du fichier: ");
	    
	      
	    
	      System.out.println(sb.toString());  
	    }
	    catch(IOException e)
	    {
	      e.printStackTrace();
	    }
	}

	
}
