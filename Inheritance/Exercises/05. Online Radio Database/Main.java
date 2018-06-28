package inheritance_exercises.onlineRadioDatabase_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main
    (String[]args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int number = Integer.parseInt(reader.readLine());
        int totalSongLength = 0;
        int songsCounter = 0;

        int index = 0;
        while (index < number) {
            String[] songTokens = reader.readLine().split(";");
            try {
                int songMinutes = Math.toIntExact(Long.valueOf(songTokens[2].split(":")[0]));
                int songSeconds = Math.toIntExact(Long.valueOf(songTokens[2].split(":")[1]));

                Song currentSong = new Song(songTokens[0], songTokens[1], songMinutes, songSeconds);
                
                totalSongLength += songSeconds + (songMinutes * 60);
                songsCounter++;
                System.out.println("Song added.");
            }catch (NumberFormatException e) {
                System.out.println("Invalid song length.");
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
            index++;
        }
        System.out.println("Songs added: " + songsCounter);
        System.out.println("Playlist length: " + convertSeconds(totalSongLength));
    }

    private static String convertSeconds() {
        return convertSeconds();
    }

    private static String convertSeconds(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        return hours + "h " + minutes + "m " + seconds + "s";
    }
}