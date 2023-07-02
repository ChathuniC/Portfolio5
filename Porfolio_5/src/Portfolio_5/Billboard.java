package Portfolio_5;

import java.util.Date;

public class Billboard {
	  private int id;
	  private int rank;
	  private Date date;
	  private String artist;
	  private String songname;
	  private int lastweek;
	  private int weeksonchart;
	  private int peakrank;

	  public Billboard (int id, int rank, Date date, String artist, String songname, int lastweek, int weeksonchart, int peakrank) {
	    this.id = id;
	    this.rank = rank;
	    this.date = date;
	    this.artist = artist;
	    this.songname = songname;
	    this.lastweek = lastweek;
	    this.weeksonchart = weeksonchart;
	    this.peakrank = peakrank;
	  }

	  public String toString() {
	    return String.format("%-10d%-5d%-55s%-30s%10d%10d", id, rank, artist, songname, weeksonchart, peakrank);
	  }

	  public int getID() {
	    return id;
	  }

	  public void setID(int id) {
	    this.id = id;
	  }

	  public int getRank() {
	    return rank;
	  }

	  public void setRank(int rank) {
	    this.rank = rank;
	  }

	  public Date getDate() {
	    return date;
	  }

	  public void setDate(Date date) {
	    this.date = date;
	  }

	  public String getArtist() {
	    return artist;
	  }

	  public void setArtist(String artist) {
	    this.artist = artist;
	  }

	  public String getSongname() {
	    return songname;
	  }

	  public void setSongname(String songname) {
	    this.songname = songname;
	  }

	  public int getLastweek() {
	    return lastweek;
	  }

	  public void setLastweek(int lastweek) {
	    this.lastweek = lastweek;
	  }

	  public int getWeeksonchart() {
	    return weeksonchart;
	  }

	  public void setWeeksonchart(int weeksonchart) {
	    this.weeksonchart = weeksonchart;
	  }

	  public int getPeakrank() {
	    return peakrank;
	  }

	  public void setPeakrank(int peakrank) {
	    this.peakrank = peakrank;
	  }
	  
	  public int compareTo(Billboard c) {
		    return ((Integer) peakrank).compareTo(c.peakrank);
		  }

}
