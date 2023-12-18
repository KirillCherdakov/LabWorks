package src;

import java.awt.Toolkit;

public class OptionMenu {
  static void selectOptionMenu(String userSelectedTask) {
    String menuItem;
    for (;;) {
      OnScreenFunc.drawTable(Wallpaper.frames);
      System.out.print(Colour.RED_BOLD_BRIGHT + "kirill🎭fedora > " + Colour.RESET);
      menuItem = SelectionLab.scan.nextLine();
      switch (menuItem) {
                case "1" -> {
                    OnScreenFunc.clearScreen();
                    ArrayOrganization.useUserInput(userSelectedTask);
                }
                case "2" -> {
                    OnScreenFunc.clearScreen();
                    ArrayOrganization.fillArrayWithRandomNumbers(userSelectedTask);
                }
                case "3" -> {
                    OnScreenFunc.clearScreen();
                    ArrayOrganization.useConstantArray(userSelectedTask);
                }
                // case 'q' -> {
                // OnScreenFunc.clearScreen();
                // System.out.println(Colour.GREEN_BOLD_BRIGHT + "Завершение работы
                // программы..." + Colour.RESET);
                // OnScreenFunc.drawTable(Wallpaper.seeYa);
                // //Main.scan.close();
                // System.exit(0);
                // }
                case "b" -> {
                    OnScreenFunc.clearScreen();
                    break;
                }
                default -> {
                    OnScreenFunc.clearScreen();
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println(Colour.RED_BOLD_BRIGHT + "Выбран некорректный пункт меню, повторите попытку!");
                    break;
                }
            }
            if (menuItem.equals("b")) {
                break;
            }
        }
    }
}