import java.util.*;

public class User {
    String name ;
    String Connections;
    int numberofconnections;
    User(){

    }
    User(String n, String con,int numb){
        this.name =n;
        this.Connections = con;
        this.numberofconnections = numb;

    }
    User(String na, String co){
        this.name= na;
        this.Connections = co;
    }
    public void setname(String n){
        this.name = n;

    }
    public void setConnection(String conn){
        this.Connections = conn;
    }
    public void setnumber(int n){
        this.numberofconnections = n;
    }

    public String getUserName(){
        return this.name;
    }
    public String getConnection(){
        return Connections;
    }
    public int getnumber(){
       return  this.numberofconnections;
    }
    public String toString(){
        return this.name + "is connected to" + Connections+ ","+ this.numberofconnections;
    }
    User[] connectionUsers  = new User[20];
}