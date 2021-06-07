import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String args[]) throws IOException {

		// Instanciation des différents objets  
		HuffmanTree tree = new HuffmanTree();
		HuffmanParcours hp = new HuffmanParcours();
		
		//System.out.println(tree.construction_arbre());
		
		//System.out.println(hb.code_binaire());
		
		tree.construction_arbre();
		hp.parcours(tree);

	}

}
