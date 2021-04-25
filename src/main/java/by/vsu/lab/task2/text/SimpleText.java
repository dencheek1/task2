package by.vsu.lab.task2.text;

import java.util.ArrayList;
import java.util.Iterator;

import by.vsu.lab.task2.text.sentence.Sentence;
import by.vsu.lab.task2.text.sentence.SentencePart;

abstract public class SimpleText implements CompositeTextPart {

    private ArrayList<TextPart> text;
    
   
    public SimpleText(ArrayList<TextPart> text) {
	this.text = text;
    }
    
    @Override
    public String getAsString() {
	StringBuilder builder = new StringBuilder();
	for(TextPart part: this.getAll()) {
	    builder.append(part.getAsString());
	}
	return builder.toString();
    }
    
    public void add(TextPart textPart) {
	text.add(textPart);
    }

    @Override
    public void remove(TextPart textPart) {
	text.remove(textPart);
    }

    @Override
    public ArrayList<TextPart> getAll() {
	return text;
    }
    
    @Override
    public ArrayList<TextPart> getByType(TextPartType type) {
	ArrayList<TextPart> result = new ArrayList<TextPart>();
	if(this.getType().equals(type))result.add(this);
	Iterator<TextPart> iterator = text.iterator();
	    while (iterator.hasNext()) {
	        TextPart part = iterator.next();
	        if (type.equals(part.getType())) {
	            result.add(part);
	        }
	        else if(part.find(type)) {
	            CompositeTextPart com = (CompositeTextPart) part;
	            result.addAll(com.getByType(type));
	        }
	    }
	return result;
    }
    
    @Override
    public boolean find(TextPart textPart) {
	if(this.equals(textPart))return true;
	 Iterator<TextPart> iterator = text.iterator();
	    while (iterator.hasNext()) {
	        TextPart part = iterator.next();
	        if (part.find(textPart)) {
	            return true;
	        }
	    }
	    return false;
    }
    
    @Override
    public TextPartType getType() {
	return TextPartType.TEXT;
    }
    
    @Override
    public boolean find(TextPartType partType) {
	if(this.getType().equals(partType))return true;
	Iterator<TextPart> iterator = text.iterator();
	    while (iterator.hasNext()) {
	        TextPart part = iterator.next();
	        if (part.find(partType)) {
	            return true;
	        }
	    }
	    return false;
    }
    
    
}
