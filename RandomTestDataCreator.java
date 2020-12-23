import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*
@Author:Siva Ganesh
@Utility API to get new data based on current time
Note: No external libraries required to run this program 
*/

public class RandomTestDataCreator{
/*input any String 
output we will get new unique data
This method will be used for testing purpose
It solves two problems
1.Provides New Data every time based on the base data
2.We will get to know when the user created by looking in to data(which is current date )

*/
public String getNewData(String data)
{
    //If data is null or data is empty String then by defaul it will create Test_ as data
    
    if(data==null || "".equals(data)) data="Test";

Calendar cal = Calendar.getInstance();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SS"); 

//If you think the name is too long we an remove the last _SS SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss"); 
    
String strDate = sdf.format(cal.getTime());

   
// return data+"_"+strDate;
   return  new StringBuilder(data).append("_").append(strDate).toString();
}

//This is for Testing purpose
public static void main(String args[])
{
//Testing of getNewData metod
String userName="Siva";

String testUserName=new RandomTestDataCreator().getNewData(userName);
//we can call RandomTestDataCreator.getNewData(userName) ; make this method static to call without creating object

System.out.println("New userName Data:"+testUserName); // Sample output :New userName Data:Siva_2020_12_22_09_38_33_104
}

}
