package dontJudgeMeByMyCover;

public class Book {
	private String author = "";
	private String title = "";
	private String description = "";
	private double price = 0.0;
	private int inStock = 10;
	
	public Book(){
		author = "Tadatoshi Fujimaki";
		title = "The Basketball Kuroko Plays Vol. 1";
		description = "The basketball team of Teiko Middle School rose to distinction by demolishing all competition. The regulars of the team became known as the \"Generation of Miracles\". After graduating from middle school, these five stars went to different high schools with top basketball teams. However, a fact few know is that there was another player in the \"Generation of Miracles\": a phantom sixth man. This mysterious player is now a freshman at Seirin High, a new school with a powerful, if little-known, team. Now, Tetsuya Kuroko – \"the sixth member of the \"Generation of Miracles\", and Taiga Kagami – a naturally talented player who spent most of middle school in the US, aim to bring Seirin to the top of Japan and begin taking on Kuroko\'s former teammates one by one. The series chronicles Seirin\'s rise to become Japan\'s number one high school team. The rest of the Generation of Miracles include Ryota Kise, Shintaro Midorima, Daiki Aomine, Atsushi Murasakibara and Seijuro Akashi.";
		price = 19.99;
		inStock = 10;
	}
	public Book(String aut, String tit, String des, double pri, int iS){
		author = aut;
		title = tit;
		description = des;
		price = pri;
		inStock = iS;
	}
	
	public String getAuthor(){
		return author;
	}
	public String getTitle(){
		return title;
	}
	public String getDescription(){
		return description;
	}
	public double getPrice(){
		price = ((int)(price *100 + 0.5))/100.0;
		return price;
	}
	public int getInStock(){
		return inStock;
	}
	public void setAuthor(String aut){
		author = aut;
	}
	public void setTitle(String tit){
		title = tit;
	}
	public void setDescription(String des){
		description = des;
	}
	public void setPrice(double pri){
		price = pri;
	}
	public void setInStock(int iS){
		inStock = iS;
	}
	public String getText(){
		String output = "";
		/*String description2 = "";
		String[] listOfStrings = description.split(" ");
		for (int count = 0; count < listOfStrings.length; count++){
			if (count%10==0 || count==1){
				description2+=(listOfStrings[count] + "\n");
			}
			else if(count == listOfStrings.length-1){
				description2+=listOfStrings[count];
			}
			else{
				description2+=(listOfStrings[count] + " ");
			}
				
		}*/
		output = ("Author: " + author + "\nTitle: " + title + "\nDescription: " + consoleTextFormatter(description, 10));
		
		return output;
	}
	public String cart(int numOfBooks){
		double subTotal = 0.0;
		String output = "";
		
		if(numOfBooks<inStock){
			subTotal = ((int)((numOfBooks*price)*100+.05))/100.0;
			output = ("Your " + numOfBooks + " copies of " + title+ " by " + author +  " cost " + "$" + subTotal);
					
		}else if(numOfBooks>inStock&&inStock>0){
			subTotal = ((int)((inStock*price)*100+.05))/100.0;
			output = ("I'm sorry we only have " + inStock + " books. If you still want these "+ inStock +" copies of " + title+ " by " + author + " they cost " + "$" + subTotal);
		}
		else if(inStock<=0){
			output = ("I'm sorry we are out of " + title + " by " + author + ". Please come again.");
		}
		else{
			output = ("I'm sorry there was a problem with the cash registers. Please come again.");
		}
		return consoleTextFormatter(output, 10);
	}
	public String consoleTextFormatter(String text, int nextLine)
	{
		String[] listOfStrings = text.split(" ");
		String output = "";
		for (int count = 0; count < listOfStrings.length; count++){
			if (count%nextLine==0 && count!=0){
				output+=(listOfStrings[count] + "\n");
			}
			else if(count == listOfStrings.length-1){
				output+=listOfStrings[count];
			}
			else{
				output+=(listOfStrings[count] + " ");
			}
				
		}
		return output;
	}
}
