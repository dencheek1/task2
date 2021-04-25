package by.vsu.lab.task2.text.parse;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.vsu.lab.task2.text.sentence.Placeholder;
import by.vsu.lab.task2.text.sentence.Sentence;
import by.vsu.lab.task2.text.sentence.SentencePart;
import by.vsu.lab.task2.text.sentence.SimpleSentence;
import by.vsu.lab.task2.text.word.SimpleWord;

public class SentencesParser {

    final String sentenceStartWithSpacers = "\\A\\s+";
    final String sentenceSubDivSaveSpacers = "(?=(?<=[.!?])\\s)";
    final String split = "(?<=\\s)";
    final String trimS = "[?\\.,:;!\\s]+(?=$)";
    
    public String[] splitSentence(String sentence) {
	return sentence.split(split);
    }

    public SimpleSentence getSentence(String string) {
	ArrayList<SentencePart> sentence = new ArrayList<SentencePart>();
	String str[] = string.split(split);
	
        WordParser parser = new WordParser();
	Pattern oneWord = Pattern.compile(trimS);
	for(String word:str) {
	    Matcher matcher = oneWord.matcher(word);
            if(matcher.find()) {
        	try {
        	    sentence.add(parser.getWord(word.substring(0, matcher.start())));
        	}catch(Exception e) {}    
        	    sentence.add(new Placeholder(word.substring(matcher.start())));
            }
            else {
        	sentence.add(parser.getWord(word));
            }
	}
	return new Sentence(sentence);
    }
    
    
    
}
