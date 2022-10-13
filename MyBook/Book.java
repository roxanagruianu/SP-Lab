import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    Author author;
    List<Chapter> chapters = new ArrayList<Chapter>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author a) {
        this.author = a;
    }
    public int createChapter(String title){
        Chapter chap = new Chapter(title);
        subchapters.add(chap);
        return chapters.size()-1;
    }

    public Chapter getChapter(int index){
        return chapters.get(index);
    }

}
