import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return "\nProduct [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}

public class flatmap {
    public static void main(String[] args) {
		
		List<Product> productList1 = new ArrayList<Product>();
		productList1.add(new Product(101,"hp pavilion",60000));
		productList1.add(new Product(102,"acer laptop",22990));
		productList1.add(new Product(103,"apple macbook",100000));

		List<Product> productList2 = new ArrayList<Product>();
		productList1.add(new Product(104,"apple iphone",100000));
		productList1.add(new Product(105,"samsung galaxy",30000));
		productList1.add(new Product(106,"oneplus smartphone",60000));

		List<Product> productList3 = new ArrayList<Product>();
		productList1.add(new Product(107,"kodak camera",25000));
		productList1.add(new Product(108,"canon dslr",50000));
		productList1.add(new Product(109,"nikon camera",80000));
		
		List<List<Product>> productList = new ArrayList<List<Product>>();
		productList.add(productList1);
		productList.add(productList2);
		productList.add(productList3);
		
		List<Product> list = productList.stream().flatMap(plist -> plist.stream()).collect(Collectors.toList());
		System.out.println(list);
	}
}
