public class QueueArray<T> {
//https://www.youtube.com/watch?v=n6LBer5zgUg&list=PLF8OvnCBlEY3a1pbPrE6fvNuV3qi-6KRf&index=13
 //https://www.youtube.com/watch?v=3yKxwHVzisE&list=PLwCMLs3sjOY4UQq4vXgGPwGLVX1Y5faaS&index=9
    Object arrayQueue[];
    public int fron;
    public int rare;
    public int size;

    public QueueArray(int size) {
        this.size = size;
        arrayQueue = new Object[size];
         rare = -1;
         fron = -1;
    }

    boolean isfull() {
        return rare == size - 1;
    }

    boolean isEmpty() {
        return fron == - 1 || fron>rare;
        //return  rare ==-1 && fron ==-1
    }

    public void enqueue(Object newItem) {
        if (isfull()) {
            System.out.println("queue is full");

            return;
        }
//        else if (isEmpty()) fron = rare = 0;//صفرلي القييم دي
        rare=rare+1;
         arrayQueue[rare] = newItem;
         if (fron==-1);
         fron=0;//عشان لما نعمل deque لو هو عنصر واحد بس هنعملخ ونزوده بواحد
    }

    public T dequeue() {
        if(isEmpty()){
            System.out.println("queue is empty");
            return null;
        }
        T ObjectOut=(T) arrayQueue[fron];
        fron=fron+1;
        return ObjectOut;
    }


}
