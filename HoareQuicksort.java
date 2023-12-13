public class HoareQuicksort extends Sort {
	
	private <T extends Comparable<T>> int partition(T[] vector, ISortingOrder sorting, int low, int high) {
		T pivot=vector[low]; 
        
        int p=low-1;
        int q=high+1;
 
        while (true) {
        	
        	do {
        		p++;
        	} while (sorting.compare(vector[p], pivot) < 0);

        	do {
        		q--;
        	} while (sorting.compare(vector[q], pivot) > 0);
        	
        	if (p >= q)
        		return q;
        	
        	swap(vector, p, q);
        }
	}
		
	private <T extends Comparable<T>> void sort(T[] vector, ISortingOrder sorting, int low, int high) { 
		if (low < high) {
            int p = partition(vector, sorting, low, high);
                       
            sort(vector, sorting, low, p);
            sort(vector, sorting, p+1, high);
        }
	}
   

   @Override
   public <T extends Comparable<T>> void sort(T[] vector, ISortingOrder sorting) {
      sort(vector, sorting, 0, vector.length-1);
   }
    
}