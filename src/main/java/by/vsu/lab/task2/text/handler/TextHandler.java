package by.vsu.lab.task2.text.handler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import by.vsu.lab.task2.text.SimpleText;
import by.vsu.lab.task2.text.TextPart;
import by.vsu.lab.task2.text.TextPartType;
import by.vsu.lab.task2.text.parse.TextParser;
import by.vsu.lab.task2.text.sentence.SimpleSentence;

public class TextHandler {

    public ArrayList<SimpleSentence> getSortedSentences(String str){
	StringBuilder builder = new StringBuilder();
	TextParser parser = new TextParser();
        SimpleText text = parser.getText(str); 
        
        ArrayList<SimpleSentence> sentences = new ArrayList<>();
        
        
        for(TextPart part: text.getByType(TextPartType.SENTENCE)) {
            sentences.add((SimpleSentence) part);
        }
        
        Collections.sort(sentences,new Comparator<SimpleSentence>() {
	    @Override
	    public int compare(SimpleSentence tp1, SimpleSentence tp2) {
		return tp1.getByType(TextPartType.WORD).size()-tp2.getByType(TextPartType.WORD).size();
	    }
	});
        
        return sentences;
    }
    
}
