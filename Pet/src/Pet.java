

public abstract class Pet {
    private String isim;
    private int yas;
    private double agirlik;
    
    public Pet(String name, int age ,double weight ){
        isim= new String(name);
        setYas(age);
        setAgirlik(weight);
        
    
}

 
    public String getIsim() {
        return isim;
    }

   
    public void setIsim(String isim) {
        this.isim = isim;
    }

    
    public int getYas() {
        return yas;
    }

    
    public void setYas(int yas) {
        if (yas<0){
            System.out.println(" Hata: Yaş negatif değer arasında olamaz. "); 
            System.exit(0);
        }
        else 
            this.yas=yas;

    }
    public double getAgirlik() {
        return agirlik;
    }

    
    public void setAgirlik(double agirlik) {
        if (agirlik<0){
            System.out.println("Hata: ağırlık negatif değer alamaz.");
            System.exit(0);
        }
        else 
            this.agirlik=agirlik;
    }
    
    public String toString(){
        return " İsim: " + isim + " Yaş: " + yas + " Ağırlik: " + agirlik ;
    }
    public abstract double ilac01Dozaj();
    public abstract double ilac02Dozaj();
   

    

    

   
    
}
    
    
    

