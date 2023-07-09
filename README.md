# extends abstract
 soyut(abstract) bir sınıf tanımlama
1) EvcilHayvan isimli soyut(abstract) bir sınıf tanımlayınız. Bu sınıftaki değişkenler String
tipinde evcil hayvanın ismi, int tipinde evcil hayvanın yaşı ve double tipinde evcil hayvanın
ağırlığını "pound" ağırlık birimi olarak tutan değişkenlerdir. (Bilgi amaçlı not: 1 pound
yaklaşık 0,45 kg olup, aşağıda anlatılacak olan hesaplamalarda pound birimi kullanılacağı için
bu şekilde verilmiştir, sizin herhangi bir çevrim yapmanıza gerek yoktur.)
EvcilHayvan sınıfında:
Yapıcı (constructor) metot(lar) (en az bir constructor metot olmalıdır, tercihinize göre birden
fazla da yazabilirsiniz). Ayrıca, yaş ve ağırlığın negatif olmaması konusunda bir hata kontrolü
yapabilirsiniz.
Get ve set metotları
toString metodu
İki adet soyut (abstract) metot tanımı vardır. Bu metotlar şunlardır:
parametresi olmayan, double tipinde değer döndüren "ilac01Dozaj" isimli metot
parametresi olmayan, double tipinde değer döndüren "ilac02Dozaj" isimli metot
2) EvcilHayvan sınıfından kalıtım ile "Dog" isimli bir sınıf türetiniz. "Dog" sınıfında String
tipinde köpeğin cinsini belirten bir değişken vardır. Bunun dışında aşağıdaki metotları
yazmanız gerekmektedir:
Yapıcı (constructor) metot(lar)
Get ve set metodu
toString metodu
Üst sınıfta soyut olarak tanımlanan metotların köpekler için gerçekleştirimleri şu şekilde
olacaktır:
ilac01Dozaj metodu, (getWeight() / 2.2) * (0.03 / 10) şeklinde,
ilac02Dozaj metodu, (getWeight() / 2.2) * (0.5 / 12) şeklinde
dozaj değerlerini hesaplayarak döndürecektir.
3) EvcilHayvan sınıfından kalıtım ile "Cat" isimli bir sınıf türetiniz. "Cat" sınıfında String
tipinde kedinin rengini belirten bir renk değişkeni vardır. Bunun dışında aşağıdaki metotları
yazmanız gerekmektedir:
Yapıcı (constructor) metot(lar)
Get ve set metodu
toString metodu
Üst sınıfta soyut olarak tanımlanan metotların kediler için gerçekleştirimleri şu şekilde
olacaktır:
ilac01Dozaj metodu, (getWeight() / 2.2) * (0.002 / 10) şeklinde,
ilac02Dozaj metodu, (getWeight() / 2.2) * (0.25 / 12) şeklinde
dozaj değerlerini hesaplayarak döndürecektir.
4) EvcilHayvanDemo isimli bir deneme sınıfı yazınız. Bu sınıfın içinde main metot vardır ve
bu main metot içinde aşağıda belirtilenleri yapınız.
EvcilHayvan tipinde 4 uzunluğunda bir dizi tanımlayınız.
İki adet "Cat" ve iki adet "Dog" nesnesi oluşturarak, bu nesneleri yukarıda tanımladığınız
diziye ekleyiniz. (Bilgileri klavyeden girmek zorunda değilsiniz!).
Bir döngü içinde oluşturduğunuz her bir kedi veya köpek nesnesi için o nesneye ilişkin
bilgiler ile o nesne için ilaç1 ve ilaç2 dozajlarını yazdırınız.
