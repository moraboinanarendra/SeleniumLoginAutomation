package files_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) throws IOException 
	{
		File f=new File("./test1.txt");
         if(!(f.exists()))
         {
        	 System.out.println(f.createNewFile());
         }
         FileOutputStream fu=new  FileOutputStream(f);
          String s="bujjamma";
          for(char c:s.toCharArray())
          {
        	fu.write((int) c);
          }
          fu.flush();
          fu.close();	
  }

}
