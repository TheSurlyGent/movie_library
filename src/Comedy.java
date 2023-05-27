public class Comedy extends Movie{
   public double fee = 2.50;
    public Comedy(){
    }
    
   public Comedy(int id,String title,String rating,String genre){
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.genre = "Comedy";
        
    }
   public double calculateFees(int days){
        return days * fee;
    }
}
