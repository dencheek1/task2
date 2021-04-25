package by.vsu.lab.task2.text.sentence;

import by.vsu.lab.task2.text.TextPart;
import by.vsu.lab.task2.text.TextPartType;

public class Placeholder implements SentencePart {

    String string;
    
    @Override
    public TextPartType getType() {
	return TextPartType.OTHER;
    }

    @Override
    public String getAsString() {
	return string;
    }

    public Placeholder(String string) {
	this.string = string;
    }

    @Override
    public boolean find(TextPartType type) {
	return this.getType().equals(type);
    }

    @Override
    public boolean find(TextPart textPart) {
	return this.equals(textPart);
    }
    
}
