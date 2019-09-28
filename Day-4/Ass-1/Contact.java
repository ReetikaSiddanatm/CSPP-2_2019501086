/**
 * This class discusses about the Contact Object. The attributes of the contact
 * object are as follows. name : Name of the Contact / friend. email : mail id of
 * the person / friend. phoneNumber : Phone Number of the person / friend.
 * 
 * @author Siva Sankar
 */

// Your code goes here... For Contact class


class Contact {
    String name;
    String email;
    String phoneNumber;

    Contact() {

    }
    Contact(String name, String email, String phoneNumber){
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }



    public void setName(String n) {
        this.name = n;
    }

    public void setEmail(String e) {
        this.email = e;

    }

    public void setPhoneNumber(String ph) {
        this.phoneNumber = ph;

    }

    public String getName() {
        return this.name;

    }

    public String getEmail() {
        return this.email;

    }

    public String getPhoneNumber() {
        return this.phoneNumber;

    }
     
    public String toString(){
        // String Name;
        // String Email;
        // String PhoneNumber;
        return "{ Name = " + this.name + ", Email = " + this.email + ", Phone Number = " +  this.phoneNumber  +  " }";
    }
}
