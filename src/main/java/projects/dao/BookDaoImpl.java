package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import projects.Book;

public class BookDaoImpl implements BookDao{

	public boolean insertBooksList(Book book) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","teju@123");
			String query = "insert into Books(`name`,`price`,`author`) values(?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, book.getName());
			pst.setFloat(2,price);
			pst.setString(3, author);
			pst.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateBooksList(Book book) {
		return false;
	}

	public boolean deleteBook(String name) {
		return false;
	}

}
