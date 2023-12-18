
package lab_work6;
import java.awt.Toolkit;
import java.util.Arrays;
import src.ArrayOrganization;
import src.Colour;
import src.OnScreenFunc;
import src.SelectionLab;

public class LabWork6 {
  public static void getStringByNumber(double[][] matrix) {
    int number;
    for (;;) {
      ArrayOrganization.printArray(matrix);
      System.out.println(
          Colour.RED_BOLD_BRIGHT + "Введите корректный номер строки!" + Colour.RESET);
      try {
        number = Integer.parseInt(SelectionLab.scan.nextLine());
        if (number > 0 & number <= matrix.length)
          break;
        OnScreenFunc.clearScreen();
      } catch (NumberFormatException e) {
        Toolkit.getDefaultToolkit().beep();
        OnScreenFunc.clearScreen();
        System.out.println(
            Colour.RED_BOLD_BRIGHT + "Вы ввели не число, потворите попытку! " + Colour.RESET);
      }
    }
    OnScreenFunc.clearScreen();
    ArrayOrganization.printArray(matrix);
    System.out.println();
    System.out.println(
        Colour.CYAN_BOLD_BRIGHT + "Ответ -> " + Arrays.toString(matrix[number - 1]) + Colour.RESET);
  }
}
