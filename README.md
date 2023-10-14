# FoodTruckProject

# Hi 👋, I'm Jacob Stuart
### Programming student with Skill Distillery

- I’m currently working on [FoodTruckProject](https://github.com/VulcanMindForge/FoodTruckProject)

- I’m currently learning **Java**

- All of my projects are available at [https://github.com/VulcanMindForge](https://github.com/VulcanMindForge)

# Description of this project
This program will allow a user to enter up to 5 foodtrucks with information including the trucks name, type of food, and rating. The program will assign a fleet ID to each truck. The user will then have a menu that will let them display one of the following.

List all existing food trucks.
See the average rating of food trucks.
Display the highest-rated food truck.

After the requested information is displayed, the user will be brought back to the menu to choose again. The user will be able to enter quit as an option at this menu to end the program.

# How to use this project
The program will greet the user and prompt the user for a list of up to 5 food trucks. The user will input and rate a list of food trucks. The information requested will be:
Name of the food truck
Type of food made
Satisfaction Rating

After the first food truck is entered, the user will be reminded they can type quit as a truck name to finish entering food trucks. The user will then need to choose from a menu displayed to get information about the trucks they entered. After the information is displayed, the user will be brought back to the menu. If the user hits quit at this menu it will exit the program. The types of information available are:
List all food trucks.
See the average rating for all food trucks
display the highest-rated food truck.

Of note, in the first version of the program the user is prompted to enter the truck information only once, then has a looped menu to display parts of that information.


# Technologies Used
Overall I am learning and using Eclipse IDE to program in Java 1.8. Prior to this assignment we covered: Variables and Constants, Methods, Screen Output and Keyboard Input, Expressions, If/Else, Switch, While loops, For Loops, Cast Numerals, Packages, Stringbuilder, Objects, Classes, Superclasses, JUnit testing, TDD or Testing Driven Developement, UML class diagrams, Encapsulation, Inheritance in Java, Visibility, ASCII and Unicode Data.

I plan to implement as many of these systems as make sense to get a better grasp of their uses 
and best practices.

# Current Progress
Created class files.
Created stub methods.
Finished FoodTruck class.
	- foodTruckID: int
	- foodTruckName: String
	- foodTruckFood: String
	- foodTruckRating: double
	- static nextFoodTruckID: int 

	+ FoodTruck(String, String, double)
	+ getNextFoodTruckID(): int
	+ getFoodTruckName(): String
	+ setFoodTruckName(String): void 
	+ getFoodTruckFood(): String
	+ setFoodTruckFood(String): void 
	+ getFoodTruckRating(): double
	+ setFoodTruckRating(double): void 
	+ toString(): String
	+ getFoodTruckID(): int

Started coding method stubs
Have set coding to pull between 0 and 5 Foodtrucks worth of input from the user
Take the food trucks created and assign to an array
pass array to a method that returns a new array sized and filled with non null values.


# Next Steps
Create menu display method
Create menu switch method
Loop menu
Create methods to call with menu options
fix greeting
set result if no food trucks added
set result if user tries to add a 6th truck.
add farewell message

# Lessons learned or reinforced on this project
You can't adjust an array once made. You have to create a new array and transfer information over. 
You can't underline in markdown.