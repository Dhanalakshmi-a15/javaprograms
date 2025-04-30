package NewPackage;

public class BookTask {
     private String title;
     private String author;
     private double price;
     
  // Getter for title
     public String getTitle() {
         return title;
     }

     // Setter for title
     public void setTitle(String title) {
         this.title = title;
     }

     // Getter for author
     public String getAuthor() {
         return author;
     }

     // Setter for author
     public void setAuthor(String author) {
         this.author = author;
     }

     // Getter for price
     public double getPrice() {
         return price;
     }

     // Setter for price
     public void setPrice(double price) {
         this.price = price;
     }
     
     // method for apply discount
     
     public void applyDiscount(double percentage)
     {
    	 if ( percentage <= 100) {
             price = price - (price * (percentage / 100));
             
             
         } 
    	 
     }
     
	public static void main(String[] args) {
		
		BookTask obj = new BookTask();
		
		obj.setTitle("harrypotter");
		obj.setAuthor("Mine");
		obj.setPrice(299.99);
		
		
		System.out.println(obj.getTitle());
        System.out.println(obj.getAuthor());
        System.out.println(obj.getPrice());

        obj.applyDiscount(20);
        System.out.println("discount Price:" + obj.getPrice());


	}

}