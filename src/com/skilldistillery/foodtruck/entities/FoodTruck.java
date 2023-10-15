/*
Synopsis: FoodTruck class
Author: Jacob Stuart
Version: 1.0
 */
package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private int foodTruckID;
	private String foodTruckName;
	private String foodTruckFood;
	private int foodTruckRating;
	//Variable used to set FoodTruckId via constructor method
	private static int nextFoodTruckId = 0;
	
	//Note: Even if a no args constructor is used, the FoodTruck object will still have an ID
	public FoodTruck() {
		FoodTruck.nextFoodTruckId++;
		this.foodTruckID = FoodTruck.nextFoodTruckId;
	}

	public FoodTruck(String foodTruckName, String foodTruckFood, int foodTruckRating) {
		this.foodTruckName = foodTruckName;
		this.foodTruckFood = foodTruckFood;
		this.foodTruckRating = foodTruckRating;
		FoodTruck.nextFoodTruckId++;
		this.foodTruckID = FoodTruck.nextFoodTruckId;
	}
	
	//Setter/Getters: most are not used currently but that may change in the future
	public int getNextFoodTruckId() {
		return nextFoodTruckId;
	}

	public String getFoodTruckName() {
		return foodTruckName;
	}

	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}

	public String getFoodTruckFood() {
		return foodTruckFood;
	}

	public void setFoodTruckFood(String foodTruckFood) {
		this.foodTruckFood = foodTruckFood;
	}
	
	//Mutator converts Rating int into a double to make Avg calculation cleaner
	public double getFoodTruckRating() {
		return foodTruckRating;
	}
	
	public void setFoodTruckRating(int foodTruckRating) {
		this.foodTruckRating = foodTruckRating;
	}

	public int getFoodTruckID() {
		return foodTruckID;
	}

	@Override
	public String toString() {
		return "| Food Truck ID: " + foodTruckID + "\t"
				+ (foodTruckName != null ? "Food Truck Name: " + foodTruckName + "\t" : "")
				+ (foodTruckFood != null ? "Type of food: " + foodTruckFood + "\t" : "") + "Food Truck Rating: "
				+ foodTruckRating + " | ";
	}

}