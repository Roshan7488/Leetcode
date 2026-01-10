class MyCircularQueue {

    int[] arr;
    int k;
    int front;
    int rear;
    int count;
    public MyCircularQueue(int k) {
        this.k=k;
        arr=new int[k];
        count=0;
        front=-1;
        rear=-1;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        if(front==-1 && rear==-1){
            front=rear=0;
            arr[rear]=value;
            count++;
        }
        else{
            rear=(rear+1)%k;
            arr[rear]=value;
            count++;
        }
        return true;
        
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        front=(front+1)%k;
        count--;
        if(count==0){
            front=rear=-1;
        }
        return true;
    }
    
    public int Front(){
        if(front==-1) return -1;
        return arr[front];
    }
    
    public int Rear() {
      if(rear==-1) return -1;
      return arr[rear];
    }
    
    public boolean isEmpty() {
       return front==-1 && rear==-1;
    }
    
    public boolean isFull() {
        return count==k;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */