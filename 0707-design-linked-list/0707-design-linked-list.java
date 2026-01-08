class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int x) {
        val = x;
    }
}

class MyLinkedList {
    ListNode head;
    ListNode tail;
    int size=0;

    public MyLinkedList(){
        head=new ListNode(-1);
        tail=new ListNode(-1);
        head.next=tail;
        tail.prev=head;
    }

    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        ListNode curr=head;
        for(int i=0;i<=index;i++){
            curr=curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        ListNode newNode=new ListNode(val);
        head.next.prev=newNode;
        newNode.next=head.next;
        head.next=newNode;
        newNode.prev=head;
        size++;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        tail.prev.next=newNode;
        newNode.prev=tail.prev;
        newNode.next=tail;
        tail.prev=newNode;
        size++;

    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index>size) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return ;
        }
        ListNode temp=head;
        for (int i = 0; i <=index; i++) {
            temp = temp.next;
        }
        ListNode newNode=new ListNode(val);
        temp.prev.next=newNode;
        newNode.prev=temp.prev;
        newNode.next=temp;
        temp.prev=newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index<0 ||index>=size)return;
        ListNode temp = head;
        for (int i = 0; i <=index; i++) {
            temp = temp.next;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        size--;
        return;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */