package java8.streams;

import java.util.Arrays;
import java.util.List;

public class Dish {

  private final	String name;
  private final	Integer calories;
  private final	boolean isVeg;
  private  final TYPE type;

  
  Dish( String name ,  Integer calories ,  boolean isVeg, TYPE type ){
	  
	  this.name = name;
	  this.calories =calories;
	  this.isVeg = isVeg;
	  this.type =type;
  }
  
  
  public String getName() {
	return name;
}
public Integer getCalories() {
	return calories;
}
public boolean isVeg() {
	return isVeg;
}
public TYPE getType() {
	return type;
}

public enum TYPE{
	FISH , VEG , NonVeg
}  

public static List<Dish> listOfDish = Arrays.asList( new Dish("fish curry", 100, true, TYPE.FISH) ,
		new Dish("palak paneer",400, true, TYPE.VEG),
		new Dish("Chicken",100, false, TYPE.VEG),
		new Dish("Chicken Goat",100, false, TYPE.NonVeg)
		);


@Override
	public String toString() {
	
	return this.name + " "+ this.calories + " " +this.isVeg + " " + this.type;
	}
	
}
