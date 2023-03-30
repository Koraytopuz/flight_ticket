import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int yas,yolculuktipi;
        double fiyat,mesafe;
        System.out.println("Mesafe giriniz(KM):");
        mesafe=input.nextDouble();
        System.out.println("Yaşınızı giriniz:");
        yas=input.nextInt();
        System.out.println("Yolculuk tipi giriniz:\n1-Tek yön\n2-Gidiş-Dönüş");
        yolculuktipi=input.nextInt();
        fiyat = mesafe*0.10;
        if(mesafe>0&&yas>=0){
            if(yolculuktipi==1||yolculuktipi==2){
                if(yolculuktipi==1){
                    if(yas<12){
                        fiyat=fiyat-fiyat*0.5;
                    } else if(yas<12&&yas<24){
                        fiyat=fiyat-fiyat*0.1;
                    } else if(yas>65){
                        fiyat=fiyat-fiyat*0.3;
                    }
                }else{
                    if(yas<12){
                        fiyat=(fiyat-fiyat*0.5)-((fiyat-fiyat*0.5)*0.2);
                    }else if(yas<12&&yas<24){
                        fiyat=(fiyat-fiyat*0.1)-((fiyat-fiyat*0.1)*0.2);
                    } else if(yas>=24&&yas<=65){
                        fiyat=fiyat-(fiyat*0.2);
                    } else if(yas>65){
                        fiyat=(fiyat-fiyat*0.3)-((fiyat-fiyat*0.3)*0.2);
                    }
                }
            }else{
                System.out.println("Hatalı yolculuk tipi girdiniz.");
            }
        }else{
            System.out.println("Hatalı bilgi girdiniz.");
        }
        System.out.println("Toplam tutar:"+fiyat+"TL");
    }
}