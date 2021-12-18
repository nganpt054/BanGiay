package bean;

public class productbean {
	private String id;
	private String name;
	private String image;
	private String price;
	private String title;
	private String description;
	private Long cateID;
	
	public productbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public productbean(String id, String name, String image, String price, String title,String description ,Long cateID) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.price = price;
		this.title = title;
		this.description=description;
		this.cateID=cateID;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getCateID() {
		return cateID;
	}
	public void setCateID(Long cateID) {
		this.cateID = cateID;
	}
	
}
