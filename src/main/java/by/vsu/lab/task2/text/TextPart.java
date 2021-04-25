package by.vsu.lab.task2.text;

import java.util.ArrayList;

public interface TextPart {
    
    public boolean find(TextPartType type);
    public boolean find(TextPart textPart);
    public TextPartType getType();
    public String getAsString();
    
}
