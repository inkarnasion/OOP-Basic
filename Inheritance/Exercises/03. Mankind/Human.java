package inheritance_exercises.mankind_03;

public class Human {
    private String firstName;
    private String lastName;

    protected String getFirstName() {
        return firstName;
    }
    protected String getLastName() {
        return lastName;
    }

    protected Human(String firstName, String lastName){
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }
    private void setFirstName(String firstName){
        char[] word=firstName.toCharArray();
        if(Character.isUpperCase(word[0])){
        }else{
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        }
        if(word.length>=4){
        }else{
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }
        this.firstName=firstName;
    }
    private void setLastName(String lastName){
        char[] word=lastName.toCharArray();
        if(Character.isUpperCase(word[0])){
        }else{
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        }
        if(word.length>=3){
        }else{
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        }
        this.lastName=lastName;
    }

}