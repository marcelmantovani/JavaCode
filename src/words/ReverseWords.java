package words;

public class ReverseWords {
	public String reverseWords(String s) {
        String output = "";
        s.trim();
        String[] words = s.split(" ");
        System.out.println(words.length);
        for (int i = words.length -1; i >= 0; i--){
            if (words[i].trim().length() != 0)
            	output += words[i] + " ";
        }
        
        return output.trim();
    }
}
