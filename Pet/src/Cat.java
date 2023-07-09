
public class Cat  extends Pet{
    private String renk;
    
    Cat(String name, int age ,double weight, String r) {
        super(name, age , weight);
        renk=r;
        
    }

    
    public String getRenk() {
        return renk;
    }

    
    public void setRenk(String renk) {
        this.renk = renk;
    }
    
    public double ilac01Dozaj(){
        return (getAgirlik() / 2.2) * (0.002 / 10);
    }
    public double ilac02Dozaj(){
        return (getAgirlik() / 2.2) * (0.025 / 10);        
    }
    public String toString(){
        return "tür: kedi " + "renk: " + renk + super.toString();
        
        
    }
    
    
}
