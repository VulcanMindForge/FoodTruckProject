/*
Synopsis:
Author:
Version: 
 */
package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private int foodTruckID;
	private String foodTruckName;
	private String foodTruckFood;
	private double foodTruckRating;
	private static int nextFoodTruckId = 0;
	
	public FoodTruck () {
	
	}

	public FoodTruck(String foodTruckName, String foodTruckFood, double foodTruckRating) {
		this.foodTruckName = foodTruckName;
		this.foodTruckFood = foodTruckFood;
		this.foodTruckRating = foodTruckRating;
		FoodTruck.nextFoodTruckId++;
		this.foodTruckID = FoodTruck.nextFoodTruckId;
	}

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

	public double getFoodTruckRating() {
		return foodTruckRating;
	}

	public void setFoodTruckRating(double foodTruckRating) {
		this.foodTruckRating = foodTruckRating;
	}

	public int getFoodTruckID() {
		return foodTruckID;
	}

	@Override
	public String toString() {
		return "| Food Truck ID: " + foodTruckID + "\t" + (foodTruckName != null ? "Food Truck Name: " + foodTruckName + "\t" : "")
				+ (foodTruckFood != null ? "Type of food: " + foodTruckFood + "\t" : "") + "Food Truck Rating: "
				+ foodTruckRating + " | ";
	}

		
}