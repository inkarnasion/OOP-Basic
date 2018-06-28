package inheritance_exercises.mordorsCrueltyParty_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main
    (String[]args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] foods = reader.readLine().split("\\s+");
        MoodFactory moods = new MoodFactory();
        Arrays.stream(foods).forEachOrdered(moods::eat);

        System.out.println(moods);
    }
}