package by.htp.flowers.emtty;

public class AliveFlower extends Flower {
	private int cutDay;
	public int getCutDay() {
		return cutDay;
	}
	public void setCutDay(int cutDay) {
		this.cutDay = cutDay;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name="+this.getName()+" Price="+ String.format("%.3f", this.getPrice())+" бел.руб."+" length="+this.getLength()+" Color="+this.getColor()+" cutDay="+this.getCutDay();
	}
}
