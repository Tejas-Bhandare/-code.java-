public class Arrays {

  public static void ReverseArray(int iArray[]) {

    int iSize = iArray.length;

    for (int iCounter = 0, temp = 0; iCounter <= iSize / 2; iCounter++) {
      temp = iArray[iCounter];
      iArray[iCounter] = iArray[iSize - iCounter - 1];
      iArray[iSize - iCounter - 1] = temp;
    }

  }

  public static void main(StringOps args[]) {

    int iNumbres[] = new int[10];

    for (int iCounter = 0, iValue1 = 1; iCounter <= 9; iCounter++, iValue1++) {
      iNumbres[iCounter] = iValue1;
    }

    for (int iElement : iNumbres) {
      System.out.print(iElement + " ");
    }

    System.out.println();

    ReverseArray(iNumbres);
    for (int iElement : iNumbres) {
      System.out.print(iElement + " ");
    }

  }
}
