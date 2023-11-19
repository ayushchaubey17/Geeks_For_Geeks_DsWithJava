public class Insertion_Of_Two_sorted_linked_list {

    // Node for creating Node
    static class Node {

        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }

    }


    // method for creating list 1
    public static Node createlist1(){
        Node head1;
        Node a1      = new Node(1);
        Node a2 = new Node(2);
        Node a3 = new Node(3);
        Node a4 = new Node(4);
        Node a5 = new Node(6);

        head1 = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        return head1;

    }


    // method for creating list 2
    public static Node createlist2(){
        Node head1;
        Node a1      = new Node(2);
        Node a2 = new Node(4);
        Node a3 = new Node(6);
        Node a4 = new Node(8);

        head1 = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        return head1;

    }



    // main method
    public static void main(String[] args) {

        Node head1 = createlist1();
        Node head2 = createlist2();

        Node head =   Intersection(head1, head2);

        printlist(head);









    }



    // method for inserti
    public  static Node Intersection(Node f, Node s){
        Node temp = new Node(0);

        Node p = temp;

        while (f!= null && s!= null)
        {
            if (f.data == s.data) {
                p.next = f;
                p = p.next;
                f= f.next;
                s = s.next;
            }

            else if(f.data> s.data)  s= s.next;

            else f = f.next;

        }
        p.next = null;

        return temp.next;




    }

    // method for print list

    public static void printlist(Node head){

        Node temp = head;
        while (temp!= null)
        {
            System.out.print(temp.data+"--->");
            temp = temp.next;
        }


    }

}





