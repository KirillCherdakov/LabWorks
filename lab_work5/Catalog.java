package lab_work5;

import java.util.ArrayList;

public class Catalog {
  private ArrayList<File> files;

  public Catalog(ArrayList<File> files) {
    this.files = files;
  }

  public int сountTheNumberOfAudioFiles() {
    int audioFilesCount = 0;
    for (File file : files)
      if (file instanceof AudioFile)
        ++audioFilesCount;

    return audioFilesCount;
  }

  public int сountTheNumberOfVideoFiles() {
    int videoFilesCount = 0;
    for (File file : files)
      if (file instanceof VideoFile)
        ++videoFilesCount;

    return videoFilesCount;
  }
}