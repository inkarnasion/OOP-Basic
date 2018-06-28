package definingClasses_exercises.PokemonTrainer_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        LinkedHashMap<String, Trainer> trainers = new LinkedHashMap<>();

        while (true){
            String[] pokemonTokens = reader.readLine().split("\\s+");
            if ("Tournament".equals(pokemonTokens[0])) break;

            String trainerName = pokemonTokens[0];
            String pokemonName = pokemonTokens[1];
            String pokemonElement = pokemonTokens[2];
            Integer pokemonHealth = Integer.valueOf(pokemonTokens[3]);

            Trainer trainer = new Trainer(trainerName);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            trainer.adPokemon(pokemon);

            if (trainers.containsKey(trainerName)) {
                trainers.get(trainerName).adPokemon(pokemon);
            } else {
                trainers.put(trainerName, trainer);
            }
        }

        while (true) {
            String element = reader.readLine();
            if ("End".equals(element)) break;
            trainers.keySet().forEach(s -> {
                if (trainers.get(s).checkForElement(element)) {
                    trainers.get(s).adBadge();
                } else {
                    trainers.get(s).increaseHealth();
                }
            });
        }

        List<Map.Entry<String, Trainer>> toSort = new ArrayList<>(trainers.entrySet());
        toSort.sort((t1, t2) -> Integer.compare(t2.getValue().getNumberOfBadges(), t1.getValue().getNumberOfBadges()));
        for (Map.Entry<String, Trainer> trainer : toSort) {
            System.out.println(trainer.getValue());
        }
    }
}