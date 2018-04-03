import java.util.Scanner;

public class linkedlist {
    node head;
    static class node{
        int data;
        node next;
        node(int d){
            data=d;
            next=null;
        }
    }
    public void printlist(){
        node n=head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
    public void addinbeg(int newdata){
        node n=new node(newdata);
        n.next=head;
        head=n;
    }
    public void addinend(int newdata){
        node n=new node(newdata);
        n.next=null;
        node temp= head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;


    }
    public static void main(String[] args){
        linkedlist list=new linkedlist();
        list.head=new node(1);
        node second=new node(2);
        node third=new node(3);
        list.head.next=second;
        second.next=third;
        System.out.print("enter data");
        Scanner input=new Scanner(System.in);
        int newdata= input.nextInt();
        list.addinbeg(newdata);
        list.addinend(newdata);
        list.printlist();
    }
}
