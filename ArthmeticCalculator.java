package casting;
import java.util.Scanner;

public class ArthmeticCalculator {

	public static void main(String[] args) {
		
      System.out.println("Enter the Firstnumber");
      Scanner s1 = new Scanner(System.in);
      Double num1 = s1.nextDouble();
      
      System.out.println("Enter the Secondnumber");
      Scanner s2 = new Scanner(System.in);
      Double num2 = s2.nextDouble();
      
      System.out.println("Enter the operation +,-,*,/,%");
      Scanner s3 = new Scanner(System.in);
      char c = s3.next().charAt(0);
      
      switch(c)
      {
      case '+' :
       Double sum = num1+num2;
       System.out.println("Sum:  " + sum );
       break;
      case '-' :
       Double diff = num1-num2;
       System.out.println("Difference:  " + diff );
       break;
      case'*':
    	Double prod = num1*num2;
    	System.out.println("Product:  " + prod );
    	break;
      case'/':
    	if(num2!=0) {
    	Double quot = num1/num2;
    	System.out.println("Quotient:  " + quot );
    	break;
    	}else {
    		System.out.println("You cannot divide a number with zero");
    		break;
    	}
      case'%':
    	Double remain = num1%num2;
    	System.out.println("Remainder  " + remain );
    	break;
      default:
    	  System.out.println("Not a valid operator");
      }
    	  
    	  
    	  
    	
    	
      }
      
      
      
    		  
    		  
	}


