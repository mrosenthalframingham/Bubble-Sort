//Matt Rosenthal

class Main {
  public static void main(String[] args) 
  {

   int bubsort[] = {1, 5, 7, 11, 3, 8, 10, 15, 9, 10};


   for (int index = 0; index < bubsort.length - 1; index++ ) 
   {
     for (int i = 0; i < bubsort.length - index - 1; i++)
      
      //swapping if in wrong order
      if (bubsort[i] > bubsort[i + 1])
      {
        int y = bubsort[i];
        bubsort[i] = bubsort[i + 1];
        bubsort[i + 1] = y;
      }
   }
       //printing the sorted array
       for (int index = 0; index < bubsort.length; ++index)
            System.out.print(bubsort[index] + " ");
        System.out.println();
   }
}
