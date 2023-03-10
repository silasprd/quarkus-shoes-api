package com.shoes;

import java.util.LinkedList;
import java.util.List;

public class Model {
    private List<Shoe> shoes = new LinkedList<Shoe>();

	public Model() {
		addShoes(new Shoe("Air Max", new Especification("Nike", 38, "Preto")));
	}
	
	public void addShoes(Shoe shoe){
		shoes.add(shoe);
	}
	
	public Shoe searchModel(String model){
		for(Shoe shoe:shoes){
			if(shoe.getModel().equals(model)) return shoe;
		}
		
		return null;
	}
	
	
	public List<Shoe> searchEspecification(Especification especification){
		List<Shoe> shoesFounds = new LinkedList<Shoe>();
		
		for(Shoe shoe:shoes){
			 if(especification.compare(shoe.getEspecification())) shoesFounds.add(shoe);
		}
		
		return shoesFounds;
		
	}
	
	
	public List<Shoe> searchBrand(String brand){
		List<Shoe> shoesFounds = new LinkedList<Shoe>();
		for(Shoe shoe:shoes) {
			if(shoe.getEspecification().getBrand().equals(brand)) shoesFounds.add(shoe);
		}
		return shoesFounds;
	}
	
	public List<Shoe> getShoes(){
		return shoes;
	}
}
