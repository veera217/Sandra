
package blog2018;

import java.time.LocalDateTime;
import java.util.TreeSet;


public class NewMain1 {

    public static void main(String[] args) {
        Comment c = new Comment("adam","jakis tekst", LocalDateTime.of(2018, 3, 19, 8, 0, 0));
        Comment c2 = new Comment("bernard","jakis tekst", LocalDateTime.of(2018, 3, 19, 8, 0, 0));
        Comment c3 = new Comment("celina","jakis tekst");
        
        System.out.println(c);
        System.out.println(c2);
        System.out.println(c3);
        
        TreeSet set = new TreeSet();
        set.add(c);
        set.add(c2);
        set.add(c3);
        System.out.println(set);
        
        CommentComparator cc = new CommentComparator();                                            
        TreeSet set2 = new TreeSet(cc);
        set.add(c);
        set.add(c2);
        set.add(c3);
        System.out.println(set2);
    }
    
}
