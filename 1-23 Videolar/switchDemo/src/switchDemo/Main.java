package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade ='C';
		
		switch (grade) {
		 
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok güzel : Geçtiniz");
			break;	
		case 'C':
			System.out.println("Güzel: Geçtiniz");
			break;	
		case 'D':
			System.out.println("İyi: Geçtiniz");
			break;	
		case 'F':
			System.out.println("Malesef: Kaldınız");
			break;
			
		default:
			System.out.println("Lütfen geçerli bir not giriniz.");
		}

	}

}
