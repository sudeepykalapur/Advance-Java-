//Q2.Write a Java program to iterate a linked list in reverse order (using
//objlist.descendingIterator())
import java.util.*;

public class ReverseIterate {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedList<String> ls = new LinkedList<>();
        ls.add("Orange");
        ls.add("geen");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");
        ListIterator<String> listIterator = ls.listIterator(ls.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }

}