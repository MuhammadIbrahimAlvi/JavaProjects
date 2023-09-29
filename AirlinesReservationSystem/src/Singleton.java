import java.text.SimpleDateFormat;
import java.util.Date;

public class Singleton {
    public static void main(String[] args) throws Exception{
        System.out.println("<==== SingleTon ====>");
        System.out.println("<==== Hey Welcome to Film Theator Data Entry\n Enter FilmName, \n Release Date and \n Ratings====>");
        java.util.Scanner input = new java.util.Scanner(System.in);
        String name = input.nextLine();
        String date = input.nextLine();
        Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(date);
        short ratings = input.nextShort();

        Theator film1 = Theator.getTheatorInstance(name,date1,ratings);
        Theator film2 = Theator.getTheatorInstance(name,date1,ratings);
        Theator film3 = Theator.getTheatorInstance(name,date1,ratings);
        System.out.println(film1.toString());
        film1.instanceCheck(film1,film2);
    }
}

class Theator{
    public String filmName;
    public Date releaseDate;
    public short filmRatings;
    private int filmRevenue;
    private int filmOwnerProfit;

    private static Theator theator_instance = new Theator();

    private Theator(){}
    private Theator(String filmName,Date releaseDate,short filmRatings){
        this.filmName = filmName;
        this.releaseDate = releaseDate;
        this.filmRatings = filmRatings;
    }

    public String getFilmName() {
        return filmName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public short getFilmRatings() {
        return filmRatings;
    }

    public int getFilmRevenue() {
        return filmRevenue;
    }

    public int getFilmOwnerProfit() {
        return filmOwnerProfit;
    }

    public void setFilmRevenue(int filmRevenue) {
        this.filmRevenue = filmRevenue;
    }

    public void setFilmOwnerProfit(int filmOwnerProfit) {
        this.filmOwnerProfit = filmOwnerProfit;
    }

    public int totalRevenue(){
       return filmRevenue+filmOwnerProfit;
    }

    public String toString(){
       return "The Film Name is: "+ filmName + "& it's released date is: "+ releaseDate;
    }

    public static Theator getTheatorInstance( String filmName, Date releaseDate, short filmRatings ){
        if (theator_instance == null)
        {
            theator_instance = new Theator(filmName, releaseDate, filmRatings);
        }
        return theator_instance;
    }

    public boolean instanceCheck(Theator obj1,Theator obj2){
        System.out.println(obj1==obj2);
        return obj1 == obj2;
    }
}
