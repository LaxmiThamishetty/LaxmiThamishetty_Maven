package com.epam.Maven;

import java.util.Comparator;

public class NewYearGift implements Comparable<NewYearGift> {
	private String name;
	private int cost;
	int weight;

	public NewYearGift(String name,int cost,int weight){
		this.name = name;
		this.cost = cost;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int compareTo(NewYearGift g1) {
		return this.getCost()-g1.getCost();
	}


	public int calculateWeight(int weight, int quantity) {

		return weight*quantity;
	}
}

class SortByPrice implements Comparator<NewYearGift>{
	public int compare(NewYearGift g,NewYearGift g1) {
		return g.getCost()-g1.getCost();
	}
}
class SortByWeight implements Comparator<NewYearGift>{
	public int compare(NewYearGift g,NewYearGift g1) {
		return g.getWeight()-g1.getWeight();
	}
}