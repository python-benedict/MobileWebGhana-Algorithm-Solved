// Declaring a public class for the algorith to be solved
public class Test2{
  // Declaring a static method since we will return an integer
    public static int f(int[] a ){
      // Declaring variables x and y and initializing it to 0 respectively
      int  x = 0;
      int  y = 0;
      // looping through a with variable i
      for(int i : a){
        // checking the condition that if modulus 2 of i will be equal to 0
        if(i % 2 == 0){
          y += i;
        }
        // Getting the else part of the condition
          else{
            x += i;
          }
        }
      // returning the substraction of x and y
        return x - y;
      }
  
  
    public static void main(String[] args){
      int [] arr = {1,2,3};
      System.out.print(f(arr));
    }
  }

  //done