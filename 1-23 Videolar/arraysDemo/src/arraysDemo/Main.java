package arraysDemo;

public class Main {

	public static void main(String[] args) {
		
		String ogrenci1 = "Gökhan";
		String ogrenci2 = "Fatoş";
		String ogrenci3 = "Özkaya";
		String ogrenci4 = "Arıkoğlu";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("------------------------------------");
		
		String[] ogrenciler = new String[4];
		
		ogrenciler[0]="Gökhan";
		ogrenciler[1]="Fatoş";
		ogrenciler[2]="Özkaya";
		ogrenciler[3]="Arıkoğlu";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("------------------------------------");
		
		for (String ogrenci:ogrenciler){
			
			System.out.println(ogrenci);
			
		}
		
		
	}

}
