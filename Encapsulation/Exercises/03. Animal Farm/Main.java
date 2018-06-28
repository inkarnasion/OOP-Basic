package encapsulation_exercises.AnimalFarm_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main
    (String[]args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String chickenName= reader.readLine();
        int chickenAge=Integer.parseInt(reader.readLine());

   try  {
       Chicken chicken = new Chicken(chickenName,chickenAge);
       System.out.println(chicken.toString());
   }catch (IllegalArgumentException ex){
       System.out.println(ex.getMessage());
   }
    }
}
