package OracleGenerics;
import java.util.*;
public class OracleGenerics {
    public static void main(String[] args){
        System.out.println("<== Orcale Generics ==>");


        ObjectContainer myObj = new ObjectContainer();

// store a string
        myObj.setObj("Test");
        System.out.println("Value of myObj:" + myObj.getObj());
// store an int (which is autoboxed to an Integer object)
        myObj.setObj(3);
        System.out.println("Value of myObj:" + myObj.getObj());

        List objectList = new ArrayList();
        objectList.add(myObj);
// We have to cast and must cast the correct type to avoid ClassCastException!
        String myStr = (String) ((ObjectContainer)objectList.get(0)).getObj();
        System.out.println("myStr: " + myStr);
    }
}

class ObjectContainer {
    private Object obj;

    /**
     * @return the obj
     */
    public Object getObj() {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(Object obj) {
        this.obj = obj;
    }

}
