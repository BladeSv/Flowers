package by.htp.flowers.emtty;

import java.text.Format;

public class ParkingPaper extends Accessory{

 private int size;
 
 
public void setSize(int size) {
	this.size = size;
}
public int getSize() {
	return size;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Name="+this.getName()+" Price="+ String.format("%.3f", this.getPrice())+" бел.руб."+" Color="+this.getColor()+" Size="+this.getSize();
}
}
