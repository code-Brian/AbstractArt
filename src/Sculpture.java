
public class Sculpture extends Art {
	private String material;
	
	public void viewArt() {
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + getAuthor());
		System.out.println("Description: " + getDescription());
		System.out.println("Material: " + getMaterial());
	}
	
	public Sculpture() {
		
	}
	
	public Sculpture(String title, String author, String description, String material) {
		setTitle(title);
		setAuthor(author);
		setDescription(description);
		setMaterial(material);
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
