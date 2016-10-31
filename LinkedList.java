class LinkedList
{
    Node head;
 
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    /* Given a key, deletes the first occurrence of key in linked list */
    void deleteNode(int key)
    {
        Node runningNode = head;
        Node prev = null;

        if(runningNode != null && runningNode.data == key)
        {
            head = runningNode.next;
            return;
        }
        
        while (runningNode != null && runningNode.data != key)
        {
            prev = runningNode;
            runningNode = runningNode.next;
        }

        if (runningNode == null) return;
        prev.next = runningNode.next;
    }
 
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
 
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
 
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
 

 
        llist.deleteNode(1); 

        System.out.println("\nLinked List after Deletion at position 4:");
        llist.printList();
    }
}