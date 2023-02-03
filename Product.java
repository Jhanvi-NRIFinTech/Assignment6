package shopping;

public class Product {
    public int id;
	public String name;
	public String brand;
	public int qty;
	public int price;
	
	public Product() {
		super();
	}

	public Product(int id, String name, String brand, int qty, int price) {
		this.id=id;
		this.name = name;
		this.brand = brand;
		this.qty = qty;
		this.price = price;
	}
	
	public void display(){
	    System.out.println("id :" +id+"\n product name is : " + name + " "+ "\n brand: "+ brand + "\n quantity :" + qty +"\n price" + price);
	    System.out.println();
	}
}
