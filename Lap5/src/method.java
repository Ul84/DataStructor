public class method<E>
{
    public class Node<E>
    {
        private E element;
        private Node<E> next;

        public Node(E e, Node n)
        {
            element = e;
            next = n;
        }
        public E getElement( ) { return element; }
        public Node<E> getNext( ) { return next; }
        public void setNext(Node<E> n) { next = n; }
    }

    public Node<E> tail = null;
    public int size = 0;

    //Method
    public boolean isEmpty()
    { return size == 0;}

    // Q1
    public void addFirst(E e)
    {
        if(isEmpty()){
            tail = new Node<>(e, null);
            tail.setNext(tail);
        }
        else
            tail.next = new Node<>(e, tail.getNext());
        size++;
    }
    public void addLast(E e)
    {
        addFirst(e);
        tail = tail.getNext();
    }
    // Q2
    public int size()
    {
        if(tail == null)
            return 0;
        if(tail.getNext() == tail)
            return 1;
        Node<E> check = tail.getNext();
        int i = 1;
        while(check != tail)
        {
            check = check.next;
            i++;
        }
        return i;
    }
    // Q3
    public boolean equals(method c)
    {
        Node<E> one = tail.next;
        Node<E> two = c.tail.next;
        boolean check = false;
        while(one != tail && two != c.tail){
            if(one.element != two.element)
                return false;
            one = one.next;
            two = two.next;
        }
        if(one == tail && two == c.tail)
            return true;
        return false;
    }

    // Q4
    public boolean sameSequence(method c)
    {
        Node<E> one = tail.next;
        Node<E> two = c.tail.next;
        while(two != c.tail){
            if(one.element == two.element)
                break;
            two = two.next;
        }
        while(one.element == two.element && two != c.tail){
            one = one.next;
            two = two.next;
        }
        if(one.element != two.element)
            return false;

        return true;
    }

    // Q5
    public void half(method list1, method list2)
    {
        if(!isEmpty())
            if(size % 2 == 0){
                int count = 1;
                while(count <= size/2){
                    tail = tail.next;
                    list1.addLast(tail.element);
                    count++;
                }
                while(count <= size){
                    tail = tail.next;
                    list2.addLast(tail.element);
                    count++;
                }
            }
    }
     // Q6
    public void clone(method list)
    {
        if(!isEmpty())
        {
            Node<E> n = tail;
            while(n.next != tail)
            {

                n = n.next;
                list.addLast(n.element);
            }
            list.addLast(tail.element);
        }
    }

}
