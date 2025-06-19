public class game {
        String name;
        String genere;
    
     float rating;
     int playcount=0;
     
        game(String name,String genere,float rating){
            this.name=name;
            this.genere=genere;
            this.rating=rating;
        }
        public void familyfriendly(){
            if(genere !="horror"){
            System.out.println("game is family friendly");
            }
        }
        public void play(){
            this.playcount=playcount+1;
           
        }
           public  void gamesummary(){
              System.out.println("game name is:"+name);
               System.out.println("game genere is:"+genere);
               System.out.println("game rating is:"+rating);
          System.out.println("game playcount is :"+this.playcount);
        
        }
          
    
public static void main(String[] args){
    game g1=new game("avengers","adventure",9.1f);
         game g2=new game("deda deba","romance",8.1f);
    g1.play();
    g1.gamesummary();

}
    }