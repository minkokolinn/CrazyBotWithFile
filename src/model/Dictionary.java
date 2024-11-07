package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	
	private Map<String, String> memory;
	
	private static final String FILE_NAME="data.obj"; 
	
	@SuppressWarnings("unchecked")
	public Dictionary() {
		if (null==memory) {
			memory=new HashMap<>();
		}
		
		try(ObjectInputStream input=new ObjectInputStream(new FileInputStream(FILE_NAME))){
			memory=(Map<String, String>) input.readObject();
		} catch (Exception e) {
			System.err.println("First time...");
		}
	}
	
	//search question
	public String search(String question) {
		return memory.get(question);
	}
	
	//save question and answer
	public void saveToMemory(String question,String answer) {
		memory.put(question, answer);
		
		try(ObjectOutputStream output=new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
			output.writeObject(memory);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//memorize words
	public int size() {
		return memory.size();
	}
	
}
