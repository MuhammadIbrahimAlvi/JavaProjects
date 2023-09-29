public class StringsExample {
    public static void main(String[] args){
        System.out.println("String vs StringBuilder vs StringBuffer");
        String stringVal = "Hello";
        StringBuffer stringBufferVal = new StringBuffer("World");
        StringBuilder stringBuilderVal = new StringBuilder("of Java");

        System.out.println(stringVal);
        System.out.println(stringBuilderVal.delete(0,3).insert(1,"Value is "));
        System.out.println(stringBufferVal.append(3444));
    }
}
