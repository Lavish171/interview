package com.interview.tree;

/**
 * Date 07/07/2014 
 * @author tusroy
 @Lavish garg
 * 
 * Youtube link - https://youtu.be/bmaeYtlO2OE
 * Youtube link - https://youtu.be/_SiwrPXG9-g
 * Youtube link - https://youtu.be/NA8B84DZYSA
 *
 */
class Node
{
    int key;
    Node left,right;
    Node(int key)
    {
        this.key=key;
        left=right=null;
    }
}

class Main
{
   static  Node insert(Node temp,int data)
    {
        Node tnode=new Node(data);
        if(temp==null)
        {
            temp=tnode;
            return temp;
        }
        Node current=temp;
        Node parent=null;
        while(current!=null)
        {
          parent=current;
          if(current.key<data)
          current=current.right;
          else if(current.key>data)
          current=current.left;
        }
        if(parent.key<data)
        parent.right=tnode;
        else
        parent.left=tnode;
        return temp;
    }
    
    static void inorder(Node temp)
    {
    if(temp==null)
    return;
    inorder(temp.left);
    System.out.print(temp.key+" ");
    inorder(temp.right);
    }
    public static void main(String[]args)
    {
        Node root=null;
        root=insert(root,10);
        root=insert(root,-5);
        root=insert(root,16);
        root=insert(root,-8);
        root=insert(root,7);
        root=insert(root,18);
        System.out.print("The inorder before new insertion in the binary tree is ");
        inorder(root);
        root=insert(root,6);
        System.out.print("\nThe inorder after new insertion in the binary tree is ");
        inorder(root);
    }
}
