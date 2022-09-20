package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		
		double[] myList = {2.2 , 1.8 , 4.2 , 3.2 , 5.4};
		double total = 0;
		double max = myList[0];
		
		for (double number:myList){
			if (number>max) {
				max=number;
			}
			total=number + total;
			
			System.out.println(number);
		}
		System.out.println("Sayıların toplamı: "+total);
		System.out.println("En büyük sayı: "+max);

	}

}
