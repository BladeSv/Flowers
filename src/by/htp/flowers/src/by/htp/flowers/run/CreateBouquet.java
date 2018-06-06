package by.htp.flowers.run;

import java.util.Scanner;

import by.htp.flowers.emtty.Accessory;
import by.htp.flowers.emtty.AliveFlower;
import by.htp.flowers.emtty.Bouquet;
import by.htp.flowers.emtty.Flower;
import by.htp.flowers.emtty.NonLivingFlower;
import by.htp.flowers.emtty.ParkingPaper;
import by.htp.flowers.emtty.Tape;
import by.htp.flowers.emtty.partsBouquet;

public class CreateBouquet {
	private int bouquetInd;
	Scanner sc =new Scanner(System.in);
	
	public Bouquet createBouquet() {
		System.out.println("���������� ������ �� � ����� ������ ���������� �����.");
		System.out.println("��� �������� ������ ������ ������:");
		Bouquet bouquet= new Bouquet();
		bouquet.setName(sc.nextLine());
		System.out.println("������� ����� ������ � ����� ������?");
		bouquet.setNumFlo(sc.nextInt());
		Flower[] ArrayFlo= new Flower[bouquet.getNumFlo()];
		for(int i=0; i< bouquet.getNumFlo();i++) {
			createFlower(ArrayFlo, i);	
		}
		
		System.out.println("������� ����� ����������� � ����� ������?");
		bouquet.setNumAcc((sc.nextInt()));
		Accessory ArrayAcc[] = new Accessory[bouquet.getNumAcc()]; 
		for(int i=0; i< bouquet.getNumFlo();i++) {
			createAccessory(ArrayAcc, i);
		}
		
		
		partsBouquet[]  partsBouquet =new partsBouquet [bouquet.getNumAcc()+bouquet.getNumFlo()];	
		bouquet.setBouquet(partsBouquet);
		//new DaySort(ArrayFlo).daySort();
		
			
					for(Flower flo:ArrayFlo) {
						partsBouquet[bouquetInd]= flo;
						bouquetInd++;
					
					}
					for(Accessory Acc:ArrayAcc) {
						partsBouquet[bouquetInd]	= Acc;
						bouquetInd++;
					}
		
		
		
		return bouquet;
		
	}
	
	public void createFlower(Flower[] ArrayFlo, int index) {
		int chose;
		while(true) {
		System.out.println("��������� ����� ����� ������ �"+(index+1)+" � ������?");	
		System.out.println("1. ������");
		System.out.println("2. �������������");
		System.out.println("3. ���������");
		chose=sc.nextInt();
		if (chose==0 || chose==1 || chose==3) break;
		}
		if(chose==3) {
				createRandomFlower(ArrayFlo,index );
				} else {
					System.out.println("������� �������� ������ �"+(index+1)+" � ������");	
					ArrayFlo[index].setName(sc.nextLine());
					System.out.println("������� ��������� ������ �"+(index+1)+" � ������");	
					ArrayFlo[index].setPrice(sc.nextDouble());
					System.out.println("������� ���� ������ ������ �"+(index+1)+" � ������");	
					ArrayFlo[index].setColor(sc.nextLine());
					System.out.println("�������  ����� ������ �"+(index+1)+" � ������");	
					ArrayFlo[index].setLength(sc.nextInt());
					if (chose==1) {
						System.out.println("������� ���� ����� ������ �"+(index+1)+" � ������ �������?");	
						((AliveFlower)ArrayFlo[index]).setCutDay((sc.nextInt()));
					} else {
						System.out.println("������� ���� ����� ������ �"+(index+1)+" � ������ �������?");	
						((NonLivingFlower)ArrayFlo[index]).setProdactionDay((sc.nextInt()));
						System.out.println("�� ������ ��������� ������ �"+(index+1)+" � ������ ������?");	
						((NonLivingFlower)ArrayFlo[index]).setMaterial(sc.nextLine());
					}
					
				}
				}
		
		
	public void createAccessory(Accessory[] ArrayAcc, int index){
		int chose;
		while(true) {
			System.out.println("��������� ����� ����� ��������� �"+(index+1)+" � ������?");	
			System.out.println("1. ����������� ������");
			System.out.println("2. ������� �����");
			System.out.println("3. ���������");
			chose=sc.nextInt();
			if (chose==0 || chose==1 || chose==3) break;
			}
		
		if(chose==3) {
			createRandomAccessory(ArrayAcc,index );
			} else {
				System.out.println("������� �������� ���������� �"+(index+1)+" � ������");	
				ArrayAcc[index].setName(sc.nextLine());
				System.out.println("������� ��������� ���������� �"+(index+1)+" � ������");	
				ArrayAcc[index].setPrice(sc.nextDouble());
				System.out.println("������� ���� ������ ���������� �"+(index+1)+" � ������");	
				ArrayAcc[index].setColor(sc.nextLine());
					if (chose==1) {
					System.out.println("����������� ������ ��������� �"+(index+1)+"����� �� ������� �����:");	
					((ParkingPaper)ArrayAcc[index]).setSize(sc.nextInt());
				} else {
					System.out.println("������� ����� ��������� �"+(index+1)+" �� ����� �����:");	
					((Tape)ArrayAcc[index]).setLength(sc.nextInt());
					
				}
				
			}
		
		
	}
	
		
	
		
		{
	}
	
	
	
	
	
	public void createRandomFlower(Flower[] ArrayFlo, int index) {
		switch((int)Math.round(Math.random())) {
		case 0: 
			AliveFlower aliveFlower = new AliveFlower();
			aliveFlower.setName("AliveFlower"+index);
			aliveFlower.setPrice((Math.random()*10));
			aliveFlower.setColor("color"+index);
			aliveFlower.setLength((int)(Math.random()*60));
			aliveFlower.setCutDay((int)(Math.random()*20));
			ArrayFlo[index]=aliveFlower;
			
			System.out.println(aliveFlower);
			break;
		case 1: 
			NonLivingFlower nonLivingFlower= new NonLivingFlower();
			nonLivingFlower.setName("AliveFlower"+index);
			nonLivingFlower.setPrice((Math.random()*10));
			nonLivingFlower.setColor("color"+index);
			nonLivingFlower.setLength((int)(Math.random()*60));
			nonLivingFlower.setProdactionDay((int)(Math.random()*20));
			nonLivingFlower.setMaterial("Carbon"+index);
			ArrayFlo[index]=nonLivingFlower;
			System.out.println(nonLivingFlower);
			break;
		}
	}
	
	public void createRandomAccessory(Accessory[] ArrayAcc, int index) {
	
		switch((int)Math.round(Math.random())) {
		case 0: 
		ParkingPaper paper=new ParkingPaper();
		paper.setName("ParkingPaper"+index);
		paper.setColor("color"+index);
		paper.setSize(5+index);
		paper.setPrice((Math.random()*10));
		 ArrayAcc[index]=paper;
		 System.out.println(paper.toString());
		break;
	
		case 1: 
		Tape tape =new Tape();	
		tape.setName("Tape"+index);
		tape.setColor("color"+index);
		tape.setPrice((Math.random()*10));
		tape.setLength((int)(Math.random()*10));
		
		ArrayAcc[index]=tape;
		System.out.println(tape.toString());
		break;
		
		}
		
	}
	
}
