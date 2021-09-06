package JavaCodes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fileread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int ch;
		FileReader fr=null;
		try
		{
			fr=new FileReader("d:\\sample.txt");
					
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("File not found");
		}
		while ((ch=fr.read())!=-1)
		System.out.print((char)ch);
		fr.close();
		}
	}


