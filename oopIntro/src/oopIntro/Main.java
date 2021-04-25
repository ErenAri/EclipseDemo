package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo V12",15000,"16 GB ram");
		
		
		Product product2 = new Product();
		product2.id=2;	
		product2.name="MSI Alfa 17";
		product2.unitPrice=17000;
		product2.detail="32 GB ram";
		
		Product product3 = new Product();
		product3.id=3;	
		product3.name="Apple Macbook Air";
		product3.unitPrice=20000;
		product3.detail="16 GB ram";
		
		Product[] products = {
				product1,
				product2,
				product3,
		};
		
		for(Product product:products) {
			System.out.println("Ürün Ýsmi: "+product.name);
			System.out.println("Ürün Özellikleri: "+product.detail);
			System.out.println("Ürün Fiyatý: "+product.unitPrice);
			System.out.println("*-*-*-*-*-*-*-*");
		}
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahçe";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);

		
	}

}
