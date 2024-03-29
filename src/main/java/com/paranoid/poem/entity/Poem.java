package com.paranoid.poem.entity;

public class Poem {
	private String id;
	private String title;
	private String author;
	private String paragraphs;
	private String dynasty;
	public Poem() {
	}
	public Poem(String id, String title, String author, String paragraphs, String dynasty) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.paragraphs = paragraphs;
		this.dynasty = dynasty;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getParagraphs() {
		return paragraphs;
	}
	public void setParagraphs(String paragraphs) {
		this.paragraphs = paragraphs;
	}
	public String getDynasty() {
		return dynasty;
	}
	public void setDynasty(String dynasty) {
		this.dynasty = dynasty;
	}
	@Override
	public String toString() {
		return "Poem [id=" + id + ", title=" + title + ", author=" + author + ", paragraphs=" + paragraphs + ", dynasty=" + dynasty +"]";
	}
	
	
}
