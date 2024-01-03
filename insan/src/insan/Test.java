package insan;

public class Test {

	
	private int yas;
	private String ad;
	private String soyAd;
	private int kilo;
	private int boy;
	private String babaAdi;
	public int getYas() {
		return yas;
	}
	protected void name() {
		
	} void setYas(int yas) {
		this.yas = yas;
	}
	protected String getAd() {
		return ad;
	}
	protected void setAd(String ad) {
		this.ad = ad;
	}
	protected String getSoyAd() {
		return soyAd;
	}
	protected void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}
	protected int getKilo() {
		return kilo;
	}
	protected void setKilo(int kilo) {
		this.kilo = kilo;
	}
	protected int getBoy() {
		return boy;
	}
	protected void setBoy(int boy) {
		this.boy = boy;
	}
	protected String getBabaAdi() {
		return babaAdi;
	}
	protected void setBabaAdi(String babaAdi) {
		this.babaAdi = babaAdi;
	}
	protected void show() {
		System.out.println("girmis oldugunuz bilgiler:");
		System.out.println("****************************");
		System.out.println("kisinin adi:"+getAd());
		System.out.println("kisinin soyadı:"+getSoyAd());
		System.out.println("kisinin yasi:"+getYas());
		System.out.println("kisinin boyu:"+getBoy());
		System.out.println("kisinin kilosu:"+getKilo());
		System.out.println("kisinin baba adi:"+getBabaAdi());
		
	}
	
}
