
// Classe responsable de l'objet noeud 'Node'

public class HuffmanNode implements Comparable<HuffmanNode> {

	
	public Integer freq;
	public String charac;
	public HuffmanNode leftNode, rightNode;

	// Constructeur d'un noeud 'feuille' (sans children)
	public HuffmanNode(Integer freq, String charac) {

		this.freq = freq;
		this.charac = charac;

		this.leftNode = null;
		this.rightNode = null;

	}

	// différents getters et setters
	public Integer getFreq() {
		return freq;
	}

	public void setFreq(Integer freq) {
		this.freq = freq;
	}

	public String getCharac() {
		return charac;
	}

	public void setCharac(String charac) {
		this.charac = charac;
	}

	public HuffmanNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(HuffmanNode leftNode) {
		this.leftNode = leftNode;
	}

	public HuffmanNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(HuffmanNode rightNode) {
		this.rightNode = rightNode;
	}
	
	boolean is_leaf() {
		return (this.leftNode == null && this.rightNode == null);
	}
	
	
	// Surcharge du constructeur pour le cas avec children 
	public HuffmanNode(HuffmanNode left, HuffmanNode right) {
		this.rightNode = right;
		this.leftNode = left;
		this.charac = "";
		this.freq = left.freq + right.freq;
	}
	
	
	// Permet le tri entre nodes dans 'HuffmanTree', en particulier permet l'utilisation de la méthode 'sort' de 'Collections'
	@Override
    public int compareTo(HuffmanNode o) {
        if (this.freq == o.freq) {
            return this.charac.compareTo(o.charac);
        }else {
            return this.getFreq().compareTo(o.getFreq());
        }
        
    }

	// Pour l'affichage
	@Override
	public String toString() {
		return freq + "" + charac;
	}

}
