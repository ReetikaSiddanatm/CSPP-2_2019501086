import java.util.*;
public class Show{
    private String movieName;
    private String dateTime;
    private String []seatsBooked;
    public String name1;
    public String phone;
    Show(){

    }
    Show(String m,String da,String[]se){
        this.movieName =m;
        this.dateTime = da;
        this.seatsBooked = se;

    }
    public void setmovieName(String na){
        this.movieName = na;
    }
    public String getmovieName(){
        return this.movieName;
    }
    public void setdateTime(String da){
        this.dateTime = da;
    }
    public String getdateTime(){
        return this.dateTime;
    }
    public void setSeatsBooked(String []se){
        this.seatsBooked = se;
    }
    public String[] getSeatsBooked(){
        return this.seatsBooked;
    }
    
    public void setname1(String n){
        this.name1 = n;
    }
    public String getname1(){
        return this.name1;
    }
    
    public void setphone(String p){
        this.phone = p;
    }
    public String getphone(){
        return this.phone;
    }
    public void bookAShow(Patron p, String [] s){
		String [] t = getSeatsBooked();
		for(int i = 0; i <s.length; i++){
			if(Arrays.asList(t).contains(s[i])){
				for(int j = 0; j<t.length;j++){
					if(t[j].equals(s[i])){
						t[j] = "00";
					}
				}
			}
			setSeatsBooked(t);
		}
		p.setmoviename(this.getmovieName());
		p.setdateAndtime(this.getdateTime());
		p.setSeatsbooked(s);
    }
    public void printTickets(Patron p){
		if(p != null){
			System.out.println("movie: "+ p.getmoviename() + " Date and time: "+ p.getdateAndtime()+" seats available: "+ Arrays.toString(p.getSeatsbooked()));
		}
			
		else{
			System.out.println("no tickets booked");
		}
	}
}