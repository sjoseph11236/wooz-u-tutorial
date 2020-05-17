import java.util.*;

public class SongsOfThe80s implements SongIterator{

  SongInfo[] bestSongs;
  int arrayValue = 0;

  public SongsOfThe80s() {

    this.bestSongs = new SongInfo[3];

    addSong("Room", "852s", 1989);
    addSong("Cruel Summer", "Bananarama", 1984);
    addSong("Head Over Heels", "Tears for Fears", 1985);
    System.out.println("This is the ArrayList: " +  this.bestSongs);
  }

  public void addSong(String songName,String bandName, int yearReleased) {

    // Instantiated an object from the songInfo class
    SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

    bestSongs[arrayValue] = songInfo; 
    
    this.arrayValue++;
  }

  /*
  public SongInfo[]  getBestSongs() {
    return this.bestSongs;
  } 
  */

  public Iterator createIterator() {
    return Arrays.asList(this.bestSongs).iterator(); 
  }
}