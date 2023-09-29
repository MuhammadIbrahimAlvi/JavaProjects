public class MemoryManagement {
    public static void main(String[] args){
        System.out.println("<==Memory Management==>");
        int localVariable = 5;
        System.out.println(localVariable);
        Calculation(localVariable);
        System.out.println("After"+localVariable);
    }
    public static void Calculation(int dataValue){
         dataValue = dataValue*100;
        System.out.println(dataValue);
    }

}

 class Container {
    private String initial = "A";

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }
}
