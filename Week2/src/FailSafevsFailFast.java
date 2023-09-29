import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafevsFailFast {
    public static void main(String[] args){
        System.out.println("<== Fail Safe vs Fail Fast ==>");
        List<String> list = new ArrayList<>(Arrays.asList("Ibrahim","Yousuf","Qasim","Alvi","Muhammad"));
        list.add("Lol");
        System.out.println(list);

        Iterator<String> itr = list.iterator();

        list.remove(1);

        list.add("Naseer");
        System.out.println(list);

        ListIterator<String> itr2 = list.listIterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

//        CopyOnWriteArrayList<Integer> list1 = new CopyOnWriteArrayList<>(new Integer[]{3,4,5,6});
//
//        Iterator itr22 = list1.iterator();
//
//        while (itr22.hasNext()){
//            list1.add(5);
//            Integer i = (Integer)itr22.next();
//            System.out.println(i);
//            if (i == 7)
//                list1.add(15);
//        }


    }
}
