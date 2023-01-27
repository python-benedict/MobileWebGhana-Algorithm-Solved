// Declaring a public class for the algorith to be solved
public class Test3{
    // Declaring a static integer to get the character array, a zero based start position and a length 
    public static char[ ] f(char[ ] val, int start, int length){
        // checking the condition if a is null or empty or start is less than 0, or length is also less than zero or start is greater or equal to the character array or length is greater or equal to the character array too or the addition of length and start is also greater than the character array
      if(val == null || start < 0 || length < 0 || start >= val.length || length >= val.length || length+start > val.length)
      // returning null after the condition
      return null;
      // we are declaring an array of arr and initializing it's value to that of the variable lenght
      char[] arr = new char[length];
      // declaring a variable b to be equal to 0
      int b = 0;
      // looping through arr with 1 equals the start value, and also less than the addition of length and start and afterwards incrementing it 
      for(int i=start; i<length+start; i++){
        // checking if the initial value of the array arr is equal to the array a
        arr[b] = val[i];
        // incrementing it while it's true
        b++;
      }
      // returning the array
      return arr;
    }
  
    // Declaring another static method with void since we don't wanna return anything
    public static void main(String [] args){
        // declaring a character array of val
      char[] val = {'a', 'b', 'c'};
      // declaring a character array of val2
      char[] val2 = f(val,1,2);
      // checking the condition if val2 is null
      if(val2 == null)
      // Printing the out put as null
      System.out.print("null");
      else{
        // Printing the output as the value of val2
        System.out.print(val2);
      }
    }
  
  }