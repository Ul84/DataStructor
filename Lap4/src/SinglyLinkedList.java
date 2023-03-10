public class SinglyLinkedList<E>
{
    public Node<E> head = null;
    public Node<E> tail = null;
    private int size = 0;
    public class Node<E>
    {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next)
        {
            this.element = element;
            this.next = next;
        }

        public E getElement() { return element; }

        public Node<E> getNext() { return next; }

        public void setNext(Node<E> next) { this.next = next; }
    }

    public SinglyLinkedList() {}
    public boolean isEmpty() { return size == 0; }

    public void addFirst(E element)
    {
        head = new Node<>(element, head);
        if(isEmpty())
            tail = head;
        size++;
    }
    public void addLast(E element)
    {
        Node<E> newElement = new Node<>(element, null);
        if (isEmpty( ))
            head = newElement;
        else
            tail.setNext(newElement);
        tail = newElement;
        size++;
    }
    public E RemoveFirst()
    {
        if (isEmpty( )) return null;
        E answer = head.getElement( );
        head = head.getNext( );
        size--;
        if (size == 0)
            tail = null;
        return answer;
    }
    public E First()
    {
        if(isEmpty()) return null;
        return head.getElement();
    }

    public E Last()
    {
        if(isEmpty()) return null;
        return tail.getElement();
    }

    //Q1
    public boolean Equals(Node n1, Node n2)
    {
        if(n1 == n2&&n1.next == n2.next && n1.element == n2.element)
        {
           return true;
        }
        return false;
    }
    //Q2
    public void Find()
    {
        if(head != null)
        {
            Node temp = head;
            while(temp.next != null)
            {
                System.out.println(temp.next.getElement());
                temp = temp.next;
            }
        }
        else
            System.out.println("There is no Node Inside The List");
    }
    //Q3
    private int Size()
    {
        int numOfElement = 0;
        if(head != null)
        {
            Node temp = head;
            numOfElement++;

            while(temp.next != null)
            {
                numOfElement++;
                temp = temp.next;
            }

            return numOfElement;
        }
        return numOfElement;
    }
    //Q4
    public void Rotate()
    {
        if(!isEmpty())
        {
            E el = tail.getElement();
            tail.element = head.getElement();
            head.element = el;
        }
    }
    //Q5
    public void Concatenating(SinglyLinkedList L, SinglyLinkedList M)
    {
        if(!L.isEmpty() && !M.isEmpty())
        {
            L.tail.next = M.head;
            head = L.head;
            tail = M.tail;
        }
    }
    //Q6
    public void Revers()
    {
        if(head != null)
        {
            Node pre = null;
            Node curr = head, next;
            while(curr != null)
            {
                next = curr.next;
                curr.next = pre;
                pre = curr;
                curr = next;
            }
            tail = head;
            head = pre;
        }
    }



}
