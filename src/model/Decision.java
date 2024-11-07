package model;

public class Decision {
	private Dictionary dictionary;
	private String memorize;
	public Decision() {
		dictionary=new Dictionary();
	}
	
	public String ask(String question) {
		
		if (memorize!=null) {
			dictionary.saveToMemory(memorize, question);
			memorize=null;
			return "Thank You!";
		}else {
			String answer=dictionary.search(question);
			if (answer==null) {
				memorize=question;
				return "I have no idea! Please teach me!";
			}
			return answer;
		}
		
	}
	
	public int size() {
		return dictionary.size();
	}
}
