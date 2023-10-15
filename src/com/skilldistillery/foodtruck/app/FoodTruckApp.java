/*
Synopsis: FoodTruck rating app, up to 5 trucks
Author: Jacob Stuart
Version: 1.0
 */
package com.skilldistillery.foodtruck.app;

import java.util.Scanner;
import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();
	}

	public void run() {
		Scanner kb = new Scanner(System.in);
		int menuChoice = 0;
		int enterTrucks = 0;

		// Create foodTruck array reference and call method to add food trucks to array.
		// This creates an array of 5.
		FoodTruck[] foodTrucks = getFoodTrucks(kb);
		// Take the food truck array and create a new trimmed down version consisting of
		// 1-5 trucks
		FoodTruck[] foodTruckFleet = convertToFleet(foodTrucks);

		// Loop to catch if user didn't input any trucks. Options to enter trucks or
		// quit.
		while (foodTruckFleet.length == 0) {
			System.out.print(
					"It appears you didn't enter any food trucks, would you like to enter some now?\nChoosing no will exit the program.\n 1. Yes\n 2. No\n$>");
			enterTrucks = kb.nextInt();
			kb.nextLine();
			if (enterTrucks == 1) {
				foodTrucks = getFoodTrucks(kb);
				foodTruckFleet = convertToFleet(foodTrucks);
			} else {
				stopRun();
			}
		}

		// Loop to display data presentation menu until user chooses quit
		while (menuChoice != 4) {
			displayMenu();
			menuChoice = kb.nextInt();
			kb.nextLine();
			menuSwitch(foodTruckFleet, menuChoice);
		}

		kb.close();
	}

	// Function: Get 0-5 food trucks and add to an array then return that array.
	public FoodTruck[] getFoodTrucks(Scanner kb) {
		FoodTruck[] foodTrucks = new FoodTruck[5];
		// For loop to create the food trucks and assign to the array based
		for (int i = 0; i < 5; i++) {
			String name = "";
			String foodType = "";
			int rating = 0;
			// Invoke a food truck object to call its methods
			FoodTruck initial = new FoodTruck();
			System.out.print(
					"Please enter the name of a food truck.\nYou may enter quit to stop entering food trucks.\nYou may enter up to 5 trucks. You have entered "
							+ i + (i == 1 ? " truck " : " trucks ") + "so far.\n$> ");
			name = kb.nextLine();
			// Check if user is done entering food trucks. quit, in any case format, will
			// stop the loop. Otherwise, finish gathering information for constructor
			if ("quit".equals(name.toLowerCase())) {
				break;
			} else {
				System.out.print("Please enter the type of food served at the truck.\n$> ");
				foodType = kb.nextLine();
				// Loop to verify the rating is within range of rating system to ensure accurate
				// avg
				do {
					System.out.print("Please enter the food truck rating between 1 and 10.\n$> ");
					rating = kb.nextInt();
					kb.nextLine();
					System.out.println("\n");
				} while (rating < 1 || rating > 10);
			}
			// Call methods to set information for the food truck
			initial.setFoodTruckName(name);
			initial.setFoodTruckFood(foodType);
			initial.setFoodTruckRating(rating);
			// Instantiate a new FoodTruck and add to array. FoodTruckID is incremented then
			// assigned in constructor and had to be offset for array assignment.

			foodTrucks[initial.getFoodTruckID() - 1] = initial;
		}
		return foodTrucks;
	}
	
	//Function: To take the array of 1 to 5 objects and return an array that contains no nulls.
	public FoodTruck[] convertToFleet(FoodTruck[] foodTrucks) {
		int truckCounter = 0;
		//Get number of non null objects in the array
		for (FoodTruck foodTruck : foodTrucks) {
			if (foodTruck != null) {
				truckCounter++;
			}
		}
		//Create an array of the appropriate size
		FoodTruck[] foodTruckFleet = new FoodTruck[truckCounter];
		int fleet = 0;
		//Copy non-null objects from old array to the new
		for (int i = 0; i < 5; i++) {
			if (foodTrucks[i] == null) {
				continue;
			} else {
				foodTruckFleet[fleet] = foodTrucks[i];
				fleet++;
			}
		}
		return foodTruckFleet;
	}
	
	//Function: Display information presentation and quit menu
	public void displayMenu() {

		System.out.println("\n\n");
		System.out
				.print("Please choose one of the following options.\n" + " 1. Display a list of all the food trucks.\n"
						+ " 2. See the average rating out of all the food trucks\n"
						+ " 3. See the currently highest rated food truck\n" + " 4. Quit the program\n$>");
	}
	
	//Function: Switch to call proper method based on menu choice.
	public void menuSwitch(FoodTruck[] foodTruckFleet, int choice) {
		switch (choice) {
		case 1:
			listFoodTrucks(foodTruckFleet);
			break;
		case 2:
			avgFoodTruckRating(foodTruckFleet);
			break;
		case 3:
			highestRatedFoodTruck(foodTruckFleet);
			break;
		case 4:
			stopRun();
			break;
		default:
			System.out.println("I am sorry, that is not a valid option, please try again.");
		}
	}
	
	//Function: Display all entered food truck information
	public void listFoodTrucks(FoodTruck[] foodTruckFleet) {
		for (FoodTruck foodTruck : foodTruckFleet) {
			System.out.println(foodTruck);
		}
	}
	
	//Function: Calculate the average rating of all entered food trucks and display it
	public void avgFoodTruckRating(FoodTruck[] foodTruckFleet) {
		double overAllAvg = 0.0;
		double runningSum = 0.0;
		
		for (FoodTruck foodTruck : foodTruckFleet) {
			runningSum = runningSum + foodTruck.getFoodTruckRating();
		}
		overAllAvg = runningSum / foodTruckFleet.length;
		System.out.printf("The average rating of all food trucks is %.2f.", overAllAvg);
	}
	
	//Function: Find the highest rated food truck(s) and display with all information
	public void highestRatedFoodTruck(FoodTruck[] foodTruckFleet) {
		double highestRated = 0.0;
		for (FoodTruck foodTruck : foodTruckFleet) {
			if (foodTruck.getFoodTruckRating() > highestRated) {
				highestRated = foodTruck.getFoodTruckRating();
			}
		}
		for (FoodTruck foodTruck : foodTruckFleet) {
			if (highestRated == foodTruck.getFoodTruckRating()) {
				System.out.println(foodTruck.toString());
			}
		}
	}
	
	//Function: Display a farewell message and exit program
	public void stopRun() {
		System.out.println("Thank you for using our Food Truck app. Have a wonderful day");
		System.exit(0);
	}
}
