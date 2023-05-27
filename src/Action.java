public class Action extends Movie{
    public double fee = 3;
    
    public Action(){
        
    }
    
    public Action(int id,String title,String rating,String genre){
        
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.genre = "Action";
        
    }
    public double calculateFees(int days){
        return days * fee;
    }
}
