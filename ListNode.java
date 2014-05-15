public class ListNode {
    public ListNode next;
    public int val;

    public ListNode(int value, ListNode next) {
        this.val = value;
        this.next = next;
    }

    public ListNode(int value) {
        this.val = value;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public String traverseToEnd() {

        ListNode printNode = this;
        StringBuilder strBuilder = new StringBuilder();
        while (printNode.next != null) {
            strBuilder.append(printNode.val + " ");
            printNode = printNode.next;
        }
        /*write this outside the loop because 
        don't want a space after the last node in the list.*/
        strBuilder.append(printNode.val);
        return strBuilder.toString();

    }
    
    public static void main(String[] args){
    	ListNode l3 = new ListNode(3);
    	ListNode l2 = new ListNode(2, l3);
    	ListNode l1 = new ListNode(1, l2);
    	System.out.println(l1.traverseToEnd());
    }

}
