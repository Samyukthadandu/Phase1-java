package casting;
import java.util.Scanner;

public class EmaiValidation {
	
	static boolean flag =false;

	public static void main(String[] args) {
		
		String[] user_id= {"johN_121@mind.org","marK_122@mind.org","rickY_123@mind.org","meerA_124@mind.org",
			            	"jiA_125@mind.org","harI_126@mind.org","mayA_127@mind.org","raJ_128@mind.org",
			            	"saM_129@mind.org","viraT_126@mind.org"};
		do {
		System.out.println("Enter your Email_ID");
		Scanner s =new Scanner(System.in);
		
		String email_Id = s.next();
		
		for(String id:user_id) {
			if(email_Id.equals(id)){
				System.out.println("It's a valid Email_ID");
				flag = true;
				break;
			}
		}	
		if(flag==false) {
			System.out.println("It's not a valid Email_ID");
		}	 
			
		}		
		
		while(flag==false);		
				
			}
			
		}
			
				
		
		
		


