
public class Dog extends Pet {
    private String cins;
    
    
    Dog(String name, int age ,double weight, String c){
        super(name, age ,weight);
        cins=c;                            
    }

    
    public String getCins() {
        return cins;
    }

    
    public void setCins(String cins) {
        this.cins = cins;
    }
    
    public double ilac01Dozaj(){
        return (getAgirlik() / 2.2) * (0.03 / 10);
    }

    
    public double ilac02Dozaj(){
        return (getAgirlik() / 2.2) * (0.5 / 10);
    }
            
    public String toString(){
        return "tür : kopek " + " cins= " + cins + "" + super.toString();
    }
    
}
