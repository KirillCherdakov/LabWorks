package lab_work5;

public class File {
  private String fileName;
  private long atime;
  private long mtime;
  private long ctime;
  private String owner;
  private int fileSize;

  public File() {
    this("No name", 1698357600, 1698357660, 1698357720, "Kirill", 8192);
  }

  public File(String fileName, long atime, long mtime, long ctime, String owner, int fileSize) {
    this.fileName = fileName;
    this.atime = atime;
    this.mtime = mtime;
    this.ctime = ctime;
    this.owner = owner;
    this.fileSize = fileSize;
  }

  public void setFileName(String filename) {
    this.fileName = filename;
  }

  public void setATime(long atime) {
    this.atime = atime;
  }

  public void setMTime(long mtime) {
    this.mtime = mtime;
  }

  public void setCTime(long ctime) {
    this.ctime = ctime;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public void setFileSize(int fileSize) {
    this.fileSize = fileSize;
  }

  public String getFileName() {
    return this.fileName;
  }

  public long getATime() {
    return this.atime;
  }

  public long getMTime() {
    return this.mtime;
  }

  public long getCTime() {
    return this.ctime;
  }

  public String getOwner() {
    return this.owner;
  }

  public int getFileSize() {
    return this.fileSize;
  }
}