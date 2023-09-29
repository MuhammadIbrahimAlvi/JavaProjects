package Generics.MutlipleGenerics;

public class MultipleGenerics {
    public static void main(String[] args){
        System.out.println("<== MultipleGenerics ==>");
        Generics<String, String> mondayWeather =
                new Generics<>("Monday", "Sunny");
        Generics<Integer, Double> dayOfWeekDegrees =
                new Generics<Integer, Double>(1, 78.0);

        String mondayForecast = mondayWeather.getFirstPosition();
// The Double type is unboxed--to double, in this case. More on this in next section!
        double sundayDegrees = dayOfWeekDegrees.getSecondPosition();

        System.out.println(sundayDegrees);
    }
}

class Generics<T,S>{
    private T firstPosition;
    private S secondPosition;

    public Generics(T firstPosition, S secondPosition){
        this.firstPosition = firstPosition;
        this.secondPosition = secondPosition;
    }

    public T getFirstPosition(){
        return firstPosition;
    }

    public void setFirstPosition(T firstPosition){
        this.firstPosition = firstPosition;
    }

    public S getSecondPosition(){
        return secondPosition;
    }

    public void setSecondPosition(S secondPosition){
        this.secondPosition = secondPosition;
    }

}
