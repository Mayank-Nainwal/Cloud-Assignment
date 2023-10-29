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
}