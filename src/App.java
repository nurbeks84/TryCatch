import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add( "What are doing" );
        list.add( "keep in touch" );
        list.add( "new drive me bad" );
        list.add( "who are you" );
        list.add( "what is wrong with you me" );


        List<Integer> count = new ArrayList<>();

        for (String anyWord : list) {
            String[] srs  = anyWord.split( " " );
            count.add( srs.length);
        }

        System.out.println(count);
        System.out.println( Collections.max( count ) );
    }
}