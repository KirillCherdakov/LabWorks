package lab_work5;

public class VideoFile extends File {
  private String videoComposer;
  private String fileType;

  public VideoFile() {
    super();
    this.videoComposer = "No name";
    this.fileType = "Empty";
  }

  public VideoFile(String videoComposer, String fileType) {
    super();
    this.videoComposer = videoComposer;
    this.fileType = fileType;
  }

  public VideoFile(String fileName, long atime, long mtime, long ctime, String owner, int fileSize,
      String videoComposer) {
    super(fileName, atime, mtime, ctime, owner, fileSize);
    this.videoComposer = videoComposer;
  }

  public void setVideoComposer(String videoComposer) {
    this.videoComposer = videoComposer;
  }

  public String getVideoComposer() {
    return this.videoComposer;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public String getFileType() {
    return this.fileType;
  }
}