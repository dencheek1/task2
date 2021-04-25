package by.vsu.lab.task2.text.sentence;

import java.util.ArrayList;
import java.util.Iterator;

import by.vsu.lab.task2.text.CompositeTextPart;
import by.vsu.lab.task2.text.TextPart;
import by.vsu.lab.task2.text.TextPartType;

public abstract class SimpleSentence implements CompositeTextPart {

    ArrayList <SentencePart> sentence;
    
    @Override
    public TextPartType getType() {
	return TextPartType.SENTENCE;
    }

    @Override
    public String getAsString() {
	StringBuilder builder = new StringBuilder();
	for(TextPart part: this.getAll()) {
	    builder.append(part.getAsString());
	}
	return builder.toString();
    }

    @Override
    public ArrayList<TextPart> getAll() {
	return new ArrayList<TextPart>(sentence);
    }

    @Override
    public void remove(TextPart textpart) {
	sentence.remove(textpart);
    }

    @Override
    public ArrayList<TextPart> getByType(TextPartType type) {
	ArrayList<TextPart> result = new ArrayList<TextPart>();
	if(this.getType().equals(type))result.add(this);
	Iterator<SentencePart> iterator = sentence.iterator();
	    while (iterator.hasNext()) {
	        TextPart part = iterator.next();
	        if (type.equals(part.getType())) {
	            result.add(part);
	        }
	    }
	return result;
    }

    @Override
    public boolean find(TextPartType type) {
	if(this.getType().equals(type))return true;
	Iterator<SentencePart> iterator = sentence.iterator();
	    while (iterator.hasNext()) {
	        TextPart part = iterator.next();
	        if (part.find(type)) {
	            return true;
	        }
	    }
	    return false;
    }

    @Override
    public boolean find(TextPart textPart) {
	if(this.equals(textPart))return true;
	
	Iterator<SentencePart> iterator = sentence.iterator();
	    while (iterator.hasNext()) {
	        TextPart part = iterator.next();
	        if (part.find(textPart)) {
	            return true;
	        }
	    }
	return false;
    }

    public SimpleSentence(ArrayList<SentencePart> sentence) {
	this.sentence = sentence;
    }
    
}
