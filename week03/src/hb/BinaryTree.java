package hb;

public class BinaryTree <T extends Comparable<T> >{
private Node root;
	
	private class Node {
		private int element;
		private Node left;
		private Node right;
		
		public Node(int element) {
			this.element = element;
		}
	}

	public void insert(int newElement) {
		if(root == null) {
			root = new Node(newElement);
		} else {
			insertRecursive(newElement, root);
		}
	}
	
	private void insertRecursive(int newElement, Node currentNode) {
		if (newElement < currentNode.element) {
			if(currentNode.left == null) {
				currentNode.left = new Node(newElement);
			} else {
				insertRecursive(newElement, currentNode.left);
			}
		} else if (newElement > currentNode.element){
			if(currentNode.right == null) {
				currentNode.right = new Node(newElement);
			}  else {
				insertRecursive(newElement, currentNode.right);
			} 
		}
	}
	
	public Node find(int target) {
		if (root == null) {
			return null;
		} else {
			return findRecursive(target, root);
		}
	}
	
	private Node findRecursive(int target, Node cuurentNode) {
		if (cuurentNode == null || cuurentNode.element == target) {
			return cuurentNode;
		}
		if (target < cuurentNode.element) {
			return findRecursive(target, cuurentNode.left);
		} else {
			return findRecursive(target, cuurentNode.right);
		}
	}

	private boolean hasRightChild(Node node, int target) {
		return node.right != null && node.right.element != 0;
	}
	
	private boolean hasLeftChild(Node node, int target) {
		return node.left != null && node.left.element != 0;
	}
	
	private Node findParent(Node childNode) {
		if (root == null) {
			return null;
		} else {
			return findParentRecursive(root, childNode);
		}
	}
	
	private Node findParentRecursive(Node currentNode ,Node childNode) {
		if (currentNode != null) {
			if ( currentNode.left.element == childNode.element ||
				currentNode.right.element == childNode.element) {
				return currentNode;
			}
		}
		if ((childNode.element < currentNode.element) && hasLeftChild(currentNode, currentNode.left.element)) {
			return findParentRecursive(currentNode.left, childNode);
		} else if ((childNode.element > currentNode.element) && hasRightChild(currentNode, currentNode.right.element)){
			return findParentRecursive(currentNode.right, childNode);
		}
		return childNode;
	}
	
	public void remove(int target) {
		Node targetNode = find(target);
		if (hasLeftChild(targetNode, target) && !hasLeftChild(targetNode, target)){
			Node parentNode = findParent(targetNode);
			parentNode.left = targetNode.left;
		} else if (hasRightChild(targetNode, target) && !hasRightChild(targetNode, target)) {
			Node parentNode = findParent(targetNode);
			parentNode.right = targetNode.right;
		}
	}
}
