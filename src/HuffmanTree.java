
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Classe responsable de la création de l'arbre d'encodage

public class HuffmanTree {

	private HuffmanNode current; // noeud current = le noeud sur lequel on est
	private HuffmanNode root; // root = noeud racine

	public HuffmanTree() {

	}

	public void construction_arbre() throws IOException {

		ArrayList<HuffmanNode> liste_noeuds = HuffmanAlphabet.alphabet(); // on initialise la liste des noeuds

		/* Tant que la liste des noeuds est supérieure à 1,
		 * 
		 * on trie les noeuds par fréq croissantes
		 * 
		 * on récupère les 2 noeuds avec les plus petites fréquences
		 * 
		 * on enlève les noeuds de la liste des noeuds
		 * 
		 * on ajoute le nouveau noeud formé de ces 2 noeuds
		 */
		
		
		while (liste_noeuds.size() > 1) { 
			 
			Collections.sort(liste_noeuds);
			
			HuffmanNode node1 = liste_noeuds.get(0);
			HuffmanNode node2 = liste_noeuds.get(1);

			liste_noeuds.remove(node1);
			liste_noeuds.remove(node2);

			liste_noeuds.add(new HuffmanNode(node1, node2));
		}
		
		this.current = liste_noeuds.get(0); // il ne reste qu'un élément, la racine
		
		this.root = current; // on initialise le noeud de départ à la root
	}

	
	// différents getters et setters 
	public HuffmanNode getCurrent() {
		return current;
	}

	public void setCurrent(HuffmanNode current) {
		this.current = current;
	}

	public HuffmanNode getRoot() {
		return root;
	}

	public void setRoot(HuffmanNode root) {
		this.root = root;
	}
}
