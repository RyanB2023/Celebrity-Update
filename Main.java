import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class Main{
     
        Celebrity RobinWilliams = new Celebrity("brown", "Robin Williams", "63", "male", "american", "true", "actor");
        Celebrity KevinHart = new Celebrity("brown", "Kevin Hart", "43", "male", "american", "false", "actor");
        Celebrity MargotRobbie = new Celebrity("blond", "Margot Robbie", "32", "female", "english", "false", "actor");
        Celebrity SerenaWilliams = new Celebrity("brown", "Serena Williams", "41", "female", "american", "false", "tenis");
        Celebrity CristianoRonaldo = new Celebrity("brown", "Cristiano Ronaldo", "37", "male", "portuguese", "false", "soccer");
        Celebrity JalenHurts = new Celebrity("brown", "Jalen Hurts", "24", "male", "american", "false", "football");
        Celebrity Rihanna = new Celebrity("brown", "Rihanna", "34", "female", "american", "false", "singer");
        Celebrity MeganFox = new Celebrity("brown", "Megan Fox", "36", "female", "american", "false", "actor");
        Celebrity NickiMinaj = new Celebrity("brown", "Nicki Minaj", "36", "female", "american", "false", "singer");
        Celebrity JoeBiden = new Celebrity("gray", "Joe Biden", "80", "male", "american", "false", "polititian");
        
        ArrayList <Celebrity> nameBank = new ArrayList <Celebrity>(Arrays.asList(RobinWilliams,KevinHart,MargotRobbie,SerenaWilliams,CristianoRonaldo,JalenHurts,Rihanna,MeganFox,NickiMinaj,JoeBiden)); 

         String[] traitList = {"haircolor","name" ,"age" ,"gender" ,"heritage","deceased","profession"};


    public boolean pickATrait(Scanner input, Celebrity pick, boolean endGame){
         endGame=false;
      String trait= input.nextLine();
        for (int i = 0; i>=traitList.length; i++){
            if(trait.equals(traitList[i])){
            System.out.println("guess the Celebrity's "+trait);
            }
            else{
            System.out.println("that is not a trait that you can Guess. choose another one");

        }

    }
       

    if(trait.equals("haircolor")){
         
        String guess = input.nextLine();
        if( guess.equals(pick.gethairColor())){
            System.out.println("that is correct");
        } else  {
            System.out.println("that is not correct");
        }

    }
    else if(trait.equals("name")){
        String guess = input.nextLine();
        if(guess.equals(pick.getname())){
            System.out.println("THAT IS THE CORRECT CELEBRITY");
            endGame = true;
        } else  {
            System.out.println("that is not correct");
        }
    }
    else if(trait.equals("age")){
         
        String guess = input.nextLine();
        if( guess.equals(pick.getage())){
            System.out.println("that is correct");
        } else  {
            System.out.println("that is not correct");
        }
    }
    else if(trait.equals("gender")){
         
        String guess = input.nextLine();
        if( guess.equals(pick.getgender())){
            System.out.println("that is correct");
        } else  {
            System.out.println("that is not correct");
        }
    }
    else if(trait.equals("heritage")){
         
        String guess = input.nextLine();
        if( guess.equals(pick.getheritage())){
            System.out.println("that is correct");
        } else  {
            System.out.println("that is not correct");
        }
    }
    else if(trait.equals("deceased")){
         
        String guess = input.nextLine();
        if( guess.equals(pick.getdeceased())){
            System.out.println("that is correct");
        } else  {
            System.out.println("that is not correct");
        }
    }
    else if(trait.equals("profession")){
         
        String guess = input.nextLine();
        if( guess.equals(pick.getprofession())){
            System.out.println("that is correct");
        } else  {
            System.out.println("that is not correct");
        }
    }
    if ( endGame == true){
        System.out.println(" That is the correct Celebrity!!");
        return(endGame);
    }
    return(endGame);
 }
    
    

    public  void main (String [] args){
        int num  = (int) Math.random()*9;
        Celebrity gameCeleb = nameBank.get(num);
        boolean endGame = false;

       while(endGame == false){
        System.out.println("GUESS THE CELEBRITY. Here are the traits you can guess : haircolor,  name,  age,  gender,  heritage,  deceased,  profession. Choose a trait to guess.");
        Scanner readMe = new Scanner(System.in);
         endGame = pickATrait(readMe, gameCeleb, endGame);
       }
       
       

    }
   
    
       
    
        
    

}