import java.util.Scanner;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
class Linkedlist{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        Node head = new Node(0);
        Node n1 = new Node(10);
        head.next = n1;
        Node n2 = new Node(20);
        n1.next = n2;
        Node n3 = new Node(30);
        n2.next = n3;
        Node n4 = new Node(40);
        n3.next = n4;
        Node n5 = new Node(50);
        n4.next = n5;
        Node n6 = new Node(60);
        n5.next = n6;
        Node n7 = new Node(70);
        n6.next = n7;
        int i = 80;
        while(true)
        {
            System.out.println("Choose a Option");
            System.out.println("1. Add a Node");
            System.out.println("2. Delete a Node");
            System.out.println("3. Print Length");
            System.out.println("4. Reverse the Linked List");
            System.out.println("5. Exit");
            System.out.println("Enter your Choice");
            int n = scn.nextInt();
            System.out.println();
            switch(n)
            {
                case 1:
                {
                    add(head,i);
                    i+=10;
                    break;
                }
                case 2:
                {
                    delete(head);
                    break;
                }
                case 3:
                {
                    length(head);
                    break;
                }
                case 4:
                {
                    head = reverse(head);
                    break;
                }
                case 5:
                {
                    System.exit(0);
                }
                default :
                {
                    System.out.println("Choose a valid Option");
                }
            }
            System.out.println();
        }
    }

    // code added by ruchit
    public static void add(Node head, int val)
    {
        Node curr;
        if(head == null)
        {
            Node temp = new Node(val);
            head = temp;
            curr = head;
        }
        else 
        {
            curr = head;
            while(head.next != null)
            {
                head = head.next;
            }
            Node temp = new Node(val);
            head.next = temp;
        }
        while(curr != null)
        {
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    //code added by anand kumar

    public static void delete(Node head)
    {
        if(head == null)
        {
            System.out.println("Linked List is Empty");
            return ;
        }
        Node curr = new Node(-1);
        curr.next = head;
        Node temp = curr;
        while(head != null && head.next != null)
        {
            head = head.next;
            curr = curr.next;
        }
        curr.next = null;
        temp = temp.next;
        while(temp != null)
        {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
