package blog2018;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NewMain {

    public static void main(String[] args) {
        Blog blog = new Blog("Blog programistyczny");
        Note note1 = new Note("Co nowego w Java 9","Co nowego w Java 9");
        Note note2 = new Note("Kolekcje","Kolekcje");
        Note note3 = new Note("JavaFX","Aplikacje desktopowe");
        blog.add(note3);
        blog.add(note2);
        blog.add(note1);
        Comment c1 = new Comment("jan","Kolekcje są bardzo trudne");
        note2.add(c1);
        Comment c2 = new Comment("qwerty","No coś ty, bardzo łatwe");
        note2.add(c2);
        System.out.println(blog);
        System.out.println("-------");
        System.out.println(blog.mostPopular());
        System.out.println("-------");
        LocalDate d1 = LocalDate.of(2018, Month.MARCH, 1);
        LocalDate d2 = LocalDate.of(2018, Month.FEBRUARY, 2);
        long u = d1.until(d2,ChronoUnit.MINUTES);
        System.out.println(u);
        long u = d2.until(d1,ChronoUnit.MINUTES);
        System.out.println(u2);
        System.out.println("-------");
        System.out.println(blog.lastComment());
    }
    
}
