
package src;

import java.awt.Toolkit;
import java.util.Scanner;
import lab_work1.LabWork1;
import lab_work10.LabWork10;
import lab_work5.LabWork5;
import lab_work8.LabWork8;
import lab_work9.LabWork9;

public class SelectionLab {
  public static Scanner scan = new Scanner(System.in);
  double b = Double.parseDouble("2.0");

  static void selectTask() {
    String userSelectedTask;
    for (;;) {
      OnScreenFunc.drawTable(Wallpaper.tasks);
      System.out.print(Colour.RED_BOLD_BRIGHT + "kirill🎭fedora > " + Colour.RESET);
      userSelectedTask = scan.nextLine();
      switch (userSelectedTask) {
                case "1" -> {
                    OnScreenFunc.clearScreen();
                    LabWork1.openLabWork1();
                }
                case "4" -> {
                    OnScreenFunc.clearScreen();
                    OptionMenu.selectOptionMenu(userSelectedTask);
                }
                case "5" -> {
                    OnScreenFunc.clearScreen();
                    LabWork5.lab5();
                }
                case "6" -> {
                    OnScreenFunc.clearScreen();
                    OptionMenu.selectOptionMenu(userSelectedTask);
                }
                case "8" -> {
                    OnScreenFunc.clearScreen();
                    LabWork8.getColourCode();
                }
                case "9" -> {
                    OnScreenFunc.clearScreen();
                    LabWork9.getValuesOfList();
                }
                case "10" -> {
                    OnScreenFunc.clearScreen();
                    LabWork10.lab5();
                }
                case "q" -> {
                    OnScreenFunc.clearScreen();
                    System.out.println(Colour.GREEN_BOLD_BRIGHT + "Завершение работы программы..." + Colour.RESET);
                    OnScreenFunc.drawTable(Wallpaper.seeYa);
                    scan.close();
                    System.exit(0);
                }
                default -> {
                    OnScreenFunc.clearScreen();
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println(Colour.RED_BOLD_BRIGHT + "Выбрано некорректное задание, повторите попытку!");
                }
            }
        }
    }
}