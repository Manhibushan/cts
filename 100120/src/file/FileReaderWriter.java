package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
	public static void main(String[] args) throws IOException
	{
		File inputfile=new File("myfraggo.txt");
		File outputfile=new File("outgain.txt");
		FileReader in=new FileReader(inputfile);
		FileWriter out=new FileWriter(outputfile);
		int c;
		while((c=in.read())!=-1)
		{
			System.out.println((char)c);
			out.write(c);
			
		}
		System.out.println("file reader file writer");
		in.close();
		out.close();
	}

}
