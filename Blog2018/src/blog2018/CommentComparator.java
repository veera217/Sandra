
package blog2018;

import java.util.Comparator;


public class CommentComparator  implements Comparator<Comment>{

    @Override
    public int compare(Comment c1, Comment c2){
        return c1.getAuthor().compareTo(c2.getAuthor());
    }
    
    public static void main(String[] args) {
        
    }
    
}
