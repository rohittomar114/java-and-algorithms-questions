package dataStructureImplementionsInJava;

 class Link {

    int a;
    Link Next;

    public Link(int i){
        a=i;
    }

}

public class LinkList {

    Link First = null;

    public void insertFirst(int a){
        Link objLink = new Link(a);

        objLink.Next=First;
        First = objLink;

    }

    public void displayLink(){

        Link current = First;
        while(current!=null){
            System.out.println(current.a);
            current = current.Next;
        }

    }

    public void ReverseLink(){
        Link current = First;
        Link Previous = null;
        Link temp = null;

        while(current!=null){

            if(current==First)
                temp = current.Next;
            else
                temp=current.Next;

            if(temp==null){
                First = current;
                //return;
            }
            current.Next=Previous;
            Previous=current;
            //System.out.println(Previous);
            current = temp;
        }

    }

    public static void main(String args[]){

        LinkList objLinkList = new LinkList();
        objLinkList.insertFirst(1);
        objLinkList.insertFirst(2);
        objLinkList.insertFirst(3);
        objLinkList.insertFirst(4);
        objLinkList.insertFirst(5);
        objLinkList.insertFirst(6);
        objLinkList.insertFirst(7);
        objLinkList.insertFirst(8);
        objLinkList.displayLink();
        System.out.println("-----------------------------");
        objLinkList.ReverseLink();
        objLinkList.displayLink();

    }
  }