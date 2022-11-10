
public interface Visitor {
	public void visitBook(Book b);
	public void visitSection(Section s);
	public void visitTableOfContents(TableOfContents toc);
	public void visitParagraph(Paragraph p);
	public void visitImageProxy(ImageProxy ip);
	public void visitImage(Image i);
	public void visitTable(Table t);
}
