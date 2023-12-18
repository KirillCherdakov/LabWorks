package lab_work1;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class LabWork1 {
  public static void openLabWork1() {
    try {
      if (Desktop.isDesktopSupported()) {
        Desktop.getDesktop().open(new File("lab_work1/ЛабРаб1.docx"));
      }
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
  }
}