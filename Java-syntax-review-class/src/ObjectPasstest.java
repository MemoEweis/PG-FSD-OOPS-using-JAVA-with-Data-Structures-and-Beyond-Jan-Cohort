
public class ObjectPasstest {

	public static void main(String[] args) {
ObjectPasstest test = new ObjectPasstest();
Employee x = new Employee();
x.setSalary(100);
System.out.println("employee Salary" + x.getSalary());
test.foo (x);
System.out.println("employee Salary" + x.getSalary());

	}

	public void foo(Employee y) {
		y.setSalary(500);
		y = new Employee ();
		y.setSalary(2000);
		// TODO Auto-generated method stub
		
	}

}
