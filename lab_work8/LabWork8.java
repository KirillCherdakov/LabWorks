package lab_work8;

import java.awt.Toolkit;
import src.Colour;
import src.OnScreenFunc;
import src.SelectionLab;

public class LabWork8 {
  public static void getColourCode() {
    System.out.println(
        Colour.CYAN_BOLD_BRIGHT + "Введите шестнадцатиричный идентификатор цвета HTML");
    System.out.print("> ");
    String useHexColour = SelectionLab.scan.nextLine();
    for (;;) {
      if (!isValidHexadecimal(useHexColour)) {
        OnScreenFunc.clearScreen();
        Toolkit.getDefaultToolkit().beep();
        System.out.println(Colour.RED_BOLD_BRIGHT
            + "Вы ввели некорректный идентификатор!\nПовторите попытку или нажмите b - для возврата к меню"
            + Colour.RESET);
        System.out.print("> ");
        useHexColour = SelectionLab.scan.nextLine();
        if (useHexColour.equals("b")) {
          break;
        }

      } else {
        OnScreenFunc.clearScreen();
        System.out.println(useHexColour + Colour.YELLOW_BOLD_BRIGHT
            + " Является корректным идентификатором HTML" + Colour.RESET);
        break;
      }
    }
  }

  private static boolean isValidHexadecimal(String colourCode) {
    String regExp = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
    return colourCode.matches(regExp);
  }
}
