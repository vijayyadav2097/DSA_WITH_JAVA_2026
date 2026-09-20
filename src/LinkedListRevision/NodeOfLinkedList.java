package LinkedListRevision;
public class NodeOfLinkedList {
    public static void main(String args[]) {
        Node a = new Node(100);
     //   a.val = 100;
        Node b = new Node(200);
      //  b.val = 200;
        Node c = new Node(300);
     //   c.val = 300;
        Node d = new Node(400);
     //   d.val = 400;
        Node e = new Node(500);
     //   e.val = 500;
        Node f = new Node(600);
     //   f.val = 600;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(c);
        System.out.println(b.next + " ");
        System.out.println(a.next.next+" ");
    }
}
