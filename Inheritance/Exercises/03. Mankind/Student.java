package inheritance_exercises.mankind_03;

public class Student extends Human {
    private String facilityNumber;

    protected Student(String firstName, String lastName,String facilityNumber) {
        super(firstName, lastName);
        this.setFacilityNumber(facilityNumber);
    }
    private void setFacilityNumber(String facilityNumber){
        String toCheck=String.valueOf(facilityNumber);
        if(toCheck.length()>=5 && toCheck.length()<=10){
            this.facilityNumber=facilityNumber;
        }else{
            throw new  IllegalArgumentException("Invalid faculty number!");
        }
    }
    @Override
    public String toString(){
        return String.format("First Name: %s\nLast Name: %s\nFaculty number: %s\n",getFirstName(),getLastName(),this.facilityNumber);
    }
}
