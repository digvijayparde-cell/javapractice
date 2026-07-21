package constructor;

import java.util.Scanner;

public class Book {

	String title;
	String author;
	int totalPages;
	int currentPage;

	public Book(String title, String author, int totalPages) {
		this.title = title;
		this.author = author;
		this.totalPages = totalPages;
		this.currentPage = 0;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter book name: ");
		String tit = sc.nextLine();

		System.out.print("Enter author name: ");
		String auth = sc.nextLine();

		System.out.print("Enter total pages: ");
		int totalPage = sc.nextInt();

		Book r1 = new Book(tit, auth, totalPage);
		
		System.out.println("are you reading the book : true/false :");
		boolean isReading = sc.nextBoolean();
		System.out.println("how many pages did you read :");
		int page = sc.nextInt();

		r1.readPages(isReading,page);
		r1.displayProgress();

	}

	void readPages(boolean isReading, int page) {
		
		if (isReading) {
			this.currentPage += page;
		}
	}

	public void displayProgress() {

		System.out.println("Book Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Pages Read: " + this.currentPage + " out of " + this.totalPages);
	}
}