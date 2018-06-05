package by.htp.flowers.run;
import by.htp.flowers.emtty.*;

public class Run {
static int quantityAcc=3;
static int quantityFlo=9;
static int bouquetInd;
static int min=2;
static int max=10;
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
		partsBouquet[]  partsBouquet =new partsBouquet [quantityAcc+quantityFlo];
		Bouquet bouquet = new Bouquet();
		bouquet.setBouquet(partsBouquet);
		bouquet.setName("BestBouquet");
		new DaySort(ArrayFlo).daySort();
		
			
					for(Flower flo:ArrayFlo) {
						partsBouquet[bouquetInd]= flo;
						bouquetInd++;
					
					}
					for(Accessory Acc:ArrayAcc) {
						partsBouquet[bouquetInd]	= Acc;
						bouquetInd++;
					}
					System.out.println();
					
					
			
				
					for(partsBouquet Bou:bouquet.getBouquet()) {
						
						System.out.println(Bou);					
				}
					new FlowerFind(ArrayFlo, min, max).flowerfind();
					
			System.out.println();
			System.out.println("Total price "+bouquet.getName()+" = "+String.format("%.3f", bouquet.getPrice())+" бел.руб.");
			
	}

}
		
	

