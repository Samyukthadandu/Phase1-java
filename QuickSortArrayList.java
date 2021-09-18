package casting;

import java.util.ArrayList;

public class QuickSortArrayList {
	public int assignbounds(ArrayList<Integer> array1,int lb2,int ub2) {
		
		  
		   int pivot =array1.get(lb2);
		   int j= ub2;
		   int p = lb2;
		   int pivotindex=lb2;
		   do {
		   j=ub2;
		   for(int i=lb2;i<=j;i++) {
			   if(array1.get(i)<=pivot) {
				   if(i!=j) {
				   lb2++;
				   }
			   }else {
				   break;
			   }
			   }
			for(int k=j;k>=p;k--) {
				
				if(array1.get(k)>pivot) {
					//if(k!=lb2) {
					ub2--;
					//}
				}else {
					break;
				}
			}
			
			if(lb2<ub2) {
				int temp = array1.get(lb2);
				int temp2=array1.get(ub2);
				array1.set(lb2,temp2);
				array1.set(ub2,temp);
				
			}
			
		   }while(lb2<ub2);
		   
		   if(lb2>=ub2) {
				
				int temp = pivot;	
				int temp2=array1.get(ub2);				
				array1.set(pivotindex,temp2);
				array1.set(ub2,temp);
				
			}
			//System.out.println(array1);
			
			return ub2;
			}
	public  void printArray(ArrayList<Integer> arr)
	 {
		for(int a:arr ) {
			System.out.print("\n"+a+" ");
			
		}
	  }	
		  		   
		      
		 
		   
		  
	
	
	public void sortpartitions(ArrayList<Integer> array,int lb1,int ub1) {
    if(lb1<ub1) {
		int finalindex = assignbounds(array,lb1,ub1);
		//System.out.println(finalindex+"Element at that index"+array.get(finalindex));
		if(lb1!=finalindex-1) {
		sortpartitions(array,lb1,finalindex-1);
		}
		if(ub1!=finalindex+1) {	
		sortpartitions(array,finalindex+1,ub1);
		
		}
	}
	}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

