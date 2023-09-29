package iterator;

import java.util.*;

public class IteratorVsListIterator {
    public static void main(String[] args){
        System.out.println("<== Iteration ==>");
        List<String> objArray = Collections.synchronizedList(new ArrayList<>());
        Stack<String> stack = new Stack<>();
        stack.peek();
//        objArray.add("Ibrahim");
//        objArray.add("Alvi");
//        objArray.add("Qasim");
//        objArray.add("Alvi");
//
//        for(int i = 0 ;i< objArray.size();i++){
//            System.out.println(objArray.get(i));
//        }

//        objArray.add("Youssf");
//        objArray.add("Alvi");
//        objArray.add("Shahid");
//        objArray.add("Husssain");

//        System.out.println("ArrayList: "+ objArray);

//        ListIterator<String> namesIterator
//                = objArray.listIterator();

//        while(namesIterator.hasPrevious()){
//            System.out.println(namesIterator.previous()+"\n");
//        }
//        System.out.println(objArray.size());
    }
}
