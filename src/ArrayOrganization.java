
package src;

import java.awt.Toolkit;
import java.util.Arrays;
import java.util.Random;
import lab_work4.LabWork4;
import lab_work6.LabWork6;

public class ArrayOrganization {
  public static void printArray(int[][] mas) {
    // Arrays.stream(mas).map(Arrays::toString).forEach(System.out::println);
    for (int i = 0; i < mas.length; ++i) {
      System.out.printf("Строка № %-5d= ", i + 1);
      System.out.println(Arrays.toString(mas[i]));
    }
  }

  public static void printArray(double[][] mas) {
    // Arrays.stream(mas).map(Arrays::toString).forEach(System.out::println);
    for (int i = 0; i < mas.length; ++i) {
      System.out.printf("Строка № %-5d= ", i + 1);
      System.out.println(Arrays.toString(mas[i]));
    }
  }

  public static void useUserInput(String userSelectedTask) {
    int rowsCount = getRowsFromTheUser();
    int columnsCount = getColumnsFromTheUser(rowsCount);
    double[][] twoDimArray1 = new double[rowsCount][columnsCount];

    for (int row = 0; row < twoDimArray1.length; ++row) {
      for (int column = 0; column < twoDimArray1[row].length; ++column) {
        for (;;) {
          System.out.print("Введите элемент массива: ");
          try {
            System.out.printf("Arr[%d][%d] = ", row, column);
            twoDimArray1[row][column] = Double.parseDouble(SelectionLab.scan.nextLine());
            break;
          } catch (NumberFormatException e) {
            Toolkit.getDefaultToolkit().beep();
            System.out.println(Colour.RED_BOLD_BRIGHT
                + "Введен некорректный элемент массива, повторите попытку!" + Colour.RESET);
          }
        }
      }
    }
    OnScreenFunc.clearScreen();
    if (userSelectedTask.equals("4"))
      LabWork4.findRowsWithTheSameSumOfElements2(twoDimArray1);
    else
      LabWork6.getStringByNumber(twoDimArray1);
  }

  public static void fillArrayWithRandomNumbers(String userSelectedTask) {
    int rowsCount = getRowsFromTheUser();
    int columnsCount = getColumnsFromTheUser(rowsCount);
    Random rand = new Random();
    double[][] twoDimArray2 = new double[rowsCount][columnsCount];
    for (int row = 0; row < twoDimArray2.length; ++row) {
      for (int column = 0; column < twoDimArray2[row].length; ++column) {
        twoDimArray2[row][column] = rand.nextInt(100) + 1; // [1..100]
      }
    }
    OnScreenFunc.clearScreen();
    if (userSelectedTask.equals("4"))
      LabWork4.findRowsWithTheSameSumOfElements2(twoDimArray2);
    else
      LabWork6.getStringByNumber(twoDimArray2);
  }

  public static void useConstantArray(String userSelectedTask) {
    final double[][] twoDimArray3 = {{99, 32, 100, 334, -23}, {85, -78, 3, 52, -11},
        {37, -118, 69, 421, 3}, {19, 220, 181, -42, 51}, {-71, 223, 13, -162, 57}};
    OnScreenFunc.clearScreen();
    if (userSelectedTask.equals("4"))
      LabWork4.findRowsWithTheSameSumOfElements2(twoDimArray3);
    else
      LabWork6.getStringByNumber(twoDimArray3);
  }

  // public static int getDimensionOfMatrix() {
  // int dimension;
  // do {
  // System.out.println(Colour.RED_BOLD_BRIGHT + "Введите корректное число
  // строк/столбцов!" + Colour.RESET);
  // while (!Main.scan.hasNextInt()) {
  // Toolkit.getDefaultToolkit().beep();
  // System.out.println(Colour.RED_BOLD_BRIGHT + "Вы ввели не число!" +
  // Colour.RESET);
  // Main.scan.next();
  // }
  // dimension = Main.scan.nextInt();

  // } while (dimension <= 0);

  // return dimension;
  // }

  private static int getRowsFromTheUser() {
    System.out.println(Colour.BLACK_BOLD_BRIGHT + "Введите кол-во строк ");
    System.out.print("> " + Colour.RESET);
    String rowCount = SelectionLab.scan.nextLine();
    for (;;) {
      if (!isValidDimensionOfMatrix(rowCount)) {
        OnScreenFunc.clearScreen();
        Toolkit.getDefaultToolkit().beep();
        System.out.println(
            Colour.BLACK_BOLD_BRIGHT + "Вы ввели некорректное число строк, повторите попытку!");
        System.out.print("> " + Colour.RESET);
        rowCount = SelectionLab.scan.nextLine();
      } else {
        return Integer.parseInt(rowCount);
      }
    }
  }

  private static int getColumnsFromTheUser(int rowCount) {
    System.out.println(Colour.BLACK_BOLD_BRIGHT + "Введите кол-во столбцов ");
    System.out.print("> " + Colour.RESET);
    String columnCount = SelectionLab.scan.nextLine();
    for (;;) {
      if (!isValidDimensionOfMatrix(columnCount)) {
        OnScreenFunc.clearScreen();
        Toolkit.getDefaultToolkit().beep();
        System.out.println(Colour.BLACK_BOLD_BRIGHT + "Кол-во строк: ");
        System.out.println("> " + rowCount + Colour.RESET);
        System.out.println(
            Colour.BLACK_BOLD_BRIGHT + "Вы ввели некорректное число столбцов, повторите попытку!");
        System.out.print("> " + Colour.RESET);
        columnCount = SelectionLab.scan.nextLine();
      } else {
        return Integer.parseInt(columnCount);
      }
    }
  }

  public static boolean isValidDimensionOfMatrix(String dimension) {
    String regExp = "^\\d+$";
    return dimension.matches(regExp);
  }
}