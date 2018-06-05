package by.htp.flowers.run;

import by.htp.flowers.emtty.AliveFlower;
import by.htp.flowers.emtty.Flower;
	
public class DaySort {
	Flower[] ArraySort;
	public DaySort(Flower[] ArrayFlo) {
		ArraySort=ArrayFlo;
	}
	
	public void daySort () {

		Flower tepm= new Flower();
		for(int i=0;i<ArraySort.length;i++) {
			
			for(int j=0; j<ArraySort.length;j++) {
				if(ArraySort[i].getClass().getSimpleName().equals("AliveFlower")) {
					if(ArraySort[j].getClass().getSimpleName().equals("AliveFlower")){
					
					if((((AliveFlower)ArraySort[i]).getCutDay())<(((AliveFlower)ArraySort[j]).getCutDay())) {
						
						tepm=ArraySort[j];
						ArraySort[j]=ArraySort[i];
						ArraySort[i]=tepm;
					}
				}
				
			}
			}
		}
	
		}
		
		
		
	}
	

