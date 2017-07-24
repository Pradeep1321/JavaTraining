/**
 * @author PNimmanapalli
 *Byte-Based and Character-Based Streams:

File streams can be used to input and output data as bytes or characters. Byte-based
streams input and output data in its binary format. Character-based streams input and
output data as a sequence of characters. If the value 5 were being stored using a byte-based
stream, it would be stored in the binary format of the numeric value 5, or 101. If the value
5 were being stored using a character-based stream, it would be stored in the binary format
of the character 5, or 00000000 00110101 (this is the binary representation for the numeric
value 53, which indicates the Unicode® character 5).

Files that are created using byte-based streams are referred to as binary files,
while files created using character-based streams are referred to as text files.
Text files can be read by text editors, while binary files are read by programs that understand the file’s
specific content and its ordering. 

Standard Input, Standard Output and Standard Error Streams:

Class System provides methods setIn, setOut and setErr to redirect the
standard input, output and error streams, respectively.

The java.io Package:
FileInputStream (for byte-based input from a file), FileOutputStream (for byte-based output to a file), FileReader (for character-
based input from a file) and FileWriter (for character-based output to a file), which
inherit from classes InputStream, OutputStream, Reader and Writer, respectively


java.io classes, character-based input and output can be performed
with classes Scanner and Formatter. Class Scanner is used extensively to input
data from the keyboard—it can also read data from a file. Class Formatter enables formatted
data to be output to any text-based stream in a manner similar to method
System.out.printf.

17.3 Class File:
class File, which is useful for retrieving information about files or
directories from disk. Objects of class File do not open files or provide any file-processing
capabilities. However, File objects are used frequently with objects of other java.io classes
to specify files or directories to manipulate.

static method System.exit and pass the value 1. This method terminates the application. An
argument of 0 to method exit indicates successful program termination. A nonzero value,
such as 1 in this example, normally indicates that an error has occurred.

On Windows, it’s a combination of
a carriage return and a line feed—represented as \r\n. You can use the %n format specifier
in a format control string to output a platform-specific line separator, thus ensuring that
the text file can be opened and viewed correctly in a text editor for the platform on which
the file was created.


 *
 *
 */


import java.io.File;
import java.util.Scanner;

public class Chapter17_Files {

	public static void main( String[] args )
	{
	
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter file or directory name: " );
		
		analyzePath( input.nextLine() );
	}
	
	public static void analyzePath( String path )
	{
		// create File object based on user input
		File name = new File( path );
		
		if ( name.exists() )
		{
			System.out.printf( "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",  name.getName() , " exists",
					( name.isFile() ?"is a file" : "is not a file" ),
					( name.isDirectory() ?"is a directory" : "is not a directory" ),
					( name.isAbsolute()  ?"is absolute path" : "is not absolute path" ), "Last modified: ",
					name.lastModified() , "Length: ", name.length() ,
					"Path: ", name.getPath() , "Absolute path: ", 
					name.getAbsolutePath(), "Parent: ", name.getParent() );
			if ( name.isDirectory() ) // output directory listing
			{
				String[] directory = name.list();
				System.out.println( "\n\nDirectory contents:\n" );
				for ( String directoryName : directory )
					System.out.println( directoryName );
				
			}
			else
				System.out.printf( "%s %s", path, "does not exist." );
			
		}
	}
	
}
