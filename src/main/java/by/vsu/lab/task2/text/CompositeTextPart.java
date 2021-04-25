package by.vsu.lab.task2.text;

import java.util.ArrayList;

public interface CompositeTextPart extends TextPart {
    
    public ArrayList<TextPart> getAll();
    //public void add(TextPart textPart);
    public void remove(TextPart textpart);
    public ArrayList<TextPart> getByType(TextPartType type);
}
