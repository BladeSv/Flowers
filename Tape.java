package by.htp.flowers.emtty;

public class Tape extends Accessory {

 private int length;

 public void setLength(int length) {
	this.length = length;
}
 
 public int getLength() {
	return length;
}
		public String toString() {
			// TODO Auto-generated method stub
			return "Name="+this.getName()+" Price="+String.format("%.3f", this.getPrice())+" бел.руб."+" Color="+this.getColor()+" length="+this.getLength();
		}
		
}
