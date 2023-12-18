package lab_work5;

public class AudioFile extends File {
  private String audioСomposer;
  private String fileType;

  public AudioFile() {
    super();
    this.audioСomposer = "No name";
    this.fileType = "Empty";
  }

  public AudioFile(String audioComposer, String fileType) {
    super();
    this.audioСomposer = audioComposer;
    this.fileType = fileType;
  }

  public AudioFile(String fileName, long atime, long mtime, long ctime, String owner, int fileSize,
      String audioComposer) {
    super(fileName, atime, mtime, ctime, owner, fileSize);
    this.audioСomposer = audioComposer;
  }

  public void setAudioComposer(String audioComposer) {
    this.audioСomposer = audioComposer;
  }

  public String getAudioComposer() {
    return this.audioСomposer;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  public String getFileType() {
    return this.fileType;
  }
}