package blog2018;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    private List<Note> notes = new ArrayList();
    private String title;

    public Blog(String title) {
        this.title = title;
    }
    
    
    public void add(Note note)
    {
        notes.add(note);
    }
    
    public String toString()
    {
        return title + "\n\n"+notes;
    }
     public Note mostPopular()
    {
        if(notes.isEmpty()) return null;
        Note result = notes.get(0);
        for(Note note : notes)
        {
           int count =  note.numberOfComments();
           if(count>result.numberOfComments())
           {
               result = note;
           }
        }
        return result;
        
    }
    public List<Note> mostPopulars()
    {
        
        return null;
    }
    
    public Comment lastComment()
    {
        
        return null;
    }
    public List<Comment> lastComments()
    {
        return null;
    }
}
