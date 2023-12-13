public class LomutoQuicksort extends Sort {
	
	private <T extends Comparable<T>> int partition(T[] vector, ISortingOrder sorting, int low, int high) {
		T pivot=vector[high];

	    int p=low; 
	      
	    for(int q=low; q<high; q++)              
	    	if (sorting.compare(vector[q], pivot) < 0) {
	    		swap(vector, p, q);
	            p++; 
	        }

	    swap(vector, p, high);
	        
	    return p;
	}
		
	private <T extends Comparable<T>> void sort(T[] vector, ISortingOrder sorting, int low, int high) { 
		if (low < high) {
			int p = partition(vector, sorting, low, high);

			sort(vector, sorting, low, p-1);
			sort(vector, sorting, p+1, high);
	    }
	}
   

   @Override
   public <T extends Comparable<T>> void sort(T[] vector, ISortingOrder sorting) {
      sort(vector, sorting, 0, vector.length-1);
   }
    

}


	
	