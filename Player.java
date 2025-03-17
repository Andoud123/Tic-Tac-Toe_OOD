public abstract class Player {
    
   protected String name;
   
   public Player(String name){
        super();  
        this.name = name;
   }

   public Player(){
     this.name = " ";
   }

   public String getName(){
        return name;
   }

   abstract public String getMove();

}
