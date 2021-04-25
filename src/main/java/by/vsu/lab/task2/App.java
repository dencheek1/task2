package by.vsu.lab.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import by.vsu.lab.task2.text.SimpleText;
import by.vsu.lab.task2.text.TextPart;
import by.vsu.lab.task2.text.TextPartType;
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
        final String string = "   Lorem ipsu@m.a +372(29)121-21-21 sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore mag.na aliqua?. Euismod nisi porta lorem mollis aliquam ut. Morbi leo urna molestie at elementum eu facilisis sed. Mauris nunc congue nisi vitae. Nulla facilisi morbi tempus iaculis urna id volutpat. Viverra suspendisse potenti nullam ac tortor vitae. Eget sit amet tellus cras adipiscing enim eu. Id velit ut tortor pretium viverra. Arcu felis bibendum ut tristique. Nunc sed velit dignissim sodales ut eu. Quis imperdiet massa tincidunt nunc pulvinar. Lectus urna duis convallis convallis tellus id.\n\n"
	 + "Id aliquet lectus proin nibh nisl. Gravida in fermentum et sollicitudin ac orci. Eget duis at tellus at. Scelerisque felis imperdiet proin fermentum leo vel orci porta. Hendrerit gravida rutrum quisque non tellus. Sollicitudin ac orci phasellus egestas tellus rutrum. Mattis vulputate enim nulla aliquet porttitor lacus luctus accumsan tortor. Massa ultricies mi quis hendrerit. Egestas congue quisque egestas diam in arcu cursus euismod. Quis vel eros donec ac odio tempor.\n\n"
	 + "Nibh praesent tristique magna sit amet purus gravida quis blandit. Odio facilisis mauris sit amet massa vitae tortor condimentum. Lobortis scelerisque fermentum dui faucibus in. Accumsan in nisl nisi scelerisque eu. Quisque non tellus orci ac. Porttitor massa id neque aliquam vestibulum morbi blandit cursus risus. Pellentesque id nibh tortor id aliquet. Leo vel orci porta non. Lectus arcu bibendum at varius. Sit amet commodo nulla facilisi nullam vehicula. Nisi est sit amet facilisis. Arcu felis bibendum ut tristique et egestas quis ipsum suspendisse. Pretium viverra suspendisse potenti nullam ac tortor vitae purus faucibus. Vel quam elementum pulvinar etiam non quam lacus suspendisse faucibus. Massa tincidunt dui ut ornare lectus sit amet est. Nunc mattis enim ut tellus. Faucibus ornare suspendisse sed nisi lacus sed. Pulvinar elementum integer enim neque. Nunc sed augue lacus viverra vitae congue eu consequat ac.\n\n"
	 + "Fames ac turpis egestas maecenas pharetra. Eleifend mi in nulla posuere sollicitudin aliquam ultrices sagittis orci. Urna nec tincidunt praesent semper feugiat nibh sed pulvinar proin. Nisl nisi scelerisque eu ultrices vitae auctor eu. Ac odio tempor orci dapibus ultrices in iaculis. Vitae elementum curabitur vitae nunc. Nulla aliquet enim tortor at auctor urna. Odio ut enim blandit volutpat maecenas. Et pharetra pharetra massa massa ultricies mi quis hendrerit dolor. Fringilla phasellus faucibus scelerisque eleifend donec pretium. Proin libero nunc consequat interdum varius sit amet mattis vulputate.\n\n"
	 + "Aliquet risus feugiat in ante. Ultrices in iaculis nunc sed. Non consectetur a erat nam at lectus. Morbi leo urna molestie at elementum eu. Dolor purus non enim praesent. Nulla aliquet porttitor lacus luctus. Faucibus pulvinar elementum integer enim neque. Sagittis aliquam malesuada bibendum arcu vitae elementum curabitur. Donec massa sapien faucibus et molestie ac feugiat. Ullamcorper sit amet risus nullam eget felis. Pretium vulputate sapien nec sagittis aliquam malesuada bibendum arcu vitae. Nunc eget lorem dolor sed viverra ipsum nunc aliquet. Pretium quam vulputate dignissim suspendisse in est. Diam sollicitudin tempor id eu nisl nunc. Nascetur ridiculus mus mauris vitae ultricies leo integer. Purus sit amet luctus venenatis. Bibendum est ultricies integer quis auctor elit sed. Ullamcorper a lacus vestibulum sed arcu non odio euismod. Lectus vestibulum mattis ullamcorper velit sed ullamcorper morbi tincidunt ornare.\n\n"
	 + "Nisl nunc mi ipsum faucibus vitae?. Gravida in fermentum et sollicitudin ac. Ullamcorper velit sed ullamcorper morbi tincidunt ornare. Eu feugiat pretium nibh ipsum consequat. Ullamcorper eget nulla facilisi etiam dignissim. At elementum eu facilisis sed. Quis blandit turpis cursus in hac habitasse. Ac auctor augue mauris augue neque gravida in fermentum et. Maecenas sed enim ut sem viverra aliquet eget sit amet. Tristique nulla aliquet enim tortor at auctor urna nunc.\n\n"
	 + "Vehicula ipsum a arcu cursus. Aenean pharetra magna ac placerat vestibulum lectus mauris ultrices eros. Sed arcu non odio euismod lacinia at quis risus sed. Leo duis ut diam quam nulla porttitor massa id. Cras pulvinar mattis nunc sed blandit libero volutpat sed. Et molestie ac feugiat sed. Cursus mattis molestie a iaculis at erat pellentesque adipiscing. Iaculis nunc sed augue lacus. Risus at ultrices mi tempus imperdiet nulla malesuada pellentesque elit. Nec feugiat nisl pretium fusce id velit ut tortor. Tincidunt tortor aliquam nulla facilisi cras fermentum odio eu. Ultrices sagittis orci a scelerisque purus semper eget.\n\n"
	 + "Lacus suspendisse faucibus interdum posuere lorem ipsum dolor sit. Semper viverra nam libero justo laoreet sit. Tortor at risus viverra adipiscing at in. Sollicitudin aliquam ultrices sagittis orci a scelerisque. Convallis a cras semper auctor. Condimentum id venenatis a condimentum vitae sapien. Nibh ipsum consequat nisl vel. Non curabitur gravida arcu ac. Lorem ipsum dolor sit amet consectetur adipiscing elit. Tellus id interdum velit laoreet id donec ultrices tincidunt arcu. Varius vel pharetra vel turpis nunc eget lorem. Risus pretium quam vulputate dignissim. Egestas quis ipsum suspendisse ultrices gravida dictum fusce ut. Netus et malesuada fames ac. Nunc pulvinar sapien et ligula ullamcorper.\n\n"
	 + "Orci dapibus ultrices in iaculis nunc sed augue lacus. Platea dictumst vestibulum rhoncus est pellentesque elit ullamcorper. Arcu dui vivamus arcu felis bibendum ut tristique et egestas. Aliquam eleifend mi in nulla. Quam id leo in vitae turpis. Tincidunt praesent semper feugiat nibh sed pulvinar proin. Ac felis donec et odio pellentesque diam volutpat commodo. Adipiscing vitae proin sagittis nisl rhoncus mattis. Sed felis eget velit aliquet sagittis id consectetur purus. Adipiscing elit pellentesque habitant morbi tristique senectus et netus. Tristique senectus et netus et malesuada fames. Iaculis at erat pellentesque adipiscing commodo elit. Nibh sed pulvinar proin gravida. Cursus eget nunc scelerisque viverra mauris in. Tristique nulla aliquet enim tortor. Faucibus ornare suspendisse sed nisi lacus sed. Eget nulla facilisi etiam dignissim diam quis enim lobortis. Arcu non odio euismod lacinia. Donec ac odio tempor orci dapibus. Volutpat blandit aliquam etiam erat velit scelerisque in.\n\n"
	 + "Non enim praesent elementum facilisis leo vel fringilla est. Euismod nisi porta lorem mollis aliquam ut porttitor leo a. Turpis nunc eget lorem dolor sed viverra. A pellentesque sit amet porttitor eget dolor morbi. Lacinia at quis risus sed vulputate odio ut enim. Neque ornare aenean euismod elementum nisi quis eleifend. Volutpat sed cras ornare arcu dui. Sit amet mattis vulputate enim. Nisl nunc mi ipsum faucibus vitae. Commodo quis imperdiet massa tincidunt nunc. Fermentum et sollicitudin ac orci phasellus. Dui accumsan sit amet nulla. Arcu non odio euismod lacinia at quis. Ut eu sem integer vitae justo. Amet consectetur adipiscing elit pellentesque habitant morbi. Turpis in eu mi bibendum. In vitae turpis massa sed elementum tempus.\n\n"
	 + "Amet luctus venenatis lectus magna fringilla. Elementum pulvinar etiam non quam lacus suspendisse faucibus. Nulla pellentesque dignissim enim sit amet venenatis urna cursus eget. Vulputate eu scelerisque felis imperdiet. Morbi tincidunt ornare massa eget egestas. Sagittis aliquam malesuada bibendum arcu vitae elementum. Justo eget magna fermentum iaculis eu. Dui ut ornare lectus sit amet est placerat in. Sit amet est placerat in egestas erat imperdiet. Nunc id cursus metus aliquam eleifend. Viverra tellus in hac habitasse platea dictumst. Dui accumsan sit amet nulla facilisi morbi tempus iaculis urna. Amet risus nullam eget felis eget nunc lobortis. Ornare arcu dui vivamus arcu felis bibendum ut tristique et. Non curabitur gravida arcu ac tortor dignissim. Magna ac placerat vestibulum lectus mauris ultrices eros in cursus. Egestas maecenas pharetra convallis posuere morbi. Id leo in vitae turpis massa sed.\n\n"
	 + "Volutpat consequat mauris nunc congue nisi vitae suscipit tellus. Ultricies leo integer malesuada nunc vel risus. Leo urna molestie at elementum. Quam pellentesque nec nam aliquam sem et tortor consequat id. Eu facilisis sed odio morbi quis commodo odio. Turpis massa sed elementum tempus egestas sed. Et tortor at risus viverra. Elementum tempus egestas sed sed risus. Diam quam nulla porttitor massa. Justo eget magna fermentum iaculis eu non diam phasellus vestibulum. Non pulvinar neque laoreet suspendisse interdum consectetur. Nunc eget lorem dolor sed viverra ipsum. Quam id leo in vitae turpis massa. Commodo viverra maecenas accumsan lacus vel.\n\n"
	 + "Cras ornare arcu dui vivamus. Risus commodo viverra maecenas accumsan lacus vel. Integer quis auctor elit sed vulputate. Dignissim convallis aenean et tortor. Lectus proin nibh nisl condimentum id venenatis a. Id neque aliquam vestibulum morbi blandit cursus. Mauris augue neque gravida in. Enim eu turpis egestas pretium aenean pharetra. In cursus turpis massa tincidunt dui ut ornare lectus sit. Nibh sit amet commodo nulla facilisi nullam vehicula ipsum a. Cras pulvinar mattis nunc sed blandit. Sit amet massa vitae tortor condimentum lacinia quis. Fermentum odio eu feugiat pretium nibh ipsum consequat. Facilisis mauris sit amet massa vitae tortor condimentum. Maecenas accumsan lacus vel facilisis volutpat est velit egestas dui.\n\n"
	 + "Sem nulla pharetra diam sit amet nisl. Viverra orci sagittis eu volutpat odio facilisis. Tempus urna et pharetra pharetra massa massa ultricies. Tempor nec feugiat nisl pretium fusce id velit ut tortor. Suspendisse interdum consectetur libero id faucibus nisl tincidunt eget. Ridiculus mus mauris vitae ultricies leo integer. Vitae nunc sed velit dignissim. Erat velit scelerisque in dictum non consectetur a erat nam. Velit scelerisque in dictum non consectetur a erat nam. Sollicitudin tempor id eu nisl nunc. Condimentum vitae sapien pellentesque habitant. Tincidunt tortor aliquam nulla facilisi cras fermentum odio eu. Fringilla urna porttitor rhoncus dolor purus non enim praesent elementum. Purus in massa tempor nec feugiat. Tellus elementum sagittis vitae et leo duis ut diam.\n\n"
	 + "Viverra adipiscing at in tellus integer feugiat scelerisque. Parturient montes nascetur ridiculus mus. Pretium viverra suspendisse potenti nullam ac tortor. Adipiscing elit pellentesque habitant morbi tristique senectus et netus et. Augue eget arcu dictum varius duis at. Neque aliquam vestibulum morbi blandit cursus. Ut tellus elementum sagittis vitae. Volutpat ac tincidunt vitae semper quis. Ut enim blandit volutpat maecenas volutpat blandit aliquam etiam. Ac auctor augue mauris augue neque gravida. Vitae tortor condimentum lacinia quis vel. Lectus urna duis convallis convallis tellus id. Eu lobortis elementum nibh tellus molestie nunc non blandit massa. Orci eu lobortis elementum nibh tellus.";
        
        String subst = "\n";

        
        
        TextParser parser = new TextParser();
        SimpleText text = parser.getText(string);
        
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
        
        for(SimpleSentence sen: sentences) {
            System.out.println((sen.getAsString()).trim());
        }
        
        for(TextPart part: text.getByType(TextPartType.WORD)) {
            System.out.println(part.getAsString());
        }
        
        String sen = sentences.get(1).getAsString();
        System.out.println(sen);
      
    }
}
