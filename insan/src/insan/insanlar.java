package insan;

import java.util.Scanner;

public class insanlar {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
    Test test1=new Test();
    System.out.println("lutfen isminizi giriniz:");
    String isim=scanner.nextLine();
    test1.setAd(isim);
    
    
    
    System.out.println("lutfen soyadınızı giriniz:");
    String soyAd=scanner.nextLine();
    test1.setSoyAd(soyAd);
    
    
    
    System.out.println("lutfen baba adınızı giriniz:");
    String babaAdi=scanner.nextLine();
    test1.setBabaAdi(babaAdi);
    
    
	Scanner scanner1=new Scanner(System.in);
	System.out.println("lutfen yasınızı giriniz:");
	int yas=scanner1.nextInt();
	test1.setYas(yas);
	
	System.out.println("lutfen kilonuzu giriniz:");
	int kilo=scanner1.nextInt();
	test1.setKilo(kilo);
	
	
	System.out.println("lutfen boyunuzu giriniz");
	int boy=scanner1.nextInt();
	test1.setBoy(boy);
	
	test1.show();
	

    
    
	}

}
