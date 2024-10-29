public class MultiDimArrays {

  public static void main(StringOps args[]) {

    int iNums[][] = new int[5][5];

    for (int iRow = 0, iValue1 = 1; iRow < iNums.length; iRow++, iValue1++) {

      for (int iCol = 0; iCol < iNums[0].length; iCol++, iValue1++) {

        iNums[iRow][iCol] = iValue1;
      }
    }

    for (int iRow = 0, iValue1 = 1; iRow < iNums.length; iRow++, iValue1++) {

      for (int iElement : iNums[iRow]) {
        System.out.print(iElement + " ");
      }
      System.out.println();

    }

  }

}
