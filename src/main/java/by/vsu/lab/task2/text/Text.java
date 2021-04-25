package by.vsu.lab.task2.text;

import java.util.ArrayList;

public class Text extends SimpleText{

    public Text(ArrayList<TextPart> text) {
	super(text);
	// TODO Auto-generated constructor stub
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
    public TextPartType getType() {
	// TODO Auto-generated method stub
	return TextPartType.TEXT;
    }

}
