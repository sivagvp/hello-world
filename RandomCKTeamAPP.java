
/*
draft version 1.0 Random Fantacy cricket team generator 
@Author: Siva Ganesh
Note: Need to change the players data accordingly and stucure
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class RandomCKTeamAPP{
    
       HashMap<Integer,Player> players22=new HashMap<Integer,Player>();
        HashMap<Integer,Player> players11=new HashMap<Integer,Player>();
     private static int teamACount=0;
     private static int teamBCount=0;
      private static int MAX_TEAM_A_COUNT=6;
       private static int MAX_TEAM_B_COUNT=5;
       
        private static int MAX_WK_COUNT=1;
         private static int MAX_BT_COUNT=4;
          private static int MAX_AL_COUNT=2;
           private static int MAX_BO_COUNT=4;
           
           private static int wk_count=0;
     private static int bt_count=0;
     private static int al_count=0;
     private static int bo_count=0;
        
       
     
     public RandomCKTeamAPP()
     {
         Player p1=new Player(1,"WADE","A","WK");
         players22.put(1,p1);
         
         Player p2=new Player(2,"T Paine","A","WK");
         players22.put(2,p2);
         
         Player p3=new Player(3,"W SHAW","B","WK");
         players22.put(3,p3);

         Player p4=new Player(4,"KL RAHUL","B","BT");
         players22.put(4,p4);
         
         Player p5=new Player(5,"S SMITH","A","BT");
         players22.put(5,p5);
         
         Player p6=new Player(6,"P SHAW","B","BT");
         players22.put(6,p6);
         
         Player p7=new Player(7,"M AGARWAL","B","BT");
         players22.put(7,p7);
         
         Player p8=new Player(8,"M Labuschage","A","BT");
         players22.put(8,p8);
         
         Player p9=new Player(9,"J BURNS","A","BT");
         players22.put(9,p9);
         
          Player p10=new Player(10,"RAHANE","B","BT");
         players22.put(10,p10);
         
          Player p11=new Player(11,"PUJARA","B","BT");
         players22.put(11,p11);
         
         
         Player  p12=new Player(12,"HEAD","A","AL");
         players22.put(12,p12);
         
         Player  p13=new Player(13,"ASWIN","B","AL");
         players22.put(13,p13);
         
          Player p14=new Player(14,"C GREEN","A","AL");
         players22.put(14,p14);
         
         Player p15=new Player(15,"H VIHARI","B","AL");
         players22.put(15,p15);
         
         Player p16=new Player(16,"STARC","A","BO");
         players22.put(16,p16);
         
         Player p17=new Player(17,"P CUMMINS","A","BO");
         players22.put(17,p17);
         
         Player p18=new Player(18,"BUMRAHA","B","BO");
         players22.put(18,p18);
         
         Player p19=new Player(19,"M SHAMI","B","BO");
         players22.put(19,p19);
         
         Player p20=new Player(20,"HAZZLEWOOD","A","BO");
         players22.put(20,p20);
         
         Player p21=new Player(21,"YADAV","B","BO");
         players22.put(21,p21);
         
         Player p22=new Player(22,"LYNCH","A","BO");
         players22.put(22,p22);
     
     }
public void start()
{
    ArrayList<Integer> players11List=new ArrayList();
   
    int count=0;
    while(count<11)
    {
         int random=getRandom(22);
       if( !players11List.contains(random) )
       {
       
        players11List.add(random);
        Player p=players22.get(random);
        boolean canWeAdd=processPlayer(p);
        if(canWeAdd){
        players11.put(random,p);
       // System.out.println("playerid added:"+random);
        count++;
        }
        
       }
      }
      System.out.println("Count"+count);
  //print 11 players 
  
  for (Map.Entry<Integer, Player> entry : players11.entrySet()) {
        int k = entry.getKey();
        Player v = entry.getValue();
        System.out.println( v);
    }
}
public boolean processPlayer(Player p){
    String team=p.team;
    String type=p.type;
    boolean status=false;
    if(("A".equals(team) && teamACount<MAX_TEAM_A_COUNT) ||
      ("B".equals(team) && teamBCount<MAX_TEAM_B_COUNT) )
    {
        if("WK".equals(type) && wk_count<MAX_WK_COUNT)
        {
            wk_count++;
            status=true;
        } else if("BT".equals(type) && bt_count<MAX_BT_COUNT)
        {
            bt_count++;
            status=true;
        } else if("AL".equals(type) && al_count<MAX_AL_COUNT)
        {
            al_count++;
            status=true;
        } else if("BO".equals(type) && bo_count<MAX_BO_COUNT)
        {
            bo_count++;
            status=true;
        }
        if(status==true)
        if("A".equals(team))
        teamACount++; else teamBCount++;
        
    }
   System.out.println(p.name +","+status);
    
    return status;
}
     public static void main(String []args){
         
         new Main().start();
         
     }
     
     public  int getRandom(int range)
     {
           int Random = ((int)(Math.random()*7*11*100+1)%range);
         //  System.out.println("Random:"+(Random+1));
           return Random+1;
     }
     
     
}
     class Player{
         String name;
         String type;
         int id;
         String team;
         public Player(int id,String name,String team,String type )
         {
             this.id=id;
             this.name=name;
             this.team=team;
             this.type=type;
             
         }
         public String toString()
         {
             return "["+name+","+team+","+type+","+id+"]";
         }
     }
