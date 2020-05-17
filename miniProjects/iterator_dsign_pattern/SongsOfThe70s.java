import java.util.*;

public class SongsOfThe70s implements SongIterator {

  ArrayList<SongInfo> bestSongs; 

  public SongsOfThe70s() {

    this.bestSongs = new ArrayList<SongInfo>();

    addSong("Imagine", "John Lennon", 1971);
    addSong("American Pie", "Don McLean", 1971);
    addSong("I Will Survive", "Gloria Gaynor", 1979);
  }

  public void addSong(String songName,String bandName, int yearReleased) {

    // Instantiated an object from the songInfo class
    SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

    bestSongs.add(songInfo);
  }

  /*
  public ArrayList<SongInfo> getBestSongs() {
    return this.bestSongs;
  } */

  public Iterator createIterator() {
    return bestSongs.iterator(); 
  }
}