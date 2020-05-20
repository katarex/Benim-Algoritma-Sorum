
package benimalgoritmasorum;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mehmet Saltan
 */
public class BenimAlgoritmaSorum {
   int buyucu_guc=10;
   int savasci_guc=15;
   int okcu_guc=20;
  public void KarakterBilgi(){
  System.out.println("Karakterler icin Gucler soyledir : "); 
  System.out.println("Buyucu Gucu : "+buyucu_guc +" Ve her seviye atlamada +5 Guc Puani eklenir ! Secmek icin 1'e basiniz");
  System.out.println("Okcu Gucu : "+okcu_guc +" Ve her seviye atlamada +5 Guc Puani eklenir ! Secmek icin 2'e basiniz ");
  System.out.println("Savasci Gucu : "+savasci_guc +" Ve her seviye atlamada +5 Guc Puani eklenir ! Secmek icin 3'e basiniz");
  }
  public void Girdiiste(){
        
        System.out.println("Karakterini Degistirmek istiyorsan 1' e ");
        System.out.println("Karakterinin Seviyesini Artirmak icin  2 'e");
        System.out.println("Karakterini Gelistirmek istiyorsan 3' e ");
        
  }
public void Tumislemler(){
   
        Scanner read = new Scanner(System.in);
        KarakterBilgi();
        System.out.println("Secmek istediginiz Karakteri Yaziniz : ");            
        int karakter_secimi=read.nextInt();
             switch (karakter_secimi) {
        case 1 :
            Karakterler nesne=new Karakterler("buyucu",1,10);
           System.out.println("Sectiginiz Karakter : " +nesne.Meslek+",Gucu : "+buyucu_guc);
           Karakter_Yarat obj=new Karakter_Yarat(nesne.Meslek, 1, buyucu_guc);
           System.out.println("****************************************************");
           System.out.println("Karakterini sectigine gore artik oyuna baslayabiliriz ");
           Girdiiste();
           int girdi=read.nextInt();
            switch (girdi) {
                case 1:
                    System.out.println("***********************");
                    KarakterBilgi();
                    obj.K_Degistir();
                    break;
                case 2:
                    obj.K_SeviyeAtlat();
                    break;
                default:
                    obj.K_Gelistir();
                    break;
            }
            break;

            case 2:
                Karakterler nesne2=new Karakterler("okcu",1,20);
           System.out.println("Sectiginiz Karakter : " +nesne2.Meslek+",Gucu : "+okcu_guc);
           Karakter_Yarat obj2=new Karakter_Yarat(nesne2.Meslek, 1, okcu_guc);
           System.out.println("****************************************************");
           System.out.println("Karakterini sectigine gore artik oyuna baslayabiliriz ");
           Girdiiste();
           int girdi2=read.nextInt();
            switch (girdi2) {
                case 1:
                    System.out.println("***********************");
                    KarakterBilgi();
                    obj2.K_Degistir();
                    break;
                case 2:
                    obj2.K_SeviyeAtlat();
                    break;
                default:
                    obj2.K_Gelistir();
                    break;
            }
            break;

                case 3:
           Karakterler nesne3=new Karakterler("savasci",1,15);
           System.out.println("Sectiginiz Karakter : " +nesne3.Meslek+",Gucu : "+savasci_guc);
           Karakter_Yarat obj3=new Karakter_Yarat(nesne3.Meslek, 1, savasci_guc);
           System.out.println("****************************************************");
           System.out.println("Karakterini sectigine gore artik oyuna baslayabiliriz ");
           Girdiiste();
           int girdi3=read.nextInt();
            switch (girdi3) {
                case 1:
                    System.out.println("***********************");
                    KarakterBilgi();
                    obj3.K_Degistir();
                    break;
                case 2:
                    obj3.K_SeviyeAtlat();
                    break;
                default:
                    obj3.K_Gelistir();
                    break;
            }
            break;

            default :
            System.out.println("Hatali secim! 1, 2 ya da 3'e basiniz.");
            break;
           
        }
}
    public static void main(String[] args) {
        System.out.println(" *** Oyunuma Hosgeldiniz *** ");
        BenimAlgoritmaSorum nesnesi=new BenimAlgoritmaSorum();
        nesnesi.Tumislemler();
       
    }

public class Karakterler{
 
    private String Meslek;
    private int YeniSeviye;
    private int YeniGuc;
    
    public Karakterler(String Meslek,int YeniSeviye,int YeniGuc){//Yapici Method'um
    this.Meslek=Meslek;
    this.YeniSeviye=YeniSeviye;
    this.YeniGuc=YeniGuc;
    }
    public void setYeniSeviye(int YeniSeviye){
     this.YeniSeviye=YeniSeviye;
    }
    public  int getYeniSeviye(){
    return  YeniSeviye;
    }
    public void setMeslek(String Meslek){
     this.Meslek=Meslek;
    }
    public  String getMeslek(){
    return  Meslek;
    }
    public void setYeniGuc(int YeniGuc){
     this.YeniGuc=YeniGuc;
    }
    public  int getYeniGuc(){
    return  YeniGuc;
    }

    private void K_Gelistir(){//Private Method'um
        Scanner read2 = new Scanner(System.in);
        System.out.println("Karakter Gelistirmeye Hos Geldin !");
        System.out.println("Unutma Karakter gelistirme sansin % 50 'dir ");
        System.out.println("Karakterinin Gelismesi icin Sorumuza Dogru cevap ver : 39+25 ? ");
               
        int cevap=read2.nextInt();
        Random rnd=new Random();
        int sayi=rnd.nextInt(2);//Random sinifi ile 0 ve 1 sayilari arasinda random olarak uretmesini sagladim ki gelistirme sansi % 50 olsun.
        if (cevap==64&&sayi==1) {
            System.out.println("Karakter Gelistirme Basarili");
            YeniSeviye=YeniSeviye+1;
            YeniGuc=YeniGuc+5;
            System.out.println("Yeni  Seviyeniz : "+YeniSeviye +" "+"Yeni Gucunuz : "+YeniGuc);
        }
        else{
            System.out.println("Basaramadin...");
        }
        
    }
    public void getK_Gelisir(){//Private metoda erismek icin !
    K_Gelistir();
    }
    public void K_Degistir(){
        Scanner oku=new Scanner(System.in);
        System.out.println("Secmek istediginiz Karakteri Yaziniz : ");   
            int yenikaraktergirdi=oku.nextInt();
                switch (yenikaraktergirdi) {
        case 1 :
            String secim="buyucu";
            System.out.println("Karakter Degistirme Basarili Yeni Karakterin : "+secim+",Gucu : "+buyucu_guc);
            break;

        case 2 :
            String secim2="okcu";
            System.out.println("Karakter Degistirme Basarili Yeni Karakterin :  "+secim2+",Gucu: "+okcu_guc);
            break;

        case 3 :
             String secim3="savasci";
            System.out.println("Karakter Degistirme Basarili Yeni Karakterin : "+secim3+",Gucu : "+savasci_guc);
            break;

        default :
            System.out.println("Hatali secim! 1, 2 ya da 3'e basiniz.");
            break;
        }
    }
   
    public void K_SeviyeAtlat(){
        System.out.println("Karakter Seviye Atlatma Bolumune Hos Geldin !");
        System.out.println("Unutma Seviye Atlatma sansin % 25 'dir ");
        System.out.println("Karakterinin Seviye Atlatmasi icin Sorumuza Dogru cevap ver : 39+25 ? ");
        Scanner read2=new Scanner(System.in);
        int cevap2=read2.nextInt();
        Random rnd=new Random();
        int sayi2=rnd.nextInt(4);//Random sinifi ile 0 ve 4 sayilari arasinda random sayi uretmesini  sagladim ki seviye atlama sansi % 25 olsun.
        if (cevap2==64&&sayi2==1) {
            System.out.println("Seviye Atlama Basarili ! ");
            YeniSeviye=YeniSeviye+1;
            YeniGuc=YeniGuc+5;
            System.out.println("Yeni  Seviyeniz : "+ YeniSeviye+" "+"Yeni Gucunuz : "+YeniGuc);
        }
        else{
            System.out.println("Seviye Atlama Basarisiz...");
        }
    }
    
    } 

  static class Karakter_Yarat extends Karakterler{ // Temel siniftan Kalitim araciligiyla Yeni bir sinif turedi
   
        public Karakter_Yarat(String Meslek, int YeniSeviye,int YeniGuc) {
            super(Meslek,YeniSeviye, YeniGuc);
        }
        @Override
        public void K_Degistir(){
        super.K_Degistir();
        }
        public void K_Gelistir(){
        super.K_Gelistir();
        
        }
  
   }
}
