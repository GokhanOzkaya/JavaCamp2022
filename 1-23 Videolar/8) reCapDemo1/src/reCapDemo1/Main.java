package reCapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 55;
		int sayi2 = 61;
		int sayi3 = 58;
		int enBuyuk= sayi1;
		
		if (enBuyuk<sayi2) {
			enBuyuk=sayi2;
		}
		if (enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
	
		System.out.println("Sayıların en büyüğü: "+enBuyuk);
	}

}
