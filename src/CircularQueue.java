
/*
he biggest disadvantage to a circular queue is you can only store queue.length elements. If you are using it as a buffer, you are limiting your history depth.
*/
class CircularQueue<T> {
    Object arrayQueue[];
    public int fron;
    public int rare;
    public int size;

    public CircularQueue(int size) {
        this.size = size;
        arrayQueue = new Object[size];
        rare = -1;
        fron = -1;
    }
    boolean isfull() {//  الاتنين يساوو بعض اضافه علي اد الحذف او الفونت متحركتش لانك ماحذفتش والرار بحجم المصفوفه اي تم ملئها
       // return (fron == rare && fron != -1&& rare != -1) || (fron == -1 && rare == (size - 1));
       return (fron == rare && fron != -1) || (fron == -1 && rare == (arrayQueue.length - 1));
    }

    boolean isEmpty() {

        return rare == -1 && fron == -1;
    }

    public void enqueue(Object newItem) {
        if (isfull()) {
            System.out.println("queue is full");
        }
           rare = (rare + 1) % arrayQueue.length;
            arrayQueue[rare] = newItem;
            if (fron==-1); //just first own
            fron=0;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return null;
        }
        T ObjectOut = (T) arrayQueue[fron];
        fron = (fron + 1) % arrayQueue.length;
 //        if (fron == rare) {
//            fron = -1;
//            rare = -1;
//        }
        return ObjectOut;

    }


}
