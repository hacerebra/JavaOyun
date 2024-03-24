//Hacer Ebra ÖZDEMİR 2121221045
package proje_1;
import java.util.Scanner;
public class Proje_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//bir scanner oluşturdum.
        String input;//bir string değer atadım.
        int myInt;//bir integer değer atadım.
      while(true){ // menüyü sonsuz döngü içinde devam ettirdim.
        System.out.println(" \nProje 1 Kullanıcı Menüsü\n 1. Karakter dizisini çizdir\n 2. Büyük harfe çevir\n 3. Şifrele ve şifre çöz\n 4. Harf çiz\n ");// menüyü yazdırdım.
       
        System.out.print("Lütfen menüden bir seçim yapınız: ");// kullanıcıdan menüden bir seçim yapmasını istedim.
        String secim = sc.nextLine();
        
        if(secim.equals("dur"))//kullanıcı seçim dur, Dur veya DuR girmedikçe döngü devam edecektir.
            break;
        else if(secim.equals("Dur"))
            break;
        else if(secim.equals("DuR"))
            break;
        
        if(secim.equals("1")){// kullanıcı biri seçerse karakterDizisiCizdir metodunu çalıştırdım.
        System.out.print("Bir dizi karekter giriniz: ");// kullanıcıdan bir dizi karekter istedim.
        input= sc.nextLine();
        karakterDizisiCizdir(input);
         
        }else if(secim.equals("2")){ // kullanıcı ikiyi seçerse buyukHarfeCevir metodunu çalıştırdım.
        System.out.print("Bir cumle giriniz: ");//kullanıcıdan bir cümle istedim.
        input = sc.nextLine();   
        System.out.println("Cıktı: " + buyukHarfeCevir(input));        
        
        }else if(secim.equals("3")){// kullanıcı üçü seçerse sifreleCoz metodunu çalıştırdım.
        System.out.print("Bir cumle giriniz: " );//kullanıcıdan bir cümle istedim.
        input = sc.nextLine();
        System.out.print("Kaydırma degeri giriniz: ");//kullanıcıdan bir kaydırma değeri istedim.
        int kaydırma_degeri = Integer.parseInt(sc.nextLine());
        System.out.println("Şifrelenmiş metin: "+ sifreleCoz(input, kaydırma_degeri));    
        
        }else if(secim.equals("4")){// kullanıcı dördü seçerse harfCizdir metodunu çalıştırdım.
        while(true){//karakter hatalı girilince tekrar yeni karakter girilmesi için döngüyle tekrarlattım.
        System.out.print("Bir karekter giriniz: ");//kullanıcıdan bir karakter istedim.
        input = sc.nextLine();
        if (input.equals("X") || input.equals("Z"))//girilen karakterin X veya Z olup olmadığını kontrol ettim.  
        break;//girilen karakter kosula uygun degilse uyarı yazdırdım.
           System.out.println("Girilen karakter geçersiz.");    
        }
       while(true){//girilen boyut değeri hatalı girlince tekrar yeni boyut değeri girilmesi için döngüyle tekrarlattım.  
        System.out.print("Boyut degeri giriniz:");
        myInt = Integer.parseInt(sc.nextLine());//string olarak girilen değeri integer'a çevirdim.
        if(myInt % 2 != 0 && myInt >= 5)//boyut degerinin tek sayı ve 5'e eşit veya 5'ten büyük olduğunu kontrol ettim.
        break;//boyut degeri kosula uygun degilse uyarı yazdırdım.
            System.out.println("Gecerli degil.");
        }harfCizdir(input, myInt);    
        
        }
        } 
    }
    
      public static void karakterDizisiCizdir(String dizi) {        
            for(int i =0; i<dizi.length(); i++) {// dizinin bütün karekterlerini kontrol etmek için for döngüsü kullandım.
                
                if(dizi.charAt(i) == 'b'){// dizinin bir karekterine i değeri verdim i, b ise; 
                    if(dizi.charAt(i-1) >= '1' && dizi.charAt(i-1) <='9'){// b nin önünde rakam olup olmadığını kontrol ettim.
                        for(int j=0; j<dizi.charAt(i-1)-48; j++){// b nin önünde rakam var ise b yerine önündeki rakam kadar boşluk bastırdım.
                    System.out.print("  ");
                }
           
                    }
                    else{
                        System.out.print(" ");// b nin önünde rakam yok ise tek boşluk bastırdı.
                    }
        
            }
                if(dizi.charAt(i) == 's'){// dizinin bir karekterine i değeri verdim i, s ise;
                    if(dizi.charAt(i-1) >= '1' && dizi.charAt(i-1) <='9'){// s nin önünde rakam olup olmadığını kontrol ettim.
                        for(int j=0; j<dizi.charAt(i-1)-48; j++){// s nin önünde rakam var ise s yerine önündeki rakam kadar * bastırdım.
                    System.out.print("*");
                }
           
                    }
                    else{
                        System.out.print("*");// s nin önünde rakam yok ise tek * bastırdı.
                    }
            }   
                 if(dizi.charAt(i) == 'n'){// dizinin bir karekterine i değeri verdim i, n ise;
                    if(dizi.charAt(i-1) >= '1' && dizi.charAt(i-1) <='9'){// n nin önünde rakam olup olmadığını kontrol ettim.
                        for(int j=0; j<dizi.charAt(i-1)-48; j++){// n nin önünde rakam var ise n yerine önündeki rakam kadar satır atlattım.
                    System.out.print(" \n ");
                }
           
                    }
                    else{
                        System.out.print("\n");// n nin önünde rakam yok ise tek satır atlattım.
                    }
            }   
                  if(dizi.charAt(i) == 't'){// dizinin bir karekterine i değeri verdim i, t ise;
                    if(dizi.charAt(i-1) >= '1' && dizi.charAt(i-1) <='9'){// t nin önünde rakam olup olmadığını kontrol ettim.
                        for(int j=0; j<dizi.charAt(i-1)-48; j++){// t nin önünde rakam var ise t yerine önündeki rakam kadar 3 boşluk bastırdım.
                    System.out.print("   ");
                }
           
                    }
                    else{
                        System.out.print("   ");// t nin önünde rakam yok ise 3 boşluk bastırdı.
                    }
    }
    }
    
}
      public static String buyukHarfeCevir(String sc) {  
       String yeni_cumle = ""; // kullanıcının girdiği cümleyi değistirince kullanmak için yeni bir cümle atadım.
       char ilk_karakter = sc.charAt(0); //cümlenin ilk harfini charAt ile çektim.
       ilk_karakter -= 32;//ilk harfi büyük harfe çevirdim.
       yeni_cumle += ilk_karakter;// cümleyi büyük harfle yeniden atadım.
       
          for (int i = 1 ; i < sc.length(); i++){
              if(sc.charAt(i) == ' '){//girilen cümlede yeni kelimeye gectiği yeri belirlemek için if le boşluk kontrolü yaptım.
                  char yeni_karakter = sc.charAt(i+1);//boşluk varsa yanındaki karakteri çektim.
                  yeni_karakter -= 32;//boşluğun yanındaki harfi büyük harfe çevirdim.
                  yeni_cumle += " " + yeni_karakter;//cümleyi büyük harfle yeniden atadım.
                  i++;          
              }else{
                  yeni_cumle += sc.charAt(i);// karakter boşluk değilse aynısı kaldı.
              }
              
          }
          return yeni_cumle;//döngüyü tekrar başa sardım. 
    }
   public static String sifreleCoz (String input, int kaydırma_degeri){
String sifrelenmis_cumle = ""; 
String str = "";
for(int k=0; k < input.length(); k++){//girilen cümlenin her karakterine bakmak için cümle uzunluğunu dönen bir for döngüsü kurdum.
   char karakter = input.charAt(k);//girilen cümlenin bir karakterini çektim. 
   if(karakter>='a' && karakter<='z'|| karakter == ' ') { //karakter a ve z rarsında ya da boşluğa eşitse;   
char yeni_karakter = (char) (karakter - 32);//karakteri büyük harfe çevirdim.
str =  str + yeni_karakter;//cümleyi büyük harfle birleştirdim.
   }else{// a ile z arasında değilse ;
       str = str + karakter;//cümleyi karakterle birleştirdim.
   }
}
for(int i=0; i < input.length(); i++){//girilen cümlenin her karakterine bakmak için cümle uzunluğunu dönen bir for döngüsü kurdum.
   char harf = str.charAt(i);//girilen cümlenin bir karakterini çektim. 
 if(kaydırma_degeri >= 0 && kaydırma_degeri <= 25){//girilen kaydırma değeri 0 - 25 arasında ise;
     harf += kaydırma_degeri;//çektiğim karakteri kaydırma değeri kadar artırdım.
     sifrelenmis_cumle += harf;//şifrelenmiş cümleyi harfin kaydırma değeri eklenmiş haliyle birleştirdim.
     if(kaydırma_degeri > 25){//kaydırma değeri 25'ten büyük ise;
         harf = (char)(harf + 'a'-'z');
     }
     
 }else{//if koşullarının dışında ise;
     harf = (char)(harf + kaydırma_degeri);//çektiğim karakteri kaydırma değeri kadar artırdım.
     sifrelenmis_cumle += harf;//şifrelenmiş cümleyi harfin kaydırma değeri eklenmiş haliyle birleştirdim.
  }
} 
return sifrelenmis_cumle;//döngüyü tekrar başa sardırdım.
}
   public static void harfCizdir(String karakter, int boyut){
        int i = 0, j;
        if(boyut % 2 == 1 && boyut >= 5 ){//boyut değerinin tek sayı ve 5'e eşit veya 5'ten büyük olduğunu kontrol ettim.
        int k= boyut - 1 + 1;// X şeklinin boyut değerine uygun çizilmesi için gerekli k değerini atadım. 
        if(karakter.equals("X")){ // girilen karakter X'e eşitse;
        for( i=1; i<=k; i++){//X'i çizdirmek için bir for döngüsü oluşturdum.
            for( j=1; j<=k; j++){
            if(j==i || j==k-i+1)
            System.out.print("*");//yıldızlarla X şeklini boyut değerine uygun şekilde bastırdım.
            else
            System.out.print(" ");
        }   System.out.println();
      }
    } 
}       if(karakter.equals("Z")){// girilen karakter Z'ye eşitse;
        if(boyut % 2 == 1 && boyut >= 5 ){//boyut degerinin tek sayı ve 5'e eşit veya 5'ten büyük olduğunu kontrol ettim.
           int k = boyut - i;// Z şeklinin boyut değerine uygun çizilmesi için gerekli k değerini atadım. 
        for(i = 0; i<k; i++){//Z'yi çizdirmek için bir for döngüsü oluşturdum.
           for (j=0; j<k; j++){
           if(i==0||i==k-1||j==k-1-i)
           System.out.print("*");//yıldızlarla Z şeklini boyut değerine uygun şekilde bastırdım.
       else
       System.out.print(" "); 
    }  System.out.println();
      }
}    
}
    }
}