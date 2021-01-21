import java.util.*;
public class linkedlist
{
Node head=null;

class Node
{
int data;
Node next;
Node(int d)
{
    data=d;
    next=null;
}
}
void printlist()
{
    Node d=head;
    while(d!=null)
    {
    System.out.print(d.data+" ");
    d=d.next;
    }
}
void findmiddle()
{
    Node t=head;
int length=0,count=0;
while(t!=null)
{
length++;
t=t.next;
}
System.out.println("\n Length is "+length);
int mid=length/2;
Node tnode=head;
while(tnode!=null)
{
if (count==mid)
{
System.out.print("Middle element of linkedlist : "+tnode.data);
break;
}
else
{
tnode=tnode.next;
count++;
}
}
}
void push(int data)
{
Node o=new Node(data);
o.next=head;
head=o;
}
public static void main(String g[])
{
    Scanner j=new Scanner(System.in);
    System.out.println("Enter size of linked list->");
    int n=j.nextInt();
linkedlist obj=new linkedlist();
for(int i=n;i>=1;i--)
{
obj.push(i);
}
obj.printlist();
obj.findmiddle();
}
}




