public class movie {
        String name;
        String duration;
       float rating;
        movie(String name,String duration,float rating){
            this.name=name;
            this.duration=duration;
            this.rating=rating;
        }
            void details(){
              System.out.println("movie name is:"+name);
              System.out.println("movie duration:"+duration);
               System.out.println("movie rating is:"+rating);
          
        if(rating >9){
            System.out.println("movie is HIT");
        }
          
        }
public static void main(String[] args){
        movie m1=new movie("avengers","1h33m",9.1f);
         movie m2=new movie("deda deba","1h33m",8.1f);
    m1.details();
    m2.details();
    
    
}
    }