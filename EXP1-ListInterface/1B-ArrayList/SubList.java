// 5. Write a java program for getting different colors through ArrayList interface and extract the
// elements 1st and 2nd from the ArrayList object by using SubList()
import java.util.*;

public class SubList {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> ls = new ArrayList<>();
        ls.add("Orange");
        ls.add("geen");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");
        System.out.println(ls);
        System.out.println("using sublist:");
        // to obtain a sublist
        System.out.println(ls.subList(0, 2));
    }

}