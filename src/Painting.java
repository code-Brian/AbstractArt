
public class Painting extends Art {
	private String paintType;
	
	public void viewArt() {
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + getAuthor());
		System.out.println("Description: " + getDescription());
		System.out.println("Paint type: " + getPaintType());
	}
	
	public Painting() {
		
	}
	
	public Painting(String title, String author, String description, String paintType) {
		setTitle(title);
		setAuthor(author);
		setDescription(description);
		setPaintType(paintType);
	}

	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

}
