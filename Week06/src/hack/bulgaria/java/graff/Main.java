package hack.bulgaria.java.graff;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static class Node {
		private int value;
		private Node left;
		private Node right;
		
		public Node(int value, Node left, Node right) {
			super();
			this.value = value;
			this.left = left;
			this.right = right;
		}
		public int getValue() {
			return value;
		}
		
		public static Node build(List<Integer> values){
			if (values.isEmpty()) {
				return null;
			}
			int middle = values.size() /2;
			int value = values.get(middle);
			Node left = build(values.subList(0, middle));
			Node right = build(values.subList(middle + 1, values.size()));
			return new Node(value, left, right);
		}
		
		public void print(String prefix) {
			if (left != null) {
				left.print(prefix + " ");
			}
			System.out.print(prefix);
			System.out.println(value);
			if (right != null) {
				right.print(prefix + " ");
			}
		}
		
		public static int size(Node node) {
			if (node == null) {
				return 0;
			}
			return 1 + size(node.left) + size(node.right);
		}
		
		public static int depth(Node node, int d) {
			if (node == null) {
				return d;
			}
			return Math.max(depth(node.left, d+1), depth(node.right, d+1));
		}
	}
	
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 4, 6, 7, 10, 12, 15, 20, 23);
		Node root = Node.build(values);
		root.print("");
		
	}

}
