package projects.dao;

import projects.Book;

public interface BookDao {
	boolean insertBooksList(Book b);
	boolean updateBooksList(Book book);
	boolean deleteBook(String name);
	

}
