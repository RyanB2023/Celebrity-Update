import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class Main{
    
    public static void main (String [] args){
        
        Scanner readMe = new Scanner(System.in);
        int num  = (int) Math.random()*9;
        System.out.println("GUESS THE CELEBRITY. Here are the traits you can guess : hair color,  name,  age,  gender,  heritage,  deceased,  profession. (all lowercase except for names)");
    }
   
    
        
        Celebrity RobinWilliams = new Celebrity("brown", "Robin Williams", 63, "male", "american", true, "actor");
        Celebrity KevinHart = new Celebrity("brown", "Kevin Hart", 43, "male", "american", false, "actor");
        Celebrity MargotRobbie = new Celebrity("blond", "Margot Robbie", 32, "female", "english", false, "actor");
        Celebrity SerenaWilliams = new Celebrity("brown", "Serena Williams", 41, "female", "american", false, "tenis");
        Celebrity CristianoRonaldo = new Celebrity("brown", "Cristiano Ronaldo", 37, "male", "portuguese", false, "soccer");
        Celebrity JalenHurts = new Celebrity("brown", "Jalen Hurts", 24, "male", "american", false, "football");
        Celebrity Rihanna = new Celebrity("brown", "Rihanna", 34, "female", "american", false, "singer");
        Celebrity MeganFox = new Celebrity("brown", "Megan Fox", 36, "female", "american", false, "actor");
        Celebrity NickiMinaj = new Celebrity("brown", "Nicki Minaj", 36, "female", "american", false, "singer");
        Celebrity JoeBiden = new Celebrity("gray", "Joe Biden", 80, "male", "american", false, "polititian");
        
        ArrayList <Celebrity> nameBank = new ArrayList <Celebrity>(Arrays.asList(RobinWilliams,KevinHart,MargotRobbie,SerenaWilliams,CristianoRonaldo,JalenHurts,Rihanna,MeganFox,NickiMinaj,JoeBiden)); 

        String[] traitList = {"hair color,  name,  age,  gender,  heritage,  deceased,  profession"};

    public String pickATrait(String trait){
        for (int i = 0; i>=traitList.length; i++){
            if(trait.equals(traitList[i])){
            System.out.println("guess the Celebrity's "+trait);
            }
            else{
            return("that is not a trait that you can Guess. choose another one");

        }

    }
        
 }
    public String guess(){

    }

}