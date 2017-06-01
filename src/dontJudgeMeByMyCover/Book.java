package dontJudgeMeByMyCover;

public class Book {
	private String author = "";
	private String title = "";
	private String description = "";
	
	public Book(){
		author = "Tadatoshi Fujimaki";
		title = "The Basketball Kuroko Plays";
		description = "The basketball team of Teiko Middle School rose to distinction by demolishing all competition. The regulars of the team became known as the \"Generation of Miracles\". After graduating from middle school, these five stars went to different high schools with top basketball teams. However, a fact few know is that there was another player in the \"Generation of Miracles\": a phantom sixth man. This mysterious player is now a freshman at Seirin High, a new school with a powerful, if little-known, team. Now, Tetsuya Kuroko – \"the sixth member of the \"Generation of Miracles\", and Taiga Kagami – a naturally talented player who spent most of middle school in the US, aim to bring Seirin to the top of Japan and begin taking on Kuroko\'s former teammates one by one. The series chronicles Seirin\'s rise to become Japan\'s number one high school team. The rest of the Generation of Miracles include Ryota Kise, Shintaro Midorima, Daiki Aomine, Atsushi Murasakibara and Seijuro Akashi.";
		
	}
	public Book(String aut, String tit, String des){
		author = aut;
		title = tit;
		description = des;
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
	public void setAuthor(String aut){
		author = aut;
	}
	public void setTitle(String tit){
		title = tit;
	}
	public void setDescription(String des){
		description = des;
	}
	public String getText(){
		String description2 = "";
		String masterString = "";
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
				
		}
		masterString = ("Author: " + author + "\nTitle: " + title + "\nDescription: " + description2);
		
		return masterString;
	}
}
