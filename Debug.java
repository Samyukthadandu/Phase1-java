package casting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Debug {
	

	
	    public static void main(String[] args) {
	        /*System.out.println("Hello World!");*/
	        System.out.println("\n**************************************\n");
	        System.out.println("\tWelcome to TheDesk \n");	        
	        System.out.println("**************************************");       
	           
	        lists();
	
	    }
	    public static void lists() {
	    ArrayList<Integer> expenses = new ArrayList<Integer>(); 
		   
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);
    	ArrayList<Integer> arrlist = (ArrayList<Integer>)expenses.clone();      
        optionsSelection(arrlist,expenses);
	    }
	    private static void optionsSelection(ArrayList<Integer> arrlist1, ArrayList<Integer> expenses1) {
	     
	    	int options=0;
	    	int sort=0, search=0;
	    	boolean data =false, flag=false;
	    	int c =0;
			do {
	        int[] arr1 = {1,2,3,4,5,6};
	        int  slen = arr1.length;
	      
	        	String[] arr = {"1. I wish to review my expenditure",
		                "2. I wish to add my expenditure",
		                "3. I wish to delete my expenditure",
		                "4. I wish to sort the expenditures",
		                "5. I wish to search for a particular expenditure",
		                "6. Close the application"
		        };
		      
		       
		        for(int i=0; i<slen;i++){
		            System.out.println(arr[i]);
		            // display the all the Strings mentioned in the String array
		        }
		        System.out.println("\nEnter your choice:\t");
		        Scanner sc = new Scanner(System.in);
		        try {
		          options =  sc.nextInt();
	           
	                switch (options){
	                    case 1:
	                    	if(c>=1) {
	                    		arrlist1 = (ArrayList<Integer>)expenses1.clone();	
	                    	}
	                        System.out.println("Your saved expenses are listed below: \n");
	                        System.out.println(expenses1+"\n");	                      
	                        break;
	                    case 2:
	                    	 boolean ans = expenses1.isEmpty();
		                        if (ans == true)
		                    	 {
		                    		 arrlist1.clear(); 
		                    		  arrlist1 = (ArrayList<Integer>)expenses1.clone();
		                    		  flag=true;
		                    	 }
	                        System.out.println("Enter the value to add your Expense: \n");
	                        int value = sc.nextInt();
	                        expenses1.add(value);
	                        System.out.println("Your value is updated\n");
	                        arrlist1.add(value);
	                       
	                        System.out.println(expenses1+"\n");                     
	                        break;
	                    case 3:	                    	
	                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
	                        int con_choice = sc.nextInt();
	                        if(con_choice==options){
	                               expenses1.clear();
	                            System.out.println(expenses1+"\n");
	                            System.out.println("All your expenses are erased!\n");
	                        } else {
	                            System.out.println("Oops... try again!");
	                        }
	                        search=1;
	                        sort=1;
	                        data=true;
	                        flag=false;	                       
	                        break;
	                    case 4:	                    	
	                    	if(data==true && search==1 && flag==false) {	                    		
	                    		
	                    		System.out.println("You have deleted your expenses data.");
	                    		System.out.println("Do you want to restore your data and then sort?"+"yes/no : ");
	                    		String ch = sc.next();
	                    		System.out.println(ch);
	                    		if(ch.equalsIgnoreCase("yes")) {
	                    			 sort=0;
	                    			sortExpenses(arrlist1);
	                    			System.out.println("            ");
	                    			 expenses1 = (ArrayList<Integer>)arrlist1.clone();
	                    			break;
	                    		}else {
	                    			sort=1;
	                    			System.out.println("Thankyou");
	                    			c++;
	                    			break;
	                    			}
	                    		
	                    	}else {
	                    		 expenses1 = (ArrayList<Integer>)arrlist1.clone();
	                    		sortExpenses(expenses1);
	                    		System.out.println("       "); 
	                    	}	                    	
	                       break;
	                    case 5:
	                    	
	                    	if(data==true && sort==1 && flag==false) {
	                    		
	                    		System.out.println("You have deleted your expenses data.");
	                    		System.out.println("Do you want to restore your data and then search?"+"yes/no : ");
	                    		String ch = sc.next();
	                    		if(ch.equalsIgnoreCase("yes")) {
	                    			 search=0;
	                    			System.out.println("Enter the expense you need to search:\t");
	    	            	        int exp =sc.nextInt();
	                    		   searchExpenses(arrlist1,exp);
	                    		   System.out.println("            ");
	                    		   expenses1 = (ArrayList<Integer>)arrlist1.clone();
	                    			break;
	                    		}else
	                    			search=1;
	                    			System.out.println("Thankyou");
	                    			c++;
	                    			break;
	                    	}else {        
	                                    	
	                    		 expenses1 = (ArrayList<Integer>)arrlist1.clone();                    	
	                    	System.out.println("Enter the expense you need to search:\t");
	            	        int exp =sc.nextInt();
	            	        searchExpenses(expenses1,exp);
	                    	}	            	     
	                        break;
	                    case 6:
	                        closeApp();
	                        break;
	                    default:
	                        System.out.println("You have made an invalid choice!");
	                        break;
	                }
		        }catch(InputMismatchException e)
		        {
		        	sc.next();
		        	System.out.println("\n"+"Integer input expected");
		        	System.out.println("                ");
		        }
	           
	    	}while(options!=6);

	    }
	    private static void closeApp() {
	        System.out.println("Closing your application... \nThank you!");
	            }
	    private static void searchExpenses(ArrayList<Integer> arrayList, int exp1) {
	        int leng = arrayList.size();
	        BinarySearchArrayList qs = new BinarySearchArrayList();
	        Collections.sort(arrayList);      //CASE SENSITIVITY added
	    	for(int s1:arrayList) {
		    	   System.out.println(s1);
		       }
	    	int result= qs.BinarySearch(arrayList,exp1);
	    	if (result == -1) {
	    		System.out.println("                             ");
	            System.out.println("The value you entered does not exist");
	            
	            }
	        else {
	        	System.out.println("                             ");
	            System.out.println("Expense found at index  " +result);}
			
		 }
	    
	       
	    
	    private static void sortExpenses(ArrayList<Integer> arrayList) {
	        int arrlength =  arrayList.size();
	        int lb = 0;
	        int ub =arrlength-1;
	        QuickSortArrayList qs = new QuickSortArrayList();
	       qs.sortpartitions( arrayList, lb, ub);
	       qs.printArray(arrayList);	      
	    }
	}



