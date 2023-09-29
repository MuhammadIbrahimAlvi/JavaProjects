import java.util.*;

public class CollectionImplementation {
    public static void main(String[] args){
        System.out.println("<== Collections ==>");
        List <String> ages = new ArrayList<String>();
        ages.add("2");
        ages.add("8");
        ages.add("7");
        ages.add("11");

        Iterator itr = ages.iterator();
        ListIterator<String> list1 = ages.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Stack<String> queue =  new Stack<String>();
        queue.add("Ibrahim");
        queue.add("Yousuf");
        queue.add("Uroosa");
        queue.add("Qasim");

        System.out.println(queue);

        queue.push("Alvi");

        System.out.println(queue);

        ArrayList<Integer> discoveries = new ArrayList<Integer>();
        discoveries.add(1);
        try{
            discoveries.get(0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        Collections.sort(queue);

        System.out.println("Sorted Array==> "+queue);

        System.out.println("<== Set ==>");
        int[] myNum = {10, 20, 30, 40};

        Set setObj = new HashSet();
        setObj.add(4);
        setObj.add(4);
        setObj.add(5);
        setObj.add(myNum);

        System.out.println();

        System.out.println("<== Map ==>");
        Map mapObj = new HashMap();
        mapObj.put(1,"Qasim");

        mapObj.put(2,"Yousuf");

        mapObj.put(3,"Unknown");

        mapObj.put(4,"Mehreen");

        mapObj.put(5,"Uroosa");

        mapObj.put(6,"Ibrahim");

        System.out.println(mapObj);


    }
}
