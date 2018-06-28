package definingClasses_exercises.Google_09;

public class Children {
    private String childName;
    private String childBirthday;

    public Children(String childName, String childBirthday) {
        this.childName = childName;
        this.childBirthday = childBirthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.childName, this.childBirthday);
    }
}