package casting;
import java.util.Arrays;
import java.util.Scanner;

public class IncreasingSubseq {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size=s.nextInt();
		
		int[] array = new int[size];
		int[] temp = new int[size];
		int[] longsubseq = new int[size];
		
		System.out.println("Enter the elements of the array");
		
		for(int i=0;i<size;i++){
		array[i]=s.nextInt();
		}	
		System.out.println("User Array:  "+Arrays.toString(array));
		
		
		int n=0 ,c=0,length =0 , subseqcount=0;
		for(int i=0;i<size;i++) {
			n=i; c=0;
			for(int j=i	;j<size;j++) 
			{
				if(c==0) {
					temp[c]=array[i];
					c++;
				}
				
				if(array[n]< array[j]) {
					
					temp[c]=array[j];
					n=j;
					c++;
			    }				
							
			}
			
			if(length==c) {
				 subseqcount++;
				      if(subseqcount>=1) {
				    	  for(int k=0;k<length;k++) {
				  			 System.out.print(temp[k]+"  ");
				  		     }
				          System.out.println("Length  = " + length);
						}
			     
			}else {			
			
			if(length==0 || length < c){
				
			length = c;
			
			longsubseq = Arrays.copyOfRange(temp, 0, temp.length);
			
		      }
							
			}
		}
		
		for(int i=0;i<length;i++) {
			System.out.print(longsubseq[i]+"  ");
		}
					
		
		System.out.println("Length = " + length);
		int nosubseq = subseqcount +1;
		System.out.println("Number of longest subsequences:  "+ nosubseq );
		s.close();
	}
		}
		

	


