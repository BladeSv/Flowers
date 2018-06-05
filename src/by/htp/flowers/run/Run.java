package by.htp.flowers.run;
import by.htp.flowers.emtty.*;

public class Run {
static int quantityAcc=3;
static int quantityFlo=9;
static int bouquetInd;
	public static void main(String[] args) {
		
		Accessory ArrayAcc[] = new Accessory[quantityAcc]; 
		for (int i=0;i<quantityAcc;i++ ) {
			
			switch((int)Math.round(Math.random())) {
			case 0: 
			ParkingPaper paper=new ParkingPaper();
			paper.setName("ParkingPaper"+i);
			paper.setColor("color"+i);
			paper.setSize(5+i);
			paper.setPrice((Math.random()*10));
			 ArrayAcc[i]=paper;
			 System.out.println(paper.toString());
			break;
		
			case 1: 
			Tape tape =new Tape();	
			tape.setName("Tape"+i);
			tape.setColor("color"+i);
			tape.setPrice((Math.random()*10));
			tape.setLength((int)(Math.random()*10));
			
			ArrayAcc[i]=tape;
			System.out.println(tape.toString());
			break;
			
			}
			
		}
		
		Flower ArrayFlo[]= new Flower[quantityFlo];
		for (int i=0;i<quantityFlo;i++ ) {
			
			switch((int)Math.round(Math.random())) {
			case 0: 
				AliveFlower aliveFlower = new AliveFlower();
				aliveFlower.setName("AliveFlower"+i);
				aliveFlower.setPrice((Math.random()*10));
				aliveFlower.setColor("color"+i);
				aliveFlower.setLength((int)(Math.random()*60));
				aliveFlower.setCutDay((int)(Math.random()*20));
				ArrayFlo[i]=aliveFlower;
				
				System.out.println(aliveFlower);
				break;
			case 1: 
				NonLivingFlower nonLivingFlower= new NonLivingFlower();
				nonLivingFlower.setName("AliveFlower"+i);
				nonLivingFlower.setPrice((Math.random()*10));
				nonLivingFlower.setColor("color"+i);
				nonLivingFlower.setLength((int)(Math.random()*60));
				nonLivingFlower.setProdactionDay((int)(Math.random()*20));
				nonLivingFlower.setMaterial("Carbon"+i);
				ArrayFlo[i]=nonLivingFlower;
				System.out.println(nonLivingFlower);
				break;
			}
		}
		Bouquet bouquet[] =new Bouquet[quantityAcc+quantityFlo];
		
		new DaySort(ArrayFlo).daySort();
		
				while(bouquetInd<(quantityAcc+quantityFlo)) {
					for(Flower flo:ArrayFlo) {
						bouquet[bouquetInd]	= flo;
						bouquetInd++;
					
					}
					for(Accessory Acc:ArrayAcc) {
						bouquet[bouquetInd]	= Acc;
						bouquetInd++;
					}
					System.out.println();
					
					
			
				
					for(Bouquet Bou:bouquet) {
						
						System.out.println(Bou);
					
				}
			
			
	}

}
		}
	

