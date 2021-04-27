/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

/**
 *
 * @author Farwah
 */
    class Node{
    Node next;
    String Name;
    String Number;
    Node(String Name,String Number, Node next){
    this.Name= Name;
    this.Number = Number;
    this.next=next;
    }
    }
class Linked_List {
    Node head;
    int size;
 
   
    public void add(String Name, String Number){
        Node node= new Node(Name,Number,null);
    if(head==null){
        head=node; }
    else{
        Node n =head;
   while(n.next!=null){
   n=n.next;
   }
   n.next=node;
   size++;
    }
    }
    
    public boolean delete(String Name, String Number){
        Node n= head;
        if(n.Name.equals(Name) && n.Number.equals(Number))
        {head=head.next;
        --size;
        return true;
        }
        else{
    while(n.next!=null){
    if(n.next.Name.equals(Name) && n.next.Number.equals(Number)){
      n.next = n.next.next;
      size--;
    return true;}
      n=n.next;}
    
    }

    return false;
    }
    
    public boolean contains(String Name,String Number){
    Node n=head;
    while(n!=null){
        if(n.Name.equals(Name) || n.Number.equals(Number))
        {return true;}
         n=n.next;
    }
    return false;
    }
    
    public boolean edit(String oldName,String newName , String oldNumber, String newNumber){
    Node n= head;
    while(n!=null){
        if(n.Name==oldName && n.Number==oldNumber){
        n.Name=newName;
        n.Number=newNumber;
        return true;
        }
    n=n.next;
    }
    return false;
    }
    
    public void display(){
    for(Node n= head;n!=null;n=n.next){
    System.out.println(n.Name);
    System.out.println(n.Number);
                   
    }
    }
}
public class LinkedList{
    public static void main(String[] args){
    Linked_List list = new Linked_List();
    list.add("Farwah", "03223401330");
   // list.add("Munsif", "03022986979");
    list.delete("Farwah", "03223401330");
   // System.out.println(list.contains("Farwah", "03223401330"));
    //list.edit("Farwah", "FarwahMunsif", "03223401330", "03223401330");
    list.display();
    
    }
    
}
