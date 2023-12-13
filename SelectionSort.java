public class SelectionSort extends Sort {

   @Override
   public  <T extends Comparable<T>> void sort(T[] vector, ISortingOrder sorting) {
    for (int i=0; i<vector.length-1; i++) {  
        int p = i; 
        
        for (int j=i+1; j<vector.length; j++) { 
            if (sorting.compare(vector[j], vector[p]) < 0){  
                p = j; 
            }
        }  

        if (p != i) 
            swap(vector, i, p);
    }
   }
    
}
