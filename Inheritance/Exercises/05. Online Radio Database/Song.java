package inheritance_exercises.onlineRadioDatabase_05;

public class Song {
  private   String artistName;
  private   String songName;
    private int minutes;
    private int seconds;

    public Song(String artistName, String songName, long minutes, long seconds) {
        this.setArtistName(artistName);
        this.setSongName(songName);
        this.setMinutes((int) minutes);
        this.setSeconds((int) seconds);
    }


    private void setSongName(String songName) {
        if (songName.length() < 3 || songName.length() > 30) {
            throw new IllegalArgumentException("Song name should be between 3 and 30 symbols.");
        }
        this.songName=songName;
    }

    private void setArtistName(String artistName) {
        if (artistName.length() < 3 || artistName.length() > 20) {
            throw new IllegalArgumentException("Artist name should be between 3 and 20 symbols.");
        }
        this.artistName = artistName;
    }

    private void setMinutes(int minutes) {
        if (minutes > 14 || minutes < 0) {
            throw new IllegalArgumentException("Song minutes should be between 0 and 14.");
        }
        this.minutes=minutes;
    }

    private void setSeconds(int seconds) {
        if (seconds > 59 || seconds < 0) {
            throw new IllegalArgumentException("Song seconds should be between 0 and 59.");
        }
        this.seconds=seconds;
    }
}
