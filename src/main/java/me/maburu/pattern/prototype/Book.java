package me.maburu.pattern.prototype;

public class Book implements Cloneable {
	
	private String title;
	
	private int pageNum;
	
	private Author author;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public Book clone() {
		Book book = null;
		try {
			book = (Book)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return book;
	}
}
