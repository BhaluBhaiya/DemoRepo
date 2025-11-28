package com.mphasis.main;

public class ArraysDemo {

	public static void main(String[] args) {
		Cars carsArr[] = new Cars[5];
		
		Cars bmw = new Cars("M8 CS" , "BMW", "Sedan", 95000.79);
		Cars audi = new Cars("RS7" , "Audi", " Coupe SUV", 121000.52);
		Cars lambo = new Cars("Urus" , "Lamborghini", "Sports SUV", 205000.88);
		Cars ferrari = new Cars("12Cilindri" , "Ferrari", "Super Sports", 600000.76);
		Cars mclarren = new Cars("720s" , "McLarren", "Sports", 350000.95);
		
		carsArr[0] = bmw;
		carsArr[1] = audi;
		carsArr[2] = lambo;
		carsArr[3] = ferrari;
		carsArr[4] = mclarren;
		
		for(int i = 0; i<carsArr.length; i++) {
			System.out.println("MSRP of your "+carsArr[i].getBrand()+" "+carsArr[i].getCarName()+" after 40% luxury tax is going to be $"+ carsArr[i].getMSRP());
		}
	}

}
