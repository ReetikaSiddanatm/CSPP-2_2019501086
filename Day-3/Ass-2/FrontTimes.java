/**
 * Given a string and a non-negative int n, we'll say that the front
 * of the string is the first 3 chars, or whatever is there if the 
 * string is less than length 3. Return n copies of the front;
 * 
 * Input : frontTimes("Chocolate", 2)
 * Output : ChoCho
 * 
 * Input : frontTimes("Chocolate", 3)
 * Output : ChoChoCho
 * 
 * Input : frontTimes("Abc", 3)
 * Output : AbcAbcAbc
 * 
 * @author: Siva Sankar
 */

public class FrontTimes {



    /**
     * This method returns n copies of the front.
     * @param str, the string to be considered.
     * @param n, the non-negative integer value.
     * @return the n copies of the front string.
     */
    public static String frontTimes(String str, int n) {
        //  Your code goes here....
        int a =str.length();
        String b ="";
        String c = "";
        if (a >=3 && n >0){
            for (int i=0;i<3;i++){
                b=b+str.charAt(i);
                        }
                    }
        else{
            for (int i=0;i<a;i++){
                b=b+str.charAt(i);
            }
        }            
        for (int j=0;j<n;j++){
                c=c+b;
        }
        
        return c;
    
    
    }
}