package inheritance_exercises.mordorsCrueltyParty_04;

public class MoodFactory {
    private int happiness;

    @Override
    public String toString() {
        return this.getHappiness() + System.lineSeparator() + this.getMood();
    }

    public void eat(String food) {
        if ("cram".equals(food.toLowerCase())) {
            this.happiness += 2;

        } else if ("lembas".equals(food.toLowerCase())) {
            this.happiness += 3;

        } else if ("melon".equals(food.toLowerCase()) || "apple".equals(food.toLowerCase())) {
            this.happiness += 1;

        } else if ("honeycake".equals(food.toLowerCase())) {
            this.happiness += 5;

        } else if ("mushrooms".equals(food.toLowerCase())) {
            this.happiness -= 10;

        } else {
            this.happiness -= 1;

        }
    }

    private String getMood() {
        int happiness = this.getHappiness();
        if (happiness < -5) {
            return "Angry";
        } else if (happiness < 0) {
            return "Sad";
        } else if (happiness < 15) {
            return "Happy";
        }
        return "JavaScript";
    }

    private int getHappiness() {
        return this.happiness;
    }
}