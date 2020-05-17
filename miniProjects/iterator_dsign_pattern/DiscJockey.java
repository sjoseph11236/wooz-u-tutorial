import java.util.*;

public class DiscJockey{
  
  SongsOfThe70s songs70s;
  SongsOfThe80s songs80s;
  SongsOfThe90s songs90s;

  SongIterator iter70sSongs;
  SongIterator iter80sSongs;
  SongIterator iter90sSongs;

  // public DiscJockey(SongsOfThe70s songs70s, SongsOfThe80s songs80s, SongsOfThe90s songs90s) {
    
  //   this.songs70s = songs70s;
  //   this.songs80s = songs80s;
  //   this.songs90s = songs90s; 
  // }

  public DiscJockey(SongIterator iter70sSongs,SongIterator iter80sSongs, SongIterator iter90sSongs ) {
    
    this.iter70sSongs = iter70sSongs;
    this.iter80sSongs = iter80sSongs;
    this.iter90sSongs = iter90sSongs;
  }

  // WHAT NOT TO Do 
  // public void showTheSongs() {
  //   ArrayList all70sSongs = songs70s.getBestSongs();

  //   System.out.println("Songs of the 70s\n");
    
  //   for(int i = 0; i < all70sSongs.size(); i++) {

  //     SongInfo songInfo = (SongInfo) all70sSongs.get(i);

  //     System.out.println(songInfo.getSongName());
  //     System.out.println(songInfo.getBandName());
  //     System.out.println(songInfo.getYearReleased());
  //   }

  //   SongInfo[] all80sSongs = songs80s.getBestSongs();

  //   System.out.println("Songs of the 80s\n");
    
  //   for(int i = 0; i < all80sSongs.length; i++) {

  //     SongInfo songInfo =  all80sSongs[i];

  //     System.out.println(songInfo.getSongName());
  //     System.out.println(songInfo.getBandName());
  //     System.out.println(songInfo.getYearReleased());
  //   }

  //   Hashtable<Integer, SongInfo> all90sSongs = songs90s.getBestSongs();

  //   System.out.println("Songs of the 90s\n");
    
  //   for(Enumeration<Integer>  e = all90sSongs.keys(); e.hasMoreElements();) {

  //     SongInfo songInfo =  all90sSongs.get(e.nextElement());

  //     System.out.println(songInfo.getSongName());
  //     System.out.println(songInfo.getBandName());
  //     System.out.println(songInfo.getYearReleased());
  //   }
  // }
  
  public void  showTheSongs() {
    Iterator songs70s = iter70sSongs.createIterator();
    Iterator songs80s = iter80sSongs.createIterator();
    Iterator songs90s = iter90sSongs.createIterator();

    System.out.println("----Songs of the 70s\n");
    printTheSongs(songs70s);

    System.out.println("----Songs of the 80s\n");
    printTheSongs(songs80s);

    System.out.println("----Songs of the 90s\n");
    printTheSongs(songs90s);
  }

  public void printTheSongs(Iterator iterator) {

    while(iterator.hasNext()) {

      SongInfo songInfo = (SongInfo) iterator.next();

      System.out.println(songInfo.getSongName());
      System.out.println(songInfo.getBandName());
      System.out.println(songInfo.getYearReleased());
    }
  }
}