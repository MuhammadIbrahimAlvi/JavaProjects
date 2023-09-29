//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//import java.time.Duration;
//
//
//public class CollectionTask {
//    public static <StopWatch> void main(String[] args){
//        System.out.println("<== Collection Task ==>");
//        java.util.List<Integer> arrayList = new ArrayList<Integer>(java.util.Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));
//        List<Integer> linkList = new LinkedList<Integer>(java.util.Arrays.asList(23, 44, -9, 14, 123, 56, 223, 445, 33, 45, 89, 1, 0, 21, 100));
//        arrayList.
//        int arrayItem = arrayList.get(arrayList.size()-1);
//        int linkItem = linkList.get(linkList.size()-1);
//        Iterator itrList = linkList.iterator();
//
//        long endArrayTime=0,endLinkListTime = 0;
//        Iterator itrArray = arrayList.iterator();
//        long start1 = System.currentTimeMillis();
//        System.out.println(start1+"<== Starting Time of ArrayList");
//        while(itrArray.hasNext()){
//            if(arrayItem == (int)(itrArray.next())){
//                endArrayTime = System.currentTimeMillis();
//                System.out.println(endArrayTime+"<== End Time of ArrayList");
//                break;
//            }
//        }
//
//        long start3 = System.currentTimeMillis();
//        System.out.println(start3+"<== Starting Time of LinkList");
//        while(itrList.hasNext()){
//            if(linkItem == (int)(itrList.next())){
//                endLinkListTime = System.currentTimeMillis();
//                System.out.println(endLinkListTime+"<== End Time of LinkList");
//                break;
//            }
//        }
//        if(endArrayTime>endLinkListTime){
//            System.out.println("Array Searching time is slow");
//        }else{
//            System.out.println("Array Searching time is fast");
//        }
//
//    }
//}
