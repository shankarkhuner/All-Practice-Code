import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
public class Practice {
	Public static void main(String[] args)throws FileNotFoundException, IOException
	{
		FileReader fis = new FileReader("D:\\Input.txt");
		FileWriter fos = new FileWriter("D:\\Output.txt");
		int info;
		while((info=fis.read())!=-1)
		{
			System.out.println(" "+(char)info);
			fos.write(info);
		}
		
	}

}
