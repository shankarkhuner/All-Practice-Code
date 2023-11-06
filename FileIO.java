package practice_code;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		FileReader fr = new FileReader("D:\\ATM.txt");
		FileWriter fw = new FileWriter("D:\\AMd.txt");
		int info;
		while((info=fr.read())!= -1) {
			System.out.println(" "+(char)info);
			fw.write(info);
			
		}
		fr.close();
		fw.close();

	}

}
