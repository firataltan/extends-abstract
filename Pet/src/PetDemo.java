
public class PetDemo {

   
    public static void main(String[] args) {
       Pet[] pets = new Pet[4];
       
       
       pets[0] = new Cat("Garfield", 10, 20,"sari");
       pets[1] = new Cat("Mr. Whiskers", 3, 10,"siyah");
       pets[2] = new Dog("Odie", 8, 45,"golden");
       pets[3] = new Dog("Rex", 11, 65,"kurt");
       
       for (int i=0; i<pets.length; i++){
           
           System.out.println(pets[i].toString());
           System.out.println(pets[i].ilac01Dozaj());
           System.out.println(pets[i].ilac02Dozaj());
           
       }
    }
    
}
