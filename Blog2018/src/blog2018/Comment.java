
package blog2018;

import java.time.LocalDateTime;

public class Comment implements Comparable<Comment>{
    
    private String author,content;
    private LocalDateTime date;

    public Comment(String author, String content) {
        this.author = author;
        this.content = content;
        this.date = LocalDateTime.now();
    }

     public Comment(String author, String content, LocalDateTime date ) {
        this.author = author;
        this.content = content;
        this.date = LocalDateTime.now();
    }
    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getDate() {
        return date;
    }
    
    public String toString()
    {
        return author+": "+content+" ("+date+")";
    }

    @Override
    public int compareTo(Comment comment) {
        return date.compareTo(comment.date);
    }
    
}
