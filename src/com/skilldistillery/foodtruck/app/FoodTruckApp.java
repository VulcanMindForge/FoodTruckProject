/*
Synopsis:
Author:
Version: 
 */
package com.skilldistillery.foodtruck.app;

import java.util.Scanner;
import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	// Function:
	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();
	}

	public void run() {
		Scanner kb = new Scanner(System.in);
		FoodTruck initial = new FoodTruck();
		FoodTruck[] foodTrucks = new FoodTruck[5];
		String name = "";
		String foodType = "";
		double rating = 0.0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter the name of a food truck.\nYou may enter quit to stop entering food trucks.\n:");
			name = kb.nextLine();
			if ("quit".equals(name.toLowerCase())) {
				break;
			} else {
				System.out.println("Please enter the type of food served at the truck: ");
				foodType = kb.nextLine();
				System.out.println("Please enter the food truck rating: ");
				rating = kb.nextDouble();
				kb.nextLine();
			}
			foodTrucks[initial.getNextFoodTruckId()] = new FoodTruck(name, foodType, rating);
		}
		
		FoodTruck[] foodTruckFleet = convertToFleet(foodTrucks);
		for (FoodTruck foodTruck : foodTruckFleet) {
			System.out.println(foodTruck);
		}
		kb.close();
	}
	
	public FoodTruck[] convertToFleet(FoodTruck[] foodTrucks) {
		int truckCounter = 0;
		for (FoodTruck foodTruck : foodTrucks) {
			if (foodTruck != null) {
				truckCounter++;
			}
		}
		
		FoodTruck[] foodTruckFleet = new FoodTruck[truckCounter];
		int fleet = 0;
		for (int i = 0; i < 5; i++) {			
			if (foodTrucks[i] == null) {
				continue;
			} else {				
			foodTruckFleet[fleet] = foodTrucks[i];
			fleet++;
			}
		}
		System.out.println(foodTruckFleet.length);
		return foodTruckFleet;
	}
	
	public void menuSwitch(int choice) {
		
	}

	public void displayMenu() {
		
	}
	
	public void listFoodTrucks() {
		
	}
	
	public void avgFoodTruckRating() {
		
	}
	
	public void highestRatedFoodTruck() {
		
	}
}
