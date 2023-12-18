package lab_work9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import src.OnScreenFunc;
import src.SelectionLab;
// import src.ArrayOrganization;
// import src.Colour;
// import src.OnScreenFunc;
// import java.awt.Toolkit;

public class LabWork9 {
  public static void getValuesOfList() {
    List<Integer> link = new ArrayList<Integer>();
    System.out.println("Введите элементы списка, максимальный размер 10!\n");
    while (link.size() != 10) {
      System.out.print("Элемент: ");
      try {
        link.add(Integer.parseInt(SelectionLab.scan.nextLine()));
      } catch (NumberFormatException e) {
        System.out.println("Некорректный ввод!");
      }
    }
    OnScreenFunc.clearScreen();
    System.out.println(link.toString());
    List<Integer> result = link.stream().sorted((o1, o2) -> o2).collect(Collectors.toList());
    System.out.println(result);
  }

  // public static void getValuesOfList2() {
  //   List<Double> link = new ArrayList<Double>();
  //   System.out.println("Введите размер списка");
  //   System.out.println("> ");
  //   String listSize = SelectionLab.scan.nextLine();
  //   for (;;) {
  //     if (!ArrayOrganization.isValidDimensionOfMatrix(listSize)) {
  //       OnScreenFunc.clearScreen();
  //       Toolkit.getDefaultToolkit().beep();
  //       System.out.println(
  //           Colour.BLACK_BOLD_BRIGHT + "Вы ввели некорректный размер списка, повторите
  //           попытку!");
  //       System.out.print("> " + Colour.RESET);
  //       listSize = SelectionLab.scan.nextLine();
  //     }else
  //     {
  //       while(link.size() != Integer.parseInt(listSize))
  //       {
  //               try {

  //       link.add(Double.parseDouble(SelectionLab.scan.nextLine()));
  //     } catch (NumberFormatException e) {
  //       System.out.println("некорректно!");
  //     }
  //       }
  //     }
  //   }
  // }
}