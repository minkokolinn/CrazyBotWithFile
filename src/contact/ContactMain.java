package contact;

import java.util.ArrayList;
import java.util.List;

public class ContactMain {
	public static void main(String[] args) {
		firstForm();
		secondForm();
		thridForm();
	}
	
	public static void firstForm() {
		Contact c1=new Contact();
		
		c1.setName("aa");
		
		List<String> phones=new ArrayList<>();
		phones.add("938373");
		phones.add("099832");
		
		c1.setPhones(phones);
		
		System.out.println(c1);
	}
	
	public static void secondForm() {
		Contact c2=new Contact();
		
		c2.setName("bb");
		c2.setPhones(new ArrayList<>());
		c2.getPhones().add("9034930");	//contact class htl ka ma shi dk har ko a yin htoke pee mha pyn htae
		c2.getPhones().add("03833888");
		
		System.out.println(c2);
	}
	
	public static void thridForm() {	//using customer add phone
		Contact c3=new Contact();
		
		c3.setName("cc");
		c3.addPhone("093490");
		c3.addPhone("8343290");
		
		System.out.println(c3);
	}
}
