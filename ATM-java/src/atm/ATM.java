/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author aasla
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int bakiye=1000;
        String işlemler="1.Bakiye Öğrenme|\n"
                         + "2.Para Çekme\n"
                         + "3.Para Yatırma\n"
                         + "4.Çıkış için enter tuşuna basın ";
        
        System.out.println("*****************************");
        System.out.println(işlemler);
        System.out.println("*****************************");
        while(true){
        System.out.println("İşlem seçiniz");
        String işlem=input.nextLine();
            if (işlem.equals("")) {
                System.out.println("programdan çıkılıyor...");
                break;
            }
            else if (işlem.equals("1")) {
                System.out.println("bakiyeniz :"+bakiye); 
            }
            else if (işlem.equals("2")) {
                System.out.println("çekmek istediğiniz tutar :");
                int tutar=input.nextInt();
                input.nextLine();
                if (bakiye-tutar<0) {
                    System.out.println("Yeterli bakiye bulunmamaktadır. Bakiye :"+bakiye);
                }
                else{
                  bakiye-=tutar;
                    System.out.println("Yeni bakiyeniz :"+bakiye);
                }
            }
            else if (işlem.equals("3")) {
                System.out.println("Yatırmak istediğiniz tutar :");
                int tutar=input.nextInt();
                input.nextLine();
                bakiye+=tutar;
                System.out.println("Yeni bakiyeniz :"+bakiye );
            }
            else{
                System.out.println("Geçersiz işlem...");
            }
        }
    }
    
}

