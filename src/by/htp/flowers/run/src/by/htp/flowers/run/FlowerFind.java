package by.htp.flowers.run;

import by.htp.flowers.emtty.Flower;

public class FlowerFind {
	
	private int min;
	private int max ;
	Flower[] ArrayFind;
	
	public FlowerFind(Flower[] ArrayFind, int min, int max) {
		this.ArrayFind=ArrayFind;
	this.min=min;
	this.max=max;
	}
	public void flowerfind() {
		System.out.println("Result FlowerFind");
	for(Flower flo: ArrayFind) {
		if((flo.getLength()>=min) && (flo.getLength()<=max)) {
			System.out.println(flo);
		}		
	}
	System.out.println();
	}
}
