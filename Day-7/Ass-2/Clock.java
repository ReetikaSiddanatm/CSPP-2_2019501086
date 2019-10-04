/**
 * Clock data type. Write a data type Clock.java that
 * represents time on a 24-hour clock, such as 00:00, 13:30, or
 * 23:59. Time is measured in hours (00–23) and minutes (00–59). 
 * To do so, implement the following public API:
 * 
 * @author Siva Sankar
 */

public class Clock {
    // Creates a clock whose initial time is h hrs and m min.
    /**
     * The parameterised constructor will instatiates the object with the values of
     * the parameters h and m to the respective hrs nad min.
     * @param h
     * @param m
     */
    int h;
    int m;
    String Hours;
    Clock(){
        
    }
    public Clock(int h, int m) {
        this.h=h;
        this.m=m;

    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.

    public Clock(String s) {
        String [] a= s.split(":");
        this.h = Integer.parseInt(a[0]);
        this.m = Integer.parseInt(a[1]);    
        }
    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        if(this.h <=9 && this.m <=9){
            String ho = "0"+ String.valueOf(this.h);
            String min = "0"+ String.valueOf(this.m);
            return ho + ":" + min;
        }
        else if (this.h <=9 || this.m <=9) {
            if(this.h <=9){
                String ho = "0"+ String.valueOf(this.h);
                return ho+ ":" +this.m; 
    
            }
            else if (this.m<=9) {
                String mi = "0"+ String.valueOf(this.m);
                return this.h +":" + mi;
                
            }
        }

        return this.h + ":"+ this.m;
        

    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
    
        if(this.h < that.h ){
            return true;
        }
                    
        else if(this.h == that.h) {
              if( this.m < that.m){
                  return true;
              }
              
              return false;
              
        
            
        }
        // else{
        //     return false;
        // }

        return false;
    }

   // private void check() {
        
    //}

    // Adds 1 minute to the time on this clock.
    public void tic() {
        // this.m = this.m + 1;
        // this.Hours =  this.Hours + "00:01";
        this.toc(1);
    }

    // Adds Δ min to the time on this clock.
    public void toc(int delta) {
        if(delta > 0){
            
           if (this.m + delta > 59){
            int hadd = delta / 60;
              if(this.h + hadd > 23 && this.h + hadd!=24){
                 hadd = hadd / 24;
              }
              
            int mrem = delta % 60;
            this.h = this.h + hadd;
            this.m = this.m + mrem;
            // this.Hours = (int)this.Hours + hadd;
            // this.Hours = (int)this.Hours + mrem;

        }else{
            this.m += delta;
        }
        if(this.m == 60){
            this.m=0;
            this.h+=1;
        }


        if(this.h == 24){
            this.h = 00;
        }
        
    }
}

    // Test client (see below).
    public static void main(String[] args) {
        Clock clock = new Clock("13:01");
        clock.toc(660);
        System.out.println(clock);
    }
}