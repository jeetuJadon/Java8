package java8.streams;

import java.util.stream.*;
import java.util.*;
import static java.util.Comparator.comparing;

public class StreamBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<Dish> dishlist = filterList(Dish.listOfDish);
		dishlist.forEach(System.out :: println);
		
		List<Dish> dishlist2 = filterList2(Dish.listOfDish);
		dishlist2.forEach(System.out :: println);
		
		
		
	}

public static List<Dish> filterList(List<Dish> lstFilters){
	return lstFilters.stream().filter( e -> e.getType().equals(Dish.TYPE.VEG)).sorted( (e1,e2) -> e1.getCalories().compareTo(e2.getCalories()) )
			.collect(Collectors.toList());

}
public static List<Dish> filterList2(List<Dish> lstFilters){
	return lstFilters.stream().filter( e -> e.getType().equals(Dish.TYPE.VEG)).sorted( comparing(Dish :: getCalories ) ) 
			.collect(Collectors.toList());

}


}
