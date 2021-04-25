package by.vsu.lab.task2.text.parse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

import by.vsu.lab.task2.text.TextPart;
import by.vsu.lab.task2.text.word.Email;
import by.vsu.lab.task2.text.word.PhoneNumber;
import by.vsu.lab.task2.text.word.SimpleWord;
import by.vsu.lab.task2.text.word.Word;

public class WordParser{

    //(?<=.)[\s]+ word pattern, but with "word,"
    //(?<=.)[\s\.,:;!?]+
    
    	private final String splitWords = "(?<=\\s)";
	private final String phoneNumber = "\\+\\d{3}\\(\\d{2}\\)\\d{3}-\\d{2}-\\d{2}";
	private final String testWord = "\\w\\s+\\w";
	private final String emailAddres = ".+@.+\\..+";
    
    
    public ArrayList<String> parse(String string) {
	
	ArrayList<String> words = new ArrayList<String>(Arrays.
		asList(string.split(splitWords)));
	return words;
    }

    public boolean isOneWord(String word) {
	return !Pattern.compile(testWord).matcher(word).find();
    }
    
    public boolean isPhoneNumber(String word) {
	return Pattern.compile(phoneNumber).matcher(word).find();
    }
    
    public boolean isEmailAddres(String word) {
	return Pattern.compile(emailAddres).matcher(word).find();
    }
    
    public SimpleWord getWord(String word) {
	if(!(word.length()>0))throw new IllegalArgumentException(
		"Argument length exception");
	WordParser parser = new WordParser();
	if(parser.isOneWord(word)&&word.length()>0) {
	    if(parser.isPhoneNumber(word)) {
		return new PhoneNumber(word);
	    }
	    else if(parser.isEmailAddres(word)) {
		return new Email(word);
	    }
	    else return new Word(word);
	}
	else {
	    throw new IllegalArgumentException("Argument should be a simple word");
	}
    }
}
