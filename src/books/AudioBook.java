package books;

import people.Author;

//inheritance
public class AudioBook extends Book {
      private int rating;
      private int length;
	
      public AudioBook(String title, String genre, Author author, double price, int rating, int length) {
		// super is calling Book class's constructor
    	  super(title, genre, author, price);
		this.rating = rating;
		this.length = length;
	}

	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	public int getLength() {
		return length;
	}



	public void setLength(int length) {
		this.length = length;
	}
      
	@Override
	public String toString() {
		return super.toString() +"AudioBook [rating=" + rating + ", length=" + length + "]";
	}
     
      
}
