
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Classe responsable de la cr�ation de l'arbre d'encodage

public class HuffmanTree {

	private HuffmanNode current; // noeud current = le noeud sur lequel on est
	private HuffmanNode root; // root = noeud racine

	public HuffmanTree() {

	}

	public void construction_arbre() throws IOException {

		ArrayList<HuffmanNode> liste_noeuds = HuffmanAlphabet.alphabet(); // on initialise la liste des noeuds

		/* Tant que la liste des noeuds est sup�rieure � 1,
		 * 
		 * on trie les noeuds par fr�q croissantes
		 * 
		 * on r�cup�re les 2 noeuds avec les plus petites fr�quences
		 * 
		 * on enl�ve les noeuds de la liste des noeuds
		 * 
		 * on ajoute le nouveau noeud form� de ces 2 noeuds
		 */
		
		
		while (liste_noeuds.size() > 1) { 
			 
			Collections.sort(liste_noeuds);
			
			HuffmanNode node1 = liste_noeuds.get(0);
			HuffmanNode node2 = liste_noeuds.get(1);

			liste_noeuds.remove(node1);
			liste_noeuds.remove(node2);

			liste_noeuds.add(new HuffmanNode(node1, node2));
		}
		
		this.current = liste_noeuds.get(0); // il ne reste qu'un �l�ment, la racine
		
		this.root = current; // on initialise le noeud de d�part � la root
	}

	
	// diff�rents getters et setters 
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
