package by.vsu.lab.task2.text.parse;

import java.util.ArrayList;
import java.util.regex.Pattern;

import by.vsu.lab.task2.text.SimpleText;
import by.vsu.lab.task2.text.Text;
import by.vsu.lab.task2.text.TextPart;
import by.vsu.lab.task2.text.TextPartType;

public class TextParser {

    final String sentenceSubDivSaveSpacers = "(?=(?<=[.!?])\\s)";
    
    public SimpleText getText(String text) {
	ArrayList<TextPart> parts = new ArrayList<TextPart>();
	String res[] = text.split(sentenceSubDivSaveSpacers);
	SentencesParser sentences = new SentencesParser();
	for(String s: res) {
	   parts.add(sentences.getSentence(s));
        }
	
	return new Text(parts); 
	    
    }
    
}
