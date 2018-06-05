package by.htp.flowers.emtty;

public class NonLivingFlower extends Flower{
private int prodactionDay;
private  String material;

	public int getProdactionDay() {
		return prodactionDay;
	}
	public void setProdactionDay(int prodactionDay) {
		this.prodactionDay = prodactionDay;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name="+this.getName()+" Price="+ String.format("%.3f", this.getPrice())+" бел.руб."+" length="+this.getLength()+" Color="+this.getColor()+" prodactionDay="+this.getProdactionDay()+" material="+this.getMaterial();
	}
}
