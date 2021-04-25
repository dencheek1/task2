package by.vsu.lab.task2.text.word;

import by.vsu.lab.task2.text.TextPart;
import by.vsu.lab.task2.text.TextPartType;
import by.vsu.lab.task2.text.sentence.SentencePart;

public abstract class SimpleWord implements SentencePart {

    private String word;
    
    @Override
    public TextPartType getType() {
	return TextPartType.WORD;
    }

    @Override
    public String getAsString() {
	return word;
    }

    @Override
    public boolean find(TextPartType type) {
	return this.getType().equals(type);
    }

    @Override
    public boolean find(TextPart textPart) {
	return this.equals(textPart);
    }
    
    SimpleWord(String word){
	this.word = word;
    }
    
}
