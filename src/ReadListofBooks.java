
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class ReadListofBooks {

	public static void main(String[] args) {
		System.out.println((System.getProperty("user.dir") + File.separatorChar +"mybooks.txt"));
		String filename = (System.getProperty("user.dir") + File.separatorChar +"mybooks.txt");
		writeBooks(filename);
		ArrayList<String> myBooks = readBooks(filename);
		// Method 1 : to list all entries in ArrayList
		for(String book: myBooks) {
			System.out.println(book);
		}

		// Method 2 : to list all entries in ArrayList
		for(int i=0; i<myBooks.size(); i++) {
			System.out.println("Book #" + i + " " + myBooks.get(i));
		}
	}
	
	public static void writeBooks(String filename) {
		//get a filename
	
		
		//write file
		//Data can be output to a text file using the class PrintWriter
		//This class includes the methods print and println that you have
		//already used for terminal output
		//A PrintWriter is opened like a Scanner
		//you must handle the FileNotFound Exception
		PrintWriter writer;
		try {
			
			File bookfile = new File(filename);
			writer = new PrintWriter(filename);
			writer.println("Harry Potter");
			writer.println("Home Alone");
			writer.println("Final Destination");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static ArrayList<String> readBooks(String filename) {
		ArrayList<String> books = new ArrayList<String>();
		File bookfile = new File(filename);

		try {
		    BufferedReader reader = new BufferedReader(new FileReader(filename));
		  	      //for (Integer i = 0; i  reader.readLines(File file) throws Exception {
			 if (!bookfile.exists()) {
				return books;
			}
		      String line = reader.readLine();
		      while (line != null) {
		    	  books.add(line);
		          line = reader.readLine();
		      }
		      reader.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	      // Print from ArrayList
	      
	      return books;
	  }
	}

		
		
		

