public class Celebrity{
    String eyeColor;
    String name;
    String gender;
    double height;
    String hairColor;
    boolean deceased;
    String profession;

    Celebrity(String hairColor, String name, int age, String gender, String heritage, boolean deceased, String profession){
        this.hairColor = hairColor;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.heritage=heritage;
        this.deceased=deceased;
        this.profession=profession;
    }

    public String gethairColor(){
        return(this.hairColor);
    }
    public String getname(){
        return(this.name);
    }
    public String getage(){
        return(this.age);
    }
    public String getgender(){
        return(this.gender);
    }
    public String getheritage(){
        return(this.race);
    }
    public boolean getdeceased(){
        return(this.deceased);
    }
    public String getprofession(){
        return(this.profession);
    }
   
}