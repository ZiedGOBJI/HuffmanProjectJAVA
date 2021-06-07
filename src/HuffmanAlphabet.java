import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

// Classe responsable de la r�cup�ration des fr�quences et des charact�res

public class HuffmanAlphabet {

	private static ArrayList<HuffmanNode> liste_noeuds = new ArrayList<HuffmanNode>();

	public static ArrayList<HuffmanNode> alphabet() throws IOException {

		FileReader file = new FileReader("exemple_freq.txt");
		BufferedReader buffer = new BufferedReader(file);

		for (int i = 0; i < 500; i++) {
			String line = buffer.readLine();
			if (line != null && line.length() != 1) {

				// transformation de chaque line en une liste de string
				String[] clean_line = line.split(" "); // on enl�ve l'espace entre les 2 �l�ments

				// cr�ation de nodes associ�es � chaque charact�re
				String charac = clean_line[0]; // on r�cup�re le charact�re
				
				int freq = Integer.parseInt(clean_line[1]); // on r�cup�re la fr�quence
				
				HuffmanNode node = new HuffmanNode(freq, charac); // on cr�e la node
				
				liste_noeuds.add(node); // on ajoute chaque node que l'on a cr�� dans la liste de noeuds
			}
		}
		return liste_noeuds;
	}

}