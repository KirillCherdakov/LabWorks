package src;

public class OnScreenFunc {
  static void drawTable(String[] arr) {
    // if (arr == Wallpaper.seeYa) {

    //     for (String tmp : arr) {
    //         System.out.println(Colour.BLUE_BACKGROUND_BRIGHT + Colour.CYAN_BOLD_BRIGHT + tmp);
    //     }
    //     System.out.print(Colour.RESET);
    // } else {

    for (String tmp : arr) {
      System.out.println(Colour.PURPLE_BACKGROUND + Colour.WHITE_BOLD_BRIGHT + tmp);
    }
    System.out.print(Colour.RESET);
  }

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}