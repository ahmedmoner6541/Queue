
  class MyQueueLinkedList
{
    public QNode front;
    public QNode rear;
    public int size;
    public MyQueueLinkedList()
    {
        this.front = null;
        this.rear = null;
    }
    // Add a node into queue
    public void enqueue(int data)
    {
        // Create a new node
        QNode node = new QNode(data, this.rear);
        if (this.front == null)
        {
            // When adding a first node of queue
            this.front = node;
            this.size = 1;
        }
        else
        {
            this.rear.next = node;
            this.size = this.size + 1;
        }
        this.rear = node;
    }
    public boolean isEmpty()
    {
        if (this.size == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // Get a front element of queue
    public int peek()
    {
        if (this.isEmpty() == true)
        {
            System.out.println("\n Empty Queue");
            // When stack is empty
            return -1;
        }
        else
        {
            return this.front.data;
        }
    }
    public int isSize()
    {
        return this.size;
    }
    // Remove a front node of a queue
    public int dequeue()
    {
        if (this.isEmpty() == true)
        {
            // When queue is empty
            return -1;
        }
        else
        {
            int data = this.peek();
            QNode temp = this.front;
            if (this.front == this.rear)
            {
                // When queue contains only one node
                this.rear = null;
                this.front = null;
            }
            else
            {
                this.front = this.front.next;
                this.front.prev = null;
            }
            // Change queue size
            this.size--;
            // Delete node value
            return data;
        }
    }
    // Print elements of queue
    public void printQdata()
    {
        QNode node = this.front;
        System.out.println("\n Queue Element");
        while (node != null)
        {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        MyQueueLinkedList q = new MyQueueLinkedList();
        // Add queue element
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.printQdata();
        System.out.print(" Size : " + q.isSize());
        // Remove queue element
        System.out.print("\n Dequeue Node : " + q.dequeue());
        System.out.print("\n Dequeue Node : " + q.dequeue());
        System.out.print("\n Dequeue Node : " + q.dequeue());
        q.printQdata();
        System.out.print(" Size : " + q.isSize());
    }
}