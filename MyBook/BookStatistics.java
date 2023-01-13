
public class BookStatistics implements Visitor{

	int noBook, noSection, noTOC, noParagraph, noImageProxy, noImage, noTable;
	
	
	
	public BookStatistics() {
		super();
		this.noBook = 0;
		this.noSection = 0;
		this.noTOC = 0;
		this.noParagraph = 0;
		this.noImageProxy = 0;
		this.noImage = 0;
		this.noTable = 0;
	}

	@Override
	public void visitBook(Book b) {
		noBook ++;
	}

	@Override
	public void visitSection(Section s) {
		noSection++;
	}

	@Override
	public void visitTableOfContents(TableOfContents toc) {
		noTOC++;		
	}

	@Override
	public void visitParagraph(Paragraph p) {
		noParagraph++;
	}

	@Override
	public void visitImageProxy(ImageProxy ip) {
		noImageProxy++;
	}

	@Override
	public void visitImage(Image i) {
		noImage++;
	}

	@Override
	public void visitTable(Table t) {
		noTable++;
	}
	
	public void printStatistics() {
		System.out.println("Book Statistics:");
		int noTotalImage = noImage + noImageProxy;
		System.out.println("*** Number of images: " + noTotalImage);
		System.out.println("*** Number of tables: " + noTable);
		System.out.println("*** Number of paragraphs: " + noParagraph);
	}
}
