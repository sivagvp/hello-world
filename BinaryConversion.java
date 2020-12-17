import java.util.List;
import java.util.Vector;

/*
@author Siva Ganesh
input interger number
output Binary String equvalent of the given input integer Number
Note: 
*/
public class BinaryConversion{

     public static void main(String []args){
     //Testing String getBinaryString(int val) 
       int val=9;
System.out.println("Binary String for Decimal Number "+val+"="+new BinaryConversion().getBinaryString(val));
       
     }
      //Example input val=9 , return String "1001"
     private String getBinaryString(int val){
         
         char digits[]={'0','1'};
         int shift=1;
         int radix =2;
         int mask = 1;
 
         int offset=0;
         int mag = Integer.SIZE - Integer.numberOfLeadingZeros(val);
        int charPos = Math.max(mag, 1);
        char[] buf=new char[charPos];
         do {

            buf[offset + --charPos] = digits[val & mask];
            val >>>= 1;

        } while (val!=0 && charPos>0);
        
         return new String(buf);
        
         }
       
    
}
