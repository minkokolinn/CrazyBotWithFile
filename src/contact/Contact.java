package contact;

import java.util.ArrayList;
import java.util.List;

public class Contact {
	private String name;
	private List<String> phones;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phones=" + phones + "]";
	}
	
	
	//customer add phone
	public void addPhone(String phone) {
		if (null == phones) {
			phones=new ArrayList<>();
		}
		phones.add(phone);
	}
}
