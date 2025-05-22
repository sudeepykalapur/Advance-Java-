//Q3.Write a Java program to insert the specified element at the end of a linked list.( using
//l_listobj.offerLast("Pink"))
import java.util.*;

public class InsertAtEndLinkedList {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        LinkedList<String> ls = new LinkedList<>();
        ls.add("Orange");
        ls.add("geen");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");
        System.out.println(ls);
        ls.addLast("pink");
        // add element at the last
        System.out.println(ls);

    }

}