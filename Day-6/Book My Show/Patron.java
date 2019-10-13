public class Patron{
    private String Name;
    private String Mobilenumber;
    public String moviename;
    public String dateAndtime;
    public String[] seatsbooked; 
Patron(){

}
Patron(String n, String m){
    this.Name = n;
    this.Mobilenumber = m;

}
public void setname(String n){
    this.Name = n;
}
public String getname(){
    return this.Name;
}
public void setmobilenumber(String m){
    this.Mobilenumber = m;
}
public String getmobilenumber(){
    return this.Mobilenumber;
}
public void setmoviename(String movie){
    this.moviename = movie;
}
public String getmoviename(){
    return this.moviename;
}
public void setdateAndtime(String d){
    this.dateAndtime = d;
}
public String getdateAndtime(){
    return this.dateAndtime;
}
public void setSeatsbooked(String []seats){
    this.seatsbooked = seats;
}
public String[] getSeatsbooked(){
    return this.seatsbooked;
}

}