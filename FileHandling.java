package casting;
import java.util.Scanner;


public class FileHandling {


	public static void main(String[] args) throws Exception {
		Boolean flag = true;
		char c='n';
		String fname="";
		
		FileHandlingMethods obj = new FileHandlingMethods();
		
		System.out.println("Choose the file operation number from below list");
		do {
		System.out.println("1.Create/Select "+'\n'+"2.Write"+'\n'+"3.Append"+'\n'+"4.Read");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		if(n==1) {
			System.out.println("Enter file name to create/Open  .txt file");
			fname= sc.next();
			obj.create(fname);
		}else if(n==2){		
			if(fname!="") {
			System.out.println("You chose to write into a file");	
			
			
			System.out.println("Enter EmployeeName: ");
			String EmployeeName = sc.next();
			
			System.out.println("Enter EmployeeID: ");
			String EID = sc.next();
			
			System.out.println("Enter EmployeeDesignation: ");
			String EmployeeDesignation = sc.next();				
			
			obj.write(EmployeeName,EID,EmployeeDesignation,fname);
			}else {
				System.out.println("You did not mention the file name to write ");
				System.out.println("Please Select the first option to Create/Open the file ");
			}
							
		    }else if(n==3){
		    
		   	if(fname!="") {
		    	do {
		    System.out.println("You chose to append more Employee records into a file");
		    
		    System.out.println("Enter EmployeeName: ");
			String EmployeeName = sc.next();
			
			System.out.println("Enter EmployeeID: ");
			String EID = sc.next();
			
			System.out.println("Enter EmployeeDesignation: ");
			String EmployeeDesignation = sc.next();		    
						
			obj.append(EmployeeName,EID,EmployeeDesignation,fname);	
			
			System.out.println("Do you want to append more records y/n:  ");
			 c = sc.next().charAt(0);
		    	}
			while(c =='y');		
		   	}else {
		   		System.out.println("You did not mention the file name to append ");
				System.out.println("Please Select the first option to Create/Open the file ");
		   	}
		   	
						
		    }else if(n==4){
		   	if(fname!="") {
			System.out.println("You chose to read a file");
			obj.read(fname);
		   	}else {
		   		System.out.println("You did not mention the file name to read ");
				System.out.println("Please Select the first option to Create/Open the file ");
		   	}
		   	
		    }else {			
			System.out.println("You entered a Invalid number");
		    }
		System.out.println("To continue with file operations enter y else n");
		 c = sc.next().charAt(0);
		}  
		while(c=='y');
	}
			
			
			
			
		}
	
	
	

	


