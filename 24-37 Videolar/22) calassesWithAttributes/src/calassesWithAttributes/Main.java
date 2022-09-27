package calassesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop",3000,2);
		
	
		
		ProductMenager productMenager = new ProductMenager();
		productMenager.add(product);
		System.out.println(product.get_kod());

	}

}
