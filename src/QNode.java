class QNode
{
    public int data;
    public QNode next;
    public QNode prev;
    public QNode(int data, QNode prev)
    {
        this.data = data;
        this.next = null;
        this.prev = prev;
    }
}