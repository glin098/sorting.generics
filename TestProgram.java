public class TestProgram {

   private static <T> String vectorToString(String text, T[] vector) {
      String s = text + " {";

      for (int i=0; i < vector.length; i++)
         s = s + vector[i].toString() + ((i < vector.length - 1) ? ", " : "");

      s = s + "}";

      return s;
   }
    
   public static void main(String[] args) {

      Integer [] numbers = {3, 11, 1, 5, 9, 10, 15, 25, 2, 8, 7, 13, 6, 4, 30};        
      Integer [] arrayOfInteger;
        
      Double [] decimals = {3.5, 11.0, 1.5, 5.75, 9.0, 10.5, 15.0, 25.5, 2.25, 8.5, 7.0, 13.5, 6.25, 4.0, 30.5};
      Double [] arrayOfDouble;
        
      System.out.println(vectorToString("Numbers          ", numbers));        
      System.out.println(vectorToString("Decimals         ", decimals));    

      IPerson [] people = new Person [] { new Person(50, "John", "Smith"), new Person(20, "Jane", "Johnson"),
                                          new Person(10, "Mary", "White"), new Person(40, "Peter", "Collins"),
                                          new Person(30, "Julia", "Smith") };
      IPerson [] arrayOfPerson;
        
      System.out.println(vectorToString("People           ", people) + "\n");

      // Bubble sort
        
      ISort bubbleSort = new BubbleSort();
        
      arrayOfInteger = numbers.clone();
        
      bubbleSort.sort(arrayOfInteger, new AscendingOrder());
      System.out.println(vectorToString("Bubble sort      ", arrayOfInteger));
      bubbleSort.sort(arrayOfInteger, new DescendingOrder());
      System.out.println(vectorToString("Bubble sort      ", arrayOfInteger) + "\n");
                
      arrayOfDouble = decimals.clone();
        
      bubbleSort.sort(arrayOfDouble, new AscendingOrder());
      System.out.println(vectorToString("Bubble sort      ", arrayOfDouble)); 
      bubbleSort.sort(arrayOfDouble, new DescendingOrder());
      System.out.println(vectorToString("Bubble sort      ", arrayOfDouble) + "\n");
        
      arrayOfPerson = people.clone();
        
      bubbleSort.sort(arrayOfPerson, new AscendingOrder());
      System.out.println(vectorToString("Bubble sort      ", arrayOfPerson)); 
      bubbleSort.sort(arrayOfPerson, new DescendingOrder());
      System.out.println(vectorToString("Bubble sort      ", arrayOfPerson) + "\n");

      // Selection sort
        
      ISort selectionSort = new SelectionSort();
        
      arrayOfInteger = numbers.clone();
        
      selectionSort.sort(arrayOfInteger, new AscendingOrder());
      System.out.println(vectorToString("Selection sort      ", arrayOfInteger));
      selectionSort.sort(arrayOfInteger, new DescendingOrder());
      System.out.println(vectorToString("Selection sort      ", arrayOfInteger) + "\n");
                
      arrayOfDouble = decimals.clone();
        
      selectionSort.sort(arrayOfDouble, new AscendingOrder());
      System.out.println(vectorToString("Selection sort      ", arrayOfDouble)); 
      selectionSort.sort(arrayOfDouble, new DescendingOrder());
      System.out.println(vectorToString("Selection sort      ", arrayOfDouble) + "\n");
        
      arrayOfPerson = people.clone();
        
      selectionSort.sort(arrayOfPerson, new AscendingOrder());
      System.out.println(vectorToString("Selection sort      ", arrayOfPerson)); 
      selectionSort.sort(arrayOfPerson, new DescendingOrder());
      System.out.println(vectorToString("Selection sort      ", arrayOfPerson) + "\n");

      // Insertion sort
        
      ISort insertionSort = new InsertionSort();
        
      arrayOfInteger = numbers.clone();
        
      insertionSort.sort(arrayOfInteger, new AscendingOrder());
      System.out.println(vectorToString("Insertion sort      ", arrayOfInteger));
      insertionSort.sort(arrayOfInteger, new DescendingOrder());
      System.out.println(vectorToString("Insertion sort      ", arrayOfInteger) + "\n");
                
      arrayOfDouble = decimals.clone();
        
      insertionSort.sort(arrayOfDouble, new AscendingOrder());
      System.out.println(vectorToString("Insertion sort      ", arrayOfDouble)); 
      insertionSort.sort(arrayOfDouble, new DescendingOrder());
      System.out.println(vectorToString("Insertion sort      ", arrayOfDouble) + "\n");
        
      arrayOfPerson = people.clone();
        
      insertionSort.sort(arrayOfPerson, new AscendingOrder());
      System.out.println(vectorToString("Insertion sort      ", arrayOfPerson)); 
      insertionSort.sort(arrayOfPerson, new DescendingOrder());
      System.out.println(vectorToString("Insertion sort      ", arrayOfPerson) + "\n");
      

      // Lomuto's Quicksort
        
      ISort lomutoQuicksort = new LomutoQuicksort();
        
      arrayOfInteger = numbers.clone();
        
      lomutoQuicksort.sort(arrayOfInteger, new AscendingOrder());
      System.out.println(vectorToString("Lomutos Quicksort      ", arrayOfInteger));
      lomutoQuicksort.sort(arrayOfInteger, new DescendingOrder());
      System.out.println(vectorToString("Lomutos Quicksort     ", arrayOfInteger) + "\n");
                
      arrayOfDouble = decimals.clone();
        
      lomutoQuicksort.sort(arrayOfDouble, new AscendingOrder());
      System.out.println(vectorToString("Lomutos Quicksort      ", arrayOfDouble)); 
      lomutoQuicksort.sort(arrayOfDouble, new DescendingOrder());
      System.out.println(vectorToString("Lomutos Quicksort     ", arrayOfDouble) + "\n");
        
      arrayOfPerson = people.clone();
        
      lomutoQuicksort.sort(arrayOfPerson, new AscendingOrder());
      System.out.println(vectorToString("Lomutos Quicksort      ", arrayOfPerson)); 
      lomutoQuicksort.sort(arrayOfPerson, new DescendingOrder());
      System.out.println(vectorToString("Lomutos Quicksort      ", arrayOfPerson) + "\n");

      // Hoare's Quicksort
        
      ISort hoareQuicksort = new HoareQuicksort();
        
      arrayOfInteger = numbers.clone();
        
      hoareQuicksort.sort(arrayOfInteger, new AscendingOrder());
      System.out.println(vectorToString("Hoare Quicksort      ", arrayOfInteger));
      hoareQuicksort.sort(arrayOfInteger, new DescendingOrder());
      System.out.println(vectorToString("Hoare Quicksort     ", arrayOfInteger) + "\n");
                
      arrayOfDouble = decimals.clone();
        
      hoareQuicksort.sort(arrayOfDouble, new AscendingOrder());
      System.out.println(vectorToString("Hoare Quicksort      ", arrayOfDouble)); 
      hoareQuicksort.sort(arrayOfDouble, new DescendingOrder());
      System.out.println(vectorToString("Hoare Quicksort     ", arrayOfDouble) + "\n");
        
      arrayOfPerson = people.clone();
        
      hoareQuicksort.sort(arrayOfPerson, new AscendingOrder());
      System.out.println(vectorToString("Hoare Quicksort      ", arrayOfPerson)); 
      hoareQuicksort.sort(arrayOfPerson, new DescendingOrder());
      System.out.println(vectorToString("Hoare Quicksort      ", arrayOfPerson) + "\n");
      
   }
   
}
