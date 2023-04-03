package week3week4codingassignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Week3week4codingassignment {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    /*Coding Steps — Arrays and Methods
    1.  Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
    */
        // Creation of an ages array
    int[] ages = new int [9];
      ages[0] = 3;
      ages[1] = 9;
      ages[2] = 23;
      ages[3] = 64;
      ages[4] = 2;
      ages[5] = 8;
      ages[6] = 28;
      ages[7] = 56;
      ages[8] = 93;
   /*
    
    a.  Programmatically subtract the value of the first element in the array from the value in the last 
          element of the array (i.e. do not use ages[7] in your code). Print the result to the console.        
   */    // output will be 90 where the last index of array minus the first index of an array.
      
            int difference = ages[ages.length -1] - ages[0];
      System.out.println("The age difference is " + difference);
    
 /* 
      b.  Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
 */
      
 /*
     c.  Use a loop to iterate through the array and calculate the average age. Print the result to the console.
 */ // output will be 31 where variable sum is divided by the iteration of array ages.length.
      
      int sum = 0;
      for (int i=0; i<ages.length; i++) {
       sum += ages[i]; 
     }
      int avgAge = sum / ages.length;
      System.out.println("The average age is " + avgAge);
     
   /*2.  Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
    */
      // creation of String array names.
      String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
     
    
   /* a.  Use a loop to iterate through the array and calculate the average number of letters per name. 
          Print the result to the console.*/
      //output is 3 where variable sum1 is divided by the iteration of array.length. 
      
      int sum1 = 0;
        for(int i=0; i<names.length; i++) {
          sum1 += names[i].length();
        }
        int avgName = sum1 / names.length;
        System.out.println("The average number of letters is " + avgName);
      
   /* b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, 
          and print the result to the console. */
        // prints out conNames with names concatenated and space in between names.
        
        String conNames ="";
          for(int i=0; i<names.length; i++) {
            conNames += names[i] + " ";
          } System.out.println(conNames);

  //3.How do you access the last element of any array?
          
        //System.out.println(array[array.length-1]);
          
   // 4.How do you access the first element of any array?
    
      // System.out.println(array[0];
    
      
    // 5.  Create a new array of int called nameLengths. Write a loop to iterate over the previously created names 
    // array and add the length of each name to the nameLengths array.
       //output is [3, 5, 3, 5, 4, 3] where index of nameLengths equals names.length. Arrays.toString will return contents of int array into a string.
          
          int[] nameLengths = new int[names.length];
          for(int i=0; i<names.length; i++) {
            nameLengths[i] = names[i].length();
          }
          System.out.println(Arrays.toString(nameLengths));
         
   
    // 6.  Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
    // Print the result to the console.
      // output is 23 where the sum equals of iteration of addName variable and nameLengths.length.
          
        int addName = 0;
        for(int j=0; j<nameLengths.length; j++) {
          addName = addName + nameLengths[j];
        }
         System.out.println("The sum of the elements in the nameLengths array is " + addName);
         
    // 7.  Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to 
     // itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
         // output is string and number of times string printed
         
    System.out.println(theWordEn("3 weeks of practicing loops is making me frustrated! \n", 2));
      
    // 8.  Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should 
       // be the first and the last name as a String separated by a space).
      // output is String firtName: Pixie and String lastName:Dust separated by a space.
    
    System.out.println(aFullName("Pixie", "Dust"));
    
    // 9.  Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
      // output is true to sum of all integers in array is greater than 100.
    
    int[] disArray = {12,23,34,45,56,67,78,90};
    boolean result = anyArray(disArray);
    System.out.println(result);
    
    // 10. Write a method that takes an array of double and returns the average of all the elements in the array.
    
      // output is 36.0 for an array of double 
    double[] arrOfDouble = {12, 23, 34, 45, 67};
    System.out.println(rtnAverage(arrOfDouble));
    
    // 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first 
       // array is greater than the average of the elements in the second array.
    
      // output is true for the average of array one greater than array two
    double[] oneArray = {99,88,77,66};
    double[] twoArray = {11,22,33,44,55};
    boolean results = twoArrDouble(oneArray, twoArray); 
    System.out.println(results);
    
    // 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns 
       // true if it is hot outside and if moneyInPocket is greater than 10.50.
      // output is false for boolean willBuyDrink
    
    boolean needColdDrink = willBuyDrink(true, 6.00 );
    System.out.println(needColdDrink);
    
    
    //13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it. 
    // outputs day of week with corresponding hours a day
    
    String[] weekDay = {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};
    int[] lotsOfHours = new int [7];
      lotsOfHours[0] = 3;
      lotsOfHours[1] = 3; 
      lotsOfHours[3] = 2;
      lotsOfHours[4] = 1;
      lotsOfHours[5] = 4;
      lotsOfHours[6] = 2;
     
    System.out.println(hoursADay(weekDay, lotsOfHours));
     
  } // end of main method
   
  //#7. 
  public static String theWordEn (String word, int n) {
   String addedWord = "";
   for(int i = 0; i < n; i++ ) {
     addedWord += word; 
   }
   
    return addedWord;
  }
  
  //#8. 
  public static String aFullName (String first, String last) {
  return first + " " + last + " " ;  
  }
  
  //#9.
  public static boolean anyArray (int[] arr) {
    int sum =0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
      return sum > 100; 
  }

  
  //#10. 
  public static double rtnAverage (double[] avgElements) {
    int sumOne = 0;
      for(int i = 0; i < avgElements.length; i++) {
        sumOne += avgElements[i];
       
      }
      return sumOne / avgElements.length;
  }
  
  //#11
  public static boolean twoArrDouble (double[] arrOne, double[] arrTwo) {
     double result1 = 0; 
     double result2 = 0;
       for (int i = 0; i < arrOne.length; i++) {
         result1 += arrOne[i] / arrOne.length; 
       }
       for (int i = 0; i < arrTwo.length; i++) {
         result1 += arrTwo[i] / arrTwo.length; 
        
  }
  return result1 > result2; 
  }
  
  //#12. 
  public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
    if(isHotOutside == true && moneyInPocket > 10.50) {
      return true; 
    } else {
        return false;
    } 
  }
  
  //#13. 
  public static String hoursADay (String[] dayOfWeek, int[] hours) {
    String whatDays = " ";
    int amountOfHours = 0;
    
    for(int i = 0; i < dayOfWeek.length; i++) {
      whatDays += dayOfWeek[i] + ":" + hours[i] + " ";
    }   
      return whatDays;
  }
  

} // end of class method
