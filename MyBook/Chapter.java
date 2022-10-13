public class Chapter{
    String name;
    List<SubChapter> subchapters = new ArrayList<SubChapter>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String title){
        SubChapter subc = new SubChapter(title);
        subchapters.add(subc);
        return subchapters.size()-1;
    }

    public SubChapter getSubChapter(int index){
        return subchapters.get(index);
    }

    public void print(){
        System.out.println(name);
        for(int i=0;i<subchapters.size();i++){
            subchapters.get(i).print();
        }
    }
}