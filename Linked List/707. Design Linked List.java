class MyLinkedList {
    int size;
    ListNode dummy;
    
    public class ListNode{
        int val;
        ListNode next;
        
        ListNode(int x) {val = x;}
    }

    public MyLinkedList() {
        size = 0;
        dummy = new ListNode(0);
    }
    
    public int get(int index) {
        if(index<0 || index>=size) return -1;
        ListNode temp = dummy;
        while(index>=0){
            temp = temp.next;
            index--;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);        
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size) return;
        ListNode n = new ListNode(val);
        ListNode temp = dummy;
        while(index>0){
            temp = temp.next;
            index--;
        }
        ListNode node = temp.next;
        temp.next = n;
        n.next = node;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return;
        ListNode curr = dummy;
        size--;
        for(int i = 0; i < index; ++i){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        
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
