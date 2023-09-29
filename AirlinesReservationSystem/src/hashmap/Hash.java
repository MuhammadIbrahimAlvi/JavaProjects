package hashmap;

import java.util.HashMap;
import java.util.Stack;

public class Hash {
    public static void main(String[] args){
        System.out.println("<== HashMap Internal Working ==>");
//        HashMap<AmbigousInterger,Integer> map = new HashMap<>();
//        AmbigousInterger key1 = new AmbigousInterger(1),
//                key2 = new AmbigousInterger(1),
//        key3 = new AmbigousInterger(3);
//        map.put(key1,1);
//        map.put(key2,2);
//        System.out.println(map.get(key1));
//        System.out.println(map.get(key2));
//        System.out.println(map.get(key3));

        Stack<String> stackObj = new Stack<>();
        stackObj.add("Ibrahim");
        stackObj.add("Yousuf");
        stackObj.add("Qasim");
        stackObj.add("Shahid");

        System.out.println(stackObj.peek());
        System.out.println(stackObj);
        System.out.println(stackObj.pop());
        System.out.println(stackObj);
    }
}

class AmbigousInterger{
    private final int value;

    AmbigousInterger(int value){
        this.value =value;
    }
}