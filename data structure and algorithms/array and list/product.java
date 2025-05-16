
public class product {
	int id;
	String name;
	double price;
	public product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	
	public String display() {
		return "product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

}
