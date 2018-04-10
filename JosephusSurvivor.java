public class JosephusSurvivor {

	class DoublyLinkedList {
		Node start;
		Node end;
		public int size = 0;

		class Node {
			int data;
			Node prev;
			Node next;

			public Node(int data) {
				this.data = data;
			}
		}

		public void append(int val) {
			Node node = new Node(val);

			if (this.start == null) {
				node.prev = null;
				this.start = node;
				this.end = this.start;
				this.start.data = node.data;
				this.start.next = this.end;
				this.start.prev = this.end;
				this.size = 1;
				return;
			}

			node.next = this.start;
			node.prev = this.end;
			node.prev.next = node;
			this.end = node;
			this.start.prev = this.end;
			this.size++;
		}

		public void remove(Node n) {
			Node prev = n.prev;
			Node next = n.next;
			prev.next = next;
			next.prev = prev;
			this.size--;
		}

		public int removeByKUntilOneRemaining(int k, Node n) {
			Node current;

			if (n == null) {
				current = this.start;
			} else {
				current = n;
			}
			System.out.println("a");
			while (this.size > 1) {
				for (int i = 1; i < k; i++) {
					current = current.next;
				}
				remove(current);
				if (current == this.start)
					this.start = current.next;
				removeByKUntilOneRemaining(k, current.next);
			}
			return this.start.data;
		}

		public void print() {
			Node current = this.start;
			for (int i = 0; i < this.size; i++) {
				if (current != null) {
					current = current.next;
				}
			}
			System.out.println();
		}
	}

	public static int josephusSurvivor(final int n, final int k) {
		DoublyLinkedList dll = new JosephusSurvivor().new DoublyLinkedList();
		int output = 0;
		for (int i = 1; i <= n; i++) {
			dll.append(i);
		}
		output = dll.removeByKUntilOneRemaining(k, null);
		return output;
	}
	
	public static void main(String[] args) {
		josephusSurvivor(1,300);
	}

	

}
