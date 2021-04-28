package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo V12",15000,"16 GB ram",10);
		
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("MSI Notebook");
		product2.setDetail("32GB Ram");
		product2.setUnitPrice(1700);
		product2.setDiscount(10);
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("içecek");
		
		
		
	}

}
