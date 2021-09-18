package casting;

import java.util.ArrayList;

public class BinarySearchArrayList {
	
		
		public  int BinarySearch(ArrayList<Integer> array,int key1) {
			 int min = 0;
			 int max = array.size();
			 int mid;
			 int key = key1;
			while (min <= max) {
				mid = (min + max) / 2;
				if (array.get(mid).compareTo(key) < 0)
				{
					min = mid + 1; 
				} 
				else if (array.get(mid).compareTo(key) > 0)
				{
					max = mid - 1;
				} else {
					return mid;
				}
			}
			return -1;
		}
	}

