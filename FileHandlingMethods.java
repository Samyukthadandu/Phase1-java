package casting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileHandlingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void create(String fname1)throws Exception {
		File f = new File(fname1);
		if(f.exists()) {
			System.out.println("File with this name already exists");
		}else {		
		f.createNewFile();	
		System.out.println("New File is created");
		}
	
	}
	public void write(String empname,String id ,String designation,String fname1) throws Exception {
		PrintWriter pw =new PrintWriter(fname1);
		pw.println(empname);
		pw.println(id);
		pw.println(designation);
		pw.flush();
		pw.close();
		System.out.println("Employee details are written into the file");
							
	}
	public void append(String empname,String id ,String designation,String fname1) throws Exception {
	FileWriter fw = new FileWriter(fname1,true);
    fw.write(empname);
    fw.write("\n");
    fw.write(id);
    fw.write("\n");
    fw.write(designation);
    fw.write("\n");
    fw.flush();
    fw.close();
    System.out.println("New record appended into the file");
    
     }
	public void read(String fname1) throws Exception {
	  FileReader f = new FileReader(fname1);
	  BufferedReader br = new BufferedReader(f);
	  String line =br.readLine();
	  while(line!=null) {
		  System.out.println(line);
		  line=br.readLine();
	  }
	  System.out.println("File reading is completed");
		
	  br.close();
	}
	  
	  
	  
	
}
