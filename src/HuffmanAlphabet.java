import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

// Classe responsable de la récupération des fréquences et des charactères

public class HuffmanAlphabet {

	private static ArrayList<HuffmanNode> liste_noeuds = new ArrayList<HuffmanNode>();

	public static ArrayList<HuffmanNode> alphabet() throws IOException {

		FileReader file = new FileReader("exemple_freq.txt");
		BufferedReader buffer = new BufferedReader(file);

		for (int i = 0; i < 500; i++) {
			String line = buffer.readLine();
			if (line != null && line.length() != 1) {

				// transformation de chaque line en une liste de string
				String[] clean_line = line.split(" "); // on enlève l'espace entre les 2 éléments

				// création de nodes associées à chaque charactère
				String charac = clean_line[0]; // on récupère le charactère
				
				int freq = Integer.parseInt(clean_line[1]); // on récupère la fréquence
				
				HuffmanNode node = new HuffmanNode(freq, charac); // on crée la node
				
				liste_noeuds.add(node); // on ajoute chaque node que l'on a créé dans la liste de noeuds
			}
		}
		return liste_noeuds;
	}

}