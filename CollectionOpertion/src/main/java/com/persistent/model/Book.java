package com.persistent.model;

public class Book {
	private String title;
	private String author;
	private double cost;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String author, double cost) {
		super();
		this.title = title;
		this.author = author;
		this.cost = cost;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", cost=" + cost
				+ "]";
	}
	

}
