package encapsulation_exercises.footballTeamGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main
    (String[]args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Team> teams = new HashMap<>();

        while (true){
            String[] command = reader.readLine().split(";");
            if ("END".equals(command[0]))break;
            try {
                switch (command[0]) {
                    case "Team":
                        teams.put(command[1], new Team(command[1]));
                        break;
                    case "Rating":
                        if (teams.containsKey(command[1])) {
                            System.out.println(teams.get(command[1]));
                        } else {
                            System.out.println("Team " + command[1] + " does not exist.");
                        }
                        break;
                    case "Add":
                        if (teams.containsKey(command[1])) {
                            teams.get(command[1]).addPlayer(new Player(command[2], Double.valueOf(command[3]), Double.valueOf(command[4]),
                                    Double.valueOf(command[5]), Double.valueOf(command[6]), Double.valueOf(command[7])));
                        } else {
                            System.out.println("Team " + command[1] + " does not exist.");
                        }
                        break;
                    case "Remove":
                        if (teams.containsKey(command[1])) {
                            teams.get(command[1]).removePlayer(command[2]);
                        } else {
                            System.out.println("Team " + command[1] + " does not exist.");
                        }
                        break;
                }
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}