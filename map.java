import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class employee{
	int id;
	String name;
	double salary;
	
	public employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return id;
	}
	public void setEmployeeId(int employeeId) {
		this.id = employeeId;
	}
	public String getEmployeeName() {
		return name;
	}
	public void setEmployeeName(String employeeName) {
		this.name = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public employee setSalary(double salary) {
		this.salary = salary;
		return this;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class map {
    public static void main(String[] args) {
		
		
		List<employee> productList = new ArrayList<employee>();
        List<employee> list = new ArrayList<employee>();
		
		productList.add(new employee(101,"Monidepa",40000));
		productList.add(new employee(102,"Riya",25000));
		productList.add(new employee(103,"Mandy",50000));
		productList.add(new employee(104,"Deepa",35000));
		productList.add(new employee(105,"Ankita",4000));
		
		list = productList.stream().map(p->p.setSalary(p.getSalary()*1.1)).collect(Collectors.toList());
		list.forEach(n->System.out.println(n));
		}

	}