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

		FoodTruck[] foodTrucks = getFoodTrucks(kb);

		FoodTruck[] foodTruckFleet = convertToFleet(foodTrucks);

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

		while (menuChoice != 4) {
			displayMenu();
			menuChoice = kb.nextInt();
			kb.nextLine();
			menuSwitch(foodTruckFleet, menuChoice);
		}

		kb.close();
	}

	public FoodTruck[] getFoodTrucks(Scanner kb) {
		FoodTruck[] foodTrucks = new FoodTruck[5];

		for (int i = 0; i < 5; i++) {
			String name = "";
			String foodType = "";
			int rating = 0;
			FoodTruck initial = new FoodTruck();
			System.out.print(
					"Please enter the name of a food truck.\nYou may enter quit to stop entering food trucks.\nYou may enter up to 5 trucks. You have entered "
							+ i + (i == 1 ? " truck " : " trucks ") + "so far.\n$> ");
			name = kb.nextLine();
			if ("quit".equals(name.toLowerCase())) {
				break;
			} else {
				System.out.print("Please enter the type of food served at the truck.\n$> ");
				foodType = kb.nextLine();
				do { System.out.print("Please enter the food truck rating between 1 and 10.\n$> ");
				rating = kb.nextInt();
				kb.nextLine();
				System.out.println("\n");
				} while (rating < 1 || rating > 10);
			}
			initial.setFoodTruckName(name);
			initial.setFoodTruckFood(foodType);
			initial.setFoodTruckRating(rating);
			foodTrucks[initial.getFoodTruckID() - 1] = initial;
		}
		return foodTrucks;
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
		return foodTruckFleet;
	}

	public void displayMenu() {

		System.out.println("\n\n");
		System.out
				.print("Please choose one of the following options.\n" + " 1. Display a list of all the food trucks.\n"
						+ " 2. See the average rating out of all the food trucks\n"
						+ " 3. See the currently highest rated food truck\n" + " 4. Quit the program\n$>");
	}

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
			break;
		}
	}

	public void listFoodTrucks(FoodTruck[] foodTruckFleet) {
		for (FoodTruck foodTruck : foodTruckFleet) {
			System.out.println(foodTruck);
		}
	}

	public void avgFoodTruckRating(FoodTruck[] foodTruckFleet) {
		double overAllAvg = 0.0;
		double runningSum = 0.0;

		for (FoodTruck foodTruck : foodTruckFleet) {
			runningSum = runningSum + foodTruck.getFoodTruckRating();
		}
		overAllAvg = runningSum / foodTruckFleet.length;
		System.out.printf("The average rating of all food trucks is %.2f.", overAllAvg);
	}

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

	public void stopRun() {
		System.out.println("Thank you for using our FoodTruck app. Have a wonderful day");
		System.exit(0);
	}
}
