import java.util.*;
class Name{
    public static void main(String[] args){
        Card a= new Card();
        a.setAuthor("Harrypotter");
        a.setTitle("Harrys");
        a.setSubject("Adventure");
        // System.out.println(a.Author+""+a.Title+""+a.Subject);
        Card b= new Card();
        b.setAuthor("Chetan");
        b.setTitle("3Idiots");
        b.setSubject("Comedy");
        // System.out.println(b.Author+""+b.Title+""+b.Subject);
        Card c = new Card();
        c.setAuthor("XXYY");
        c.setTitle("RES");
        c.setSubject("Romance");
        // System.out.println(c.Author+""+c.Title+""+c.Subject);
        CardCatalog r = new CardCatalog();
            r.AddaCard(a);
            r.AddaCard(b);
            r.AddaCard(c);
            r.printCatalog();
    }
} 
class Card{
    String Author;
    String Title;
    String Subject;
    Card(){

    }

    Card(String Author,String Title,String Subject){
        this.Author=Author;
        this.Title=Title;
        this.Subject=Subject;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }
    public void setTitle(String title) {
        this.Title = title;
    }
    public void setSubject(String subject) {
        this.Subject = subject;
    }
    public String getAuthor() {
        return this.Author;
    }
    public String getTitle() {
        return this.Title;
    }
    public String getSubject() {
        return this.Subject ;
    }

    public String toString(){
        return this.Author + " "+ this.Subject + " "+ this.Title;
    }
}

class CardCatalog{
    Card[]cardArray;
    int index = 0;
    CardCatalog(){
        cardArray = new Card[10];

    }
    public void AddaCard(Card obj){
        cardArray[index] = obj;
        index++;
    }
    public Card getATitle(String s){
        for(int i=0 ;i < cardArray.length; i++){
            if(cardArray[i].Title.equals(s)){
                return cardArray[i]; 
            }
        }
        return null;
    }
    public Card[] getAuthor(String au){
        Card[] arr= new Card[index];
        int count = 0;
        for (int i=0;i< cardArray.length; i++){
            if(cardArray[i].Author.equals(au)){
                arr[count] = cardArray[i];
                count++;
            }
        }
        return arr;
    }
    public Card getSubject(String su){
        for(int i=0;i< cardArray.length; i++){
            if(cardArray[i].Subject.equals(su)){
                return cardArray[i];
            }
        }
        return null;
    }
    public void removeAll(String ti){
        for(int i=0;i< cardArray.length;i++){
            if(cardArray[i].Title == ti){
                cardArray[i]=null;
            }
        }
    }
    public void printCatalog(){
        for(int i=0;i<cardArray.length;i++){
            if(this.cardArray[i]!=null){
                System.out.println(cardArray[i]);
            }
        }

    }
 
}