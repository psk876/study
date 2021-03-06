package tree;

public class Main {

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(18);
		binaryTree.insert(7);
		binaryTree.insert(26);
		binaryTree.insert(3);
		binaryTree.insert(12);
		binaryTree.insert(31);
		binaryTree.insert(21);
		
		System.out.println(binaryTree.getRoot().getData());
		System.out.println(binaryTree.getRoot().getRight().getData());
		System.out.println(binaryTree.getRoot().getRight().getRight().getData());
		System.out.println(binaryTree.getRoot().getRight().getLeft().getData());
		
		binaryTree.remove(18);
		
		System.out.println(binaryTree.getRoot().getData());
	}

}
