import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Classe responsable de l'obtention du code binaire à partir du fichier

public class HuffmanBinary {

	public String code_binaire() throws IOException{
		
		   FileReader file = new FileReader("exemple_comp.txt");
		   BufferedReader buffer = new BufferedReader(file);
		    	  String line = buffer.readLine();
				return line;
	}
}

