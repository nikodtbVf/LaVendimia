import java.util.ArrayList;

public class Anagram {
	
	public String firstWord;
	public String secondWord;
	
	/* public Anagram(){
		
	}*/
	
	//ana 
	//ann  debe retornar false
	//aan debe retornar true
	
	/* Escribe un método para determinar si dos cadenas son o no anagramas. */
	public boolean isAnagram(String firstWord, String secondWord) {
		boolean result = false;
		char[] firstWordArray = firstWord.toLowerCase().toCharArray();
		char[] secondWordArray = secondWord.toLowerCase().toCharArray();
		ArrayList<Character> letters = new ArrayList<Character>();
		
		if(firstWordArray.length == secondWordArray.length) {
			for(char letter : secondWordArray) {
				letters.add(letter);
			}
		
			for(int i = 0; i < firstWordArray.length; i++) {
				int index = letters.indexOf(firstWordArray[i]);
				if(index != -1) {
					letters.remove(index);
				}
			}		
			result = letters.size() == 0;					
		}
		
		return result;
	} 
	

}
