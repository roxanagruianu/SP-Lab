
public interface BookSaveVisitor {
	public void saveBook(Book b);
	public void saveSection(Section s);
	public void saveTableOfContents(TableOfContents toc);
	public void saveParagraph(Paragraph p);
	public void saveImageProxy(ImageProxy ip);
	public void saveImage(Image i);
	public void saveTable(Table t);
}
