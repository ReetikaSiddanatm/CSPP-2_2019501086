import java.util.*;
public class BookYourShow{
    Show[] show;
    int numberOfShows;
    public BookYourShow(){
        this.show = new Show[500];
        this.numberOfShows = 0;
    }
    public void addAShow(Show show){
        this.show[numberOfShows] = show;
        numberOfShows++;
    }
    public String toStrings(Show result){
        return "Movie: "+ result.getmovieName()+" Date and Time: "+ result.getdateTime()+ " Seats booked: "+ Arrays.toString(result.getSeatsBooked()); 
    }
    public Show getAShow(String MovieName, String DateTime){
        for(int i =0; i<numberOfShows; i++){
            if(show[i].getmovieName().equals(MovieName)){
                if(show[i].getdateTime().equals(DateTime)){
                    return show[i];
                }
            }
        }
        return null;
    }

}