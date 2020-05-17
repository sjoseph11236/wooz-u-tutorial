public class SongInfo {
  
  private String songName; 
  private String bandName; 
  private int yearReleased; 

  public SongInfo(String newSongName, String newBandName, int newYearReleased) {
    this.songName = newSongName; 
    this.bandName = newBandName;
    this.yearReleased = newYearReleased;
  }

  public String getSongName() { return this.songName; }
  public String getBandName() { return this.bandName; }
  public int getYearReleased() { return this.yearReleased; }
}