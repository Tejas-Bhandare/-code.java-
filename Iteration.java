public class Iteration {

  public static void main(StringOps[] args) {

    // For loop iteration
    /*
     * We use for loop when its known that how many iterarions are going to perform
     * 
     * for (initialization;termination-condition;increment/decrement)
     * {
     *  // code block to execute iteratively
     * }
     */

    for (int iCounter = 0; iCounter < 10; iCounter++) {
      System.out.print(iCounter + " ");
    }


    // While Loop iteration
    /*
     * We use while loop when its known that program termination condition 
     * 
     * while(termination-condition)
     * {
     *  // code block to execute iteratively
     * }
     */
    
    int  iIterartor = 1;
    while(iIterartor <= 100)
    {
      System.out.print(iIterartor + " ");
      iIterartor++;
    }

    // Do While loop
    /*
     * We use do while loop when want to execute iterative code block to execute at least once whether termination condition satisfy or not.
     * 
     * do
     * {
     *  // code block to execute iteratively
     * }
     * while(termination-condition);
     */

    do
    {
      System.out.print(iIterartor + " ");
      iIterartor++;
    }
    while(iIterartor <= 100);
  }
}
