package by.vsu.lab.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import by.vsu.lab.task2.text.SimpleText;
import by.vsu.lab.task2.text.TextPart;
import by.vsu.lab.task2.text.TextPartType;
import by.vsu.lab.task2.text.handler.TextHandler;
import by.vsu.lab.task2.text.parse.TextParser;
import by.vsu.lab.task2.text.sentence.SimpleSentence;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
	
	StringBuilder builder = new StringBuilder();
	try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
		String line;
		while ((line = reader.readLine()) != null) {
			builder.append(line);
		}
	}
	catch (IOException e) {
		e.printStackTrace();
	}
        
	TextHandler handler = new TextHandler();
        ArrayList<SimpleSentence> sentences = handler.getSortedSentences(builder.toString());
        
        builder.setLength(0);
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("res_"+args[0],false))) {
            for(SimpleSentence sen: sentences) {
                System.out.println((sen.getAsString()).trim()+"\n");
                writer.append(sen.getAsString());
                writer.append("\n");
            }
            writer.flush();
            
	}
	catch (IOException e) {
		e.printStackTrace();
	}
      
    }
}
