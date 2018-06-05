package by.htp.flowers.emtty;

public class Bouquet {
	private String name;
	private double price;
	partsBouquet[] bouquet;  

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	
	}
	public double getPrice() {
		for(partsBouquet bor:bouquet) {
			this.price=this.price+bor.getPrice();
		}
		return this.price;
	}
	public partsBouquet[] getBouquet() {
		return bouquet;
	}
	public void setBouquet(partsBouquet[] bouquet) {
		this.bouquet = bouquet;
	}
}
