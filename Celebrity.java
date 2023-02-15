public class Celebrity{
    String heritage;
    String name;
    String gender;
    String age ;
    String hairColor;
    String deceased;
    String profession;

    Celebrity(String hairColor, String name, String age, String gender, String heritage, String deceased, String profession){
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
        return(this.heritage);
    }
    public String getdeceased(){
        return(this.deceased);
    }
    public String getprofession(){
        return(this.profession);
    }
   
}