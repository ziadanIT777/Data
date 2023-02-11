
public class SinglyLinkedList <E>{

    // class Node
    private static class Node<E>{
        E element;
        Node<E> next;

        public Node ( E elment , Node<E> next ) {
            this.element = elment;
            this.next = next;
        }

        public E getElment () {
            return element;
        }

        public void setElment ( E elment ) {
            this.element = elment;
        }

        public Node<E> getNext () {
            return next;
        }

        public void setNext ( Node<E> next ) {
            this.next = next;
        }



    }

    //// السؤال الاول لاب 4
    public boolean equal ( Node n , Node n2 ) {
        if (n == n2) {
            if (n.element == n2.element) {
                if (n.next == n2.next) {
                    return true;
                }
            }
        }
        return false;
    }

    //  //  السؤال الثاني الاب 4

    private void set(){
        if (head !=null){
            Node temp = head;
            while (temp.next != null){
                System.out.println (temp.next.getElment ());
                temp = temp.next;
            }
        }
        else
            System.out.println ("is Empty");
    }

    //  //  السؤال الثالث الاب 4

    private  int count(){
        int numberOfelem = 0 ;
        if (head != null){
            Node temp = head;
            numberOfelem ++;
            while (temp.next != null){
                numberOfelem++;
                temp = temp.next;
            }
            return numberOfelem;
        }
        return numberOfelem;
    }


    //  //  السؤال الرابع الاب 4
    private void rotate(){
        if (isEmpty ()){
            E el = tail.getElment ();
            tail.element = head.getElment ();
            head.element = el;
        }
    }

    //  //  السؤال الخامس الاب 4

    private void grob(SinglyLinkedList L ,SinglyLinkedList M){
        if (!L.isEmpty () && !M.isEmpty ()){
            L.tail.next = M.head;
            head = L.head;
            tail = M.tail;
        }
    }

    //  //  السؤال السادس الاب 4

    private void  revers(){
        if (head != null){
            Node preves = null;
            Node current = head , next ;
            while(current != null){
                next = current.next;
                current.next=preves;
                preves =current ;
                current = next;
            }
            tail = head;
            head = preves;
        }
    }



    private Node<E> head = null;
    private Node<E> tail =null;
    private int size=0;

    public SinglyLinkedList () {
    }
    public boolean isEmpty()
    {
        return size==0;
    }

    public int size()
    {
        return size;
    }

    public E first()
    {
        if (isEmpty ())return null;
        return head.element;
    }

    public E last()
    {
        if (isEmpty ())return null;
        return tail.element;
    }

    public void addFirst(E element)
    {
        head = new Node<E> (element,head);
        if (isEmpty ())
            tail=head;
        size++;
    }

    public void addLast(E element)
    {
        Node<E> newest =new Node<E> ( element,null );
        if (isEmpty ())
            head=newest;
        else
            tail.setNext ( newest );
        tail=newest;
        size++;
    }

    public E removeFirst()
    {
        if (isEmpty ())return null;
        E deleted =head.element;
        head=head.next;
        size--;
        if (size==0)
            tail=null;
        return deleted;

    }


}
