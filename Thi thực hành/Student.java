package phong;

public class Student {
	private String id;
	private String name;
	private String address;
	private String phone;
	
	
	public Student() {
		
	};
	public Student(String id, String name, String address, String phone) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String ad) {
		this.address = ad;
	}
	public String getPhone() {
		return this.id;
	}
	public void setPhone(String p) {
		this.phone = p;
	}
	
	
	
	
	
}
