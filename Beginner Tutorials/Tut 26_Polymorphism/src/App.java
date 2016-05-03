public class App {

	public static void main(String[] args) {

		Plant plant1 = new Plant();		

		// Tree is a kind of Plant (it extends Plant)
		Tree tree = new Tree();
		
		Plant plant3 = plant1;
		// plant1 reference variable refers to an object of type Plant
		// plant 3 reference variable refers to the same object plant 1 refers to
		// plant1 ---> Plant (Plant object) <--- plant3
		
		// polymorphism hem inheritance'da hem de interface'de olabilir
		
		// Polymorphism (many phases) guarantees that we can use a child class
		// wherever a parent class is expected.
		Plant plant2 = tree; // Plant plant2 = new Tree();
		// plant 2 reference variable points to a kind of plant 
		// since tree is a subclass of plant
		// plant 2 reference variable points to a Tree object: 
		// (Plant class) plant2 ---> Tree object <--- tree ref variable
		
		// Plant plant2 = new Tree();
		// Plant plant2 = tree; ye göre
		// override etme gibi bir durum olabilir (?)
	

		// plant2 references a Tree, so the Tree grow() method is called.
		// Type of the object that variable refers to determines what actual methods are called
		plant2.grow();

		// The type of the reference decided what methods you can actually call;
		// we need a Tree-type reference (variable) to call tree-specific methods.
		tree.shedLeaves();

		// ... so this won't work. 
		// plant2.shedLeaves();

		// Another example of polymorphism.
		doGrow(tree);
	}

	public static void doGrow(Plant plant) {  // Plant plant = tree; diyormuþuz gibi
		// plant yerine plant1 denebilirdi
		
		// Plant yerine Tree dense sonuç deðiþmezdi ama anlam deðiþirdi 
		// ve shedLeaves metodu da call edilebilirdi  
		plant.grow();
	}

}
/*
Tree growing
Leaves shedding.
Tree growing
*/