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

If the user types quit without entering any food trucks, they will be asked if they want to try again. If they do it goes back to the name prompt. If choose no it will exit the program. The user will be reminded of how many food trucks they have entered, and the fact they can type quit as a truck name to finish entering food trucks. The user will be prompted to enter a Rating again if the original rating entered is from 1 to 10. 

The user will then need to choose from a menu displayed to get information about the trucks they entered. If they enter an integer outside of the menu options the menu will display again. Once the user makes a choice, the selected information is displayed. After the information is displayed, the user will be brought back to the menu to choose again. If the user hits quit at this menu prompt it will exit the program. The types of information available are:

List all food trucks.
See the average rating for all food trucks
Display the highest-rated food truck.

Of note, in the first version of the program the user is prompted to enter the truck information only once, then has a looped menu to display parts of that information.


# Technologies Used
Overall I am learning and using Eclipse IDE to program in Java 1.8. Prior to this assignment we covered: Variables and Constants, Methods, Screen Output and Keyboard Input, Expressions, If/Else, Switch, While loops, For Loops, Cast Numerals, Packages, Stringbuilder, Objects, Classes, Superclasses, JUnit testing, TDD or Testing Driven Developement, UML class diagrams, Encapsulation, Inheritance in Java, Visibility, ASCII and Unicode Data.

This app uses the following subjects.
Java 1.8, Eclipse, Variables and constants, Methods, Screen Output and Keyboard Input, Expressions, If/else, Switch, While Loop, For loop, For each loop, Packages, Objects, Classes, UML formatted diagram of class, Ecapsulation, Visibility.

I plan to implement as many of these systems as make sense to get a better grasp of their uses 
and best practices.

# Current Progress
Created class files.
Created stub methods.
Finished FoodTruck class.
```
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
```
Created method to get array of food trucks
Created method to trim array of food trucks to only non-null objects
Creted menu to display various types of data
Created menu switch for choosing which data to display
Created method to display all trucks via toString
Created method to determine avg overall rating that uses trimmed array and returns proper average base on number of actual foodtrucks
Created stopRun method that says a farewell and exits the system.
Finished FoodTruckApp v 1



# Next Steps
Create Superclass that FoodTruck will be a child of.
This Superclass will be a region such as neighborhood or town.
Add a prompt to enter the user's city
Set up various food truck arrays by city
Add menu options to compare averages by city, find best food truck from all the cities, adjust ratings

# Lessons learned or reinforced on this project
You can't adjust an array once made. You have to create a new array and transfer information over. 
You can't underline in markdown. Comments a methods function so that you can pick up easier after sleeping. TODO task list helps. Constructors are still methods, they can accomplish more than just assigning variables. Eclipse console does not follow ASCII escape and screen clear methods. Abandoned the screen clear method since coudln't effectively test. 

# Lessons to research
How to use TDD to compare a string with the output of a void return method. ie if you have a method that displays a menu, how to use JUNIT to verify it prints properly. 

