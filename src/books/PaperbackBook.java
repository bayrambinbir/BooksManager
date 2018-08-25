package books;

import people.Author;

public class PaperbackBook extends Book{
	private int copiesAvailable;
	private int pagesCount;
	
	
	public PaperbackBook(String title, String genre, Author author, double price, int copiesAvailable, int pagesCount) {
		super(title, genre, author, price);
		this.copiesAvailable = copiesAvailable;
		this.pagesCount = pagesCount;
	}


	public int getCopiesAvailable() {
		return copiesAvailable;
	}


	public void setCopiesAvailable(int copiesAvailable) {
		this.copiesAvailable = copiesAvailable;
	}


	public int getPagesCount() {
		return pagesCount;
	}


	public void setPagesCount(int pagesCount) {
		this.pagesCount = pagesCount;
	}


	@Override
	public String toString() {
		return super.toString() + " ,copiesAvailable=" + copiesAvailable + ", pagesCount=" + pagesCount + "]";
	}
	
	

}
