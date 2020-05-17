import java.util.*;

public class SongsOfThe90s implements SongIterator {

  Hashtable <Integer, SongInfo> bestSongs;
  int hashKey = 0;

  public SongsOfThe90s() {

    this.bestSongs = new Hashtable<>(); 


    addSong("Losing My Religion", "REM", 1991);
    addSong("Creep", "Radiohead", 1993);
    addSong("Walk on the Ocean", "Toad the Wep Sprocket", 1991);
    System.out.println("This is the ArrayList: " +  this.bestSongs);
  }

  public void addSong(String songName,String bandName, int yearReleased) {

    // Instantiated an object from the songInfo class
    SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

    bestSongs.put(hashKey, songInfo);
    
    this.hashKey++;
  }

  /*
  public Hashtable<Integer, SongInfo> getBestSongs() {
    return this.bestSongs;
  }
  */

  public Iterator createIterator() {
    return this.bestSongs.values().iterator(); 
  }
}