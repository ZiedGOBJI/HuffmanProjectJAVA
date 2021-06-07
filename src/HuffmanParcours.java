import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


// Classe responsable du parcours dans l'arbre

public class HuffmanParcours {
	
	public String parcours(HuffmanTree tree) throws IOException {
		
		String resultat = ""; // On initialise le résultat
		HuffmanBinary hb = new HuffmanBinary();
		
		String code_bin = hb.code_binaire(); // on récupère le code binaire
		
		char[] code_bine = code_bin.toCharArray(); // on transforme le code binaire en char[]
		
		
		/* pour chaque charactère dans notre code binaire, on regarde si le noeud actuel est une feuille
		 * 
		 * si le noeud est une feuille, alors on recommence le parcours de l'arbre depuis la root
		 * 
		 * si le charactere est un 0, on passe au fils gauche, sinon au fils droit
		 * 
		 * on affiche le résultat, qui correspond au message décodé 
		 * 
		 */
		
		for(char c : code_bine ) {
			
			HuffmanNode current = tree.getCurrent();
			
			System.out.println(current);
			
			if(current.is_leaf()) {
				
				resultat += current.getCharac();
				
				tree.setCurrent(tree.getRoot());
			}
			if(c == "0".charAt(0)) {
				
				tree.setCurrent(tree.getCurrent().leftNode);	
			}
			if(c == "1".charAt(0)) {
				
				tree.setCurrent(tree.getCurrent().rightNode);	
			}
		}
		if(tree.getCurrent().is_leaf()) {
			
			resultat += tree.getCurrent().getCharac();
			
			tree.setCurrent(tree.getRoot());
		}
		
		System.out.println(resultat);
		
		return resultat;
	}
}
	

	
	