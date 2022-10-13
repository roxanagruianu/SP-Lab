public class SubChapter {
    String name;
    List<Paragraph> paragraphs = new ArrayList<Paragraph>();
    List<Image> images = new ArrayList<Image>();
    List<Table> tables = new ArrayList<Table>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(Paragraph p) {
        paragraphs.add(p);
    }
    public void createNewImage(Image i) {
        images.add(i);
    }
    public void createNewTable(Table t) {
        tables.add(t);
    }

    public void print(){
        System.out.println("Subchapter: "+name);
        for(int i=0;i<paragraphs.size();i++)
            paragraphs.get(i).print();
        for(int i=0;i<images.size();i++)
            images.get(i).print();
        for(int i=0;i<tables.size();i++)
            tables.get(i).print();
    }
}