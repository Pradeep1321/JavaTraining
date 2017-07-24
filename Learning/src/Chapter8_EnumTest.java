

import java.util.EnumSet;

public class Chapter8_EnumTest {

	public static void main( String[] args )
	{
		System.out.println( "All books:\n" );
		
		// print all books in enum Book
		for (Chapter8_Book book : Chapter8_Book.values())
			System.out.printf( "%-10s%-45s%s\n", book, book.getTitle() , book.getCopyrightYear() );
		
		
		System.out.println( "\nDisplay a range of enum constants:\n" );

		for (Chapter8_Book book : EnumSet.range(Chapter8_Book.JHTP, Chapter8_Book.CPPHTP))
			System.out.printf( "%-10s%-45s%s\n", book, book.getTitle() , book.getCopyrightYear() );

		
	}
	
}
