

class lLinkedList {
	static class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;

		}
        public Node(){}
	}

	 Node GetNode(int data) {
		return new Node(data);
	}

	 Node InsertPos(Node headNode, int position, int data) {
		Node head = headNode;
		if (position < 1)
			System.out.print("Invalid position");

		if (position == 1) {
			Node newNode = new Node(data);
			newNode.next = headNode;
			head = newNode;
		} else {
			while (position-- != 0) {
				if (position == 1) {
					Node newNode = GetNode(data);

					newNode.next = headNode.next;

					headNode.next = newNode;
					break;
				}
				headNode = headNode.next;
			}
			if (position != 1)
				System.out.print("Position out of range");
		}
		return head;
	}

	 void PrintList(Node node) {
		while (node != null) {
			System.out.print(node.data);
			node = node.next;
			if (node != null)
				System.out.print(",");
		}
		System.out.println();
	}
    public void append(int new_data ,Node head)
    {
       
        Node new_node = new Node(new_data);
 
       
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }
 
        
        new_node.next = null;
 
       
        Node last = head;
        while (last.next != null)
            last = last.next;
 
        
        last.next = new_node;
        return;
    }

	public static void main(String[] args) {
		lLinkedList l1 = new lLinkedList();
        Node head = l1.GetNode(3);
        l1.append(10,head);
        l1.append(30,head);
        l1.append(40,head);
        l1.append(50,head);
        head=l1.InsertPos(head, 3, 20);
        l1.PrintList(head);
        
		
		
	}
}

