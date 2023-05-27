public class Movie {
    
    public int id = 0;
    public String title = null;
    public String rating =null;
    public String genre = null;
    public int days = 1;
    public double fee = 2;
    
    public Movie(){
         }
      
    public Movie(int id,String title,String rating, String genre){
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.genre = genre;
        
    }
    public double calculateFees(int days){
        return days * fee;
    }
    public void displayInfo(){
        System.out.println("ID: "+id);
        System.out.println("Movie Title: "+ title);
        System.out.println("Rating: "+rating);
        System.out.println("Genre: "+genre);
    }
}

