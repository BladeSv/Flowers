package by.htp.flowers.emtty;

public class Accessory extends Bouquet {
private String accessoryType;
private int price;
public Accessory(String name, String accessoryType, int price) {
	super(name);
	this.accessoryType=accessoryType;
	this.price=price;
}
}
