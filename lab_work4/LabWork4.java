package lab_work4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import src.ArrayOrganization;
import src.Colour;

public class LabWork4 {
  public static void findRowsWithTheSameSumOfElements2(double[][] twoDimArray) {
    ArrayOrganization.printArray(twoDimArray);
    double[] rowSums = new double[twoDimArray.length];
    double sumOfElementsOfOneLine = 0;
    for (int row = 0; row < twoDimArray.length; ++row) {
      for (int column = 0; column < twoDimArray[row].length; ++column) {
        sumOfElementsOfOneLine += twoDimArray[row][column];
      }
      rowSums[row] = sumOfElementsOfOneLine;
      sumOfElementsOfOneLine = 0;
    }
    Set<Double> uniqueElementsOfRowSums = new TreeSet<Double>();
    for (double tmp : rowSums) {
      uniqueElementsOfRowSums.add(tmp);
    }
    if (rowSums.length == uniqueElementsOfRowSums.size()) {
      System.out.println(
          Colour.BLACK_BOLD_BRIGHT + "Нет строк с одинаковой суммой элементов!" + Colour.RESET);
    } else {
      long counter = 0;
      List<Integer> newArray = new ArrayList<Integer>();
      for (Double tmp : uniqueElementsOfRowSums) {
        for (int i = 0; i < rowSums.length; ++i) {
          if (rowSums[i] == tmp) {
            newArray.add(i);
            ++counter;
          }
        }
        if (counter >= 2) {
          // System.out.print(Colour.BLACK_BOLD_BRIGHT + "Сумму " + tmp + " Имеют строки: ");
          System.out.printf(Colour.BLACK_BOLD_BRIGHT + "Сумму %-4.2f имеют строки: ", tmp);
          for (Integer tmp2 : newArray) {
            System.out.print(tmp2 + 1 + " ");
          }
          System.out.println(Colour.RESET);
        }
        counter = 0;
        newArray.clear();
      }
    }
  }
}