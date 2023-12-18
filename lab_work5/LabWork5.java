package lab_work5;

import java.util.ArrayList;

public class LabWork5 {
  public static void lab5() {
    ArrayList<File> files = new ArrayList<File>();

    for (int i = 0; i < 3; ++i) {
      AudioFile audioFile = new AudioFile("Music_Author" + (i + 1), "Audio");
      files.add(audioFile);
      VideoFile videoFile = new VideoFile("Video_Author" + (i + 1), "Video");
      files.add(videoFile);
    }

    Catalog catalog = new Catalog(files);

    System.out.println("Общее кол-во файлов: "
        + Integer.valueOf(
            catalog.сountTheNumberOfAudioFiles() + catalog.сountTheNumberOfVideoFiles()));
    System.out.println("Кол-во аудиофайлов: " + catalog.сountTheNumberOfAudioFiles());
    System.out.println("Кол-во видеофайлов: " + catalog.сountTheNumberOfVideoFiles());

    for (File file : files) {
      if (file instanceof AudioFile) {
        AudioFile audio = (AudioFile) file;
        System.out.println("Имя файла: " + audio.getFileName() + "; atime: " + audio.getATime()
            + "; mtime: " + audio.getMTime() + "; ctime: " + audio.getCTime()
            + "; Владелец: " + audio.getOwner() + "; Размер файла: " + audio.getFileSize()
            + "; Композитор: " + audio.getAudioComposer() + "; Тип: " + audio.getFileType());
      } else {
        VideoFile video = (VideoFile) file;
        System.out.println("Имя файла: " + video.getFileName() + "; atime: " + video.getATime()
            + "; mtime: " + video.getMTime() + "; ctime: " + video.getCTime()
            + "; Владелец: " + video.getOwner() + "; Размер файла: " + video.getFileSize()
            + "; Композитор: " + video.getVideoComposer() + "; Тип: " + video.getFileType());
      }
    }
  }
}