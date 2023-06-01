package com.object.shallowclonning;

public class Employee implements Cloneable{

	int id;
	String name;
	Address addr;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {

		Address addr = new Address("Gargoti", 416209);
		Employee emp = new Employee(1, "Komal", addr);
		System.out.println(emp);
		Employee empClone = (Employee)emp.clone();
		System.out.println(empClone);
		emp.getAddr().setCity("Mahalwadi");
		System.out.println(emp);	
		System.out.println(empClone);	
			
		}

	
	
}
