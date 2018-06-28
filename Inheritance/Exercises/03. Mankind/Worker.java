package inheritance_exercises.mankind_03;

public class Worker extends Human {
    private double weekSalary;
    private double workHours;

    protected Worker(String firstName, String lastName,double weekSalary,double workHours) {
        super(firstName, lastName);
        this.setLastName(lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHours(workHours);
    }
    private void setLastName(String lastname){
        if(lastname.length()>3){
        }else{
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
    }
    private void setWeekSalary(double weekSalary){
        if(weekSalary>10){
            this.weekSalary=weekSalary;
        }else{
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }

    }
    private void setWorkHours(double workHours){
        if(workHours>=1 && workHours<=12){
            this.workHours=workHours;
        }else{
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
    }
    @Override
    public String toString(){
        return String.format("First Name: %s\nLast Name: %s\nWeek Salary: %.2f\nHours per day: %.2f\nSalary per hour: %.2f"
                ,getFirstName(),getLastName(),this.weekSalary,this.workHours,this.weekSalary/7/this.workHours);
    }
}
