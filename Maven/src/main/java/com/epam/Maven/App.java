package com.epam.Maven;

/**
 * Hello world!
 *
 */
import java.util.*;
class KitKat extends NewYearGift{
	int quantity;

	public KitKat(String name, int cost, int weight, int quantity) {
		super(name, cost, weight);
		this.quantity= quantity;
	}
}

class DairyMilk extends NewYearGift{
	int quantity;

	public DairyMilk(String name, int cost, int weight, int quantity) {
		super(name, cost, weight);
		this.quantity= quantity;
	}
}
class MunchCrunch extends NewYearGift{
	int quantity;

	public MunchCrunch(String name, int cost, int weight, int quantity) {
		super(name, cost, weight);
		this.quantity= quantity;
	}
}




class Perk extends NewYearGift{
	int quantity;

	public Perk(String name, int cost, int weight, int quantity) {
		super(name, cost, weight);
		this.quantity= quantity;
	}
}




public class App {
	public static void main( String[] args )	{
		Scanner sc = new Scanner(System.in);
		int quantity = 0, total_candies = 0;
		char n1;
		NewYearGift collect;
		Boolean n = true;
		int cost, weight = 0,totalboxwt = 0, total_weight = 0;
		System.out.println("Fill the New Year Gift Box!!");
		ArrayList<NewYearGift> box =  new ArrayList<NewYearGift>();
		while(n) {
			System.out.println("List of choclates");

			System.out.println("1. Kitkat");
			System.out.println("2. Dairy Milk");
			System.out.println("3. MunchCruch");
			System.out.println("4. Perk");
			System.out.println("5. Display all choclates");
			System.out.println("6. Total Weight of choclates");
			System.out.println("Choose a number from 1-6");
			try {

				switch(sc.next().charAt(0)){
				case '1':
					System.out.println("please enter the quantity");
					quantity = sc.nextInt();
					System.out.println("please enter the weight in grams");
					weight = sc.nextInt();
					System.out.println("Please enter the cost of each choclate");
					cost = sc.nextInt();
					collect = new KitKat("KitKat",cost, weight,quantity);
					total_weight = collect.calculateWeight(weight, quantity);
					totalboxwt = totalboxwt + total_weight;
					total_candies = total_candies + quantity;
					box.add(collect);
					System.out.println("Added "+collect.getName());

					System.out.println("if yo want to add another choclate clck y else n");
					n1 = sc.next().charAt(0);
					if(n1 == 'y'|| n1 == 'Y') {
						n = true;
						break;
					}
					else {
						n = false;
						break;
					}
				case '2':
					System.out.println("Please enter the quantity");
					quantity = sc.nextInt();
					System.out.println("Please enter the weight in grams");
					weight = sc.nextInt();
					System.out.println("Please enter the cost of each choclate");
					cost = sc.nextInt();
					collect = new DairyMilk("Dairy_Milk",cost, weight,quantity);
					total_weight = collect.calculateWeight(weight, quantity);
					totalboxwt = totalboxwt + total_weight;
					total_candies += quantity;
					box.add(collect);
					System.out.println("Added "+collect.getName());

					System.out.println("if yo want to add another choclate clck y else n");
					n1 = sc.next().charAt(0);
					if(n1 == 'y'|| n1 == 'Y') {
						n = true;
						break;
					}
					else {
						n = false;
						break;
					}
				case '3':
					System.out.println("Please enter the quantity");
					quantity = sc.nextInt();
					System.out.println("Please enter the weight in grams");
					weight = sc.nextInt();
					System.out.println("Please enter the cost of each choclate");
					cost = sc.nextInt();
					collect = new MunchCrunch("MunchCrunch",cost, weight,quantity);
					total_weight = collect.calculateWeight(weight, quantity);
					totalboxwt = totalboxwt + total_weight;
					total_candies += quantity;
					box.add(collect);
					System.out.println("Added "+collect.getName());

					System.out.println("if yo want to add another choclate clck y else n");
					n1 = sc.next().charAt(0);
					if(n1 == 'y'|| n1 == 'Y') {
						n = true;
						break;
					}
					else {
						n = false;
						break;
					}



				case '4':
					System.out.println("Please enter the quantity");
					quantity = sc.nextInt();
					System.out.println("Please enter the weight in grams");
					weight = sc.nextInt();
					System.out.println("Please enter the cost of each choclate");
					cost = sc.nextInt();
					collect = new Perk("Perk",cost, weight,quantity);
					total_weight = collect.calculateWeight(weight, quantity);
					totalboxwt = totalboxwt + total_weight;
					total_candies += quantity;
					box.add(collect);
					System.out.println("Added "+collect.getName());

					System.out.println("if yo want to add another choclate clck y else n");
					n1 = sc.next().charAt(0);
					if(n1 == 'y'|| n1 == 'Y') {
						n = true;
						break;
					}
					else {
						n = false;
						break;
					}

				case '5':
					Collections.sort(box,new SortByPrice());
					for(NewYearGift i:box) {
						System.out.println("Name: "+i.getName()+" Price: "+i.getCost()+" Weight: "+i.getWeight());
					}
					System.out.println(box);
					break;
				case '6':
					System.out.println(total_weight);
					break;
				default:
					System.out.println("Enter valid Input");
					break;
				}
				}
			catch(Exception e){
				System.out.println("select one choclate that you want:");



			}
			}
		
		System.out.println("choclates present in Box are:");
		
		System.out.println(box);
		System.out.println("\n");
		System.out.println("Total weight of choclates in box is :" +totalboxwt+ "grams");
		System.out.println("Total number of choclates in the box:" +total_candies);
		
	}
}

