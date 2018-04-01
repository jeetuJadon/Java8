package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<Apple> appleList=	Arrays.asList(new Apple("red", 80),new Apple("blue", 70),new Apple("green",80) ,new Apple("blue", 70));

	Predicate<Apple> appleColourPredicate =  apple -> apple.getColor().equals("red");
	Predicate<Apple> appleWeightPredicate =  apple1 -> apple1.getWeight() > 70;
	
	List appleListColor =  filterColours(appleList , appleColourPredicate);
	 appleListColor.forEach(System.out :: println);
	
	 List appleListWeight  =  filterColours(appleList , appleWeightPredicate);
	 appleListWeight.forEach(System.out :: println);
	
	
	}
	
	
	
	private static List filterColours(List<Apple> appleList, Predicate<Apple> p) {
		
 List<Apple> lstApple	= appleList.stream().filter( e -> p.test(e)).collect(Collectors.toList());
		
 return lstApple;
	}
	
	
	
	
	public static class Apple{
		
		private String color;
	    public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}


		public int getWeight() {
			return weight;
		}


		public void setWeight(int weight) {
			this.weight = weight;
		}


		private int weight;
	    
	    
	    Apple(String color, int weight){
	    	this.color = color;
	    	this.weight = weight;
	    }	    
	    
	    @Override
	    public String toString() {
	    	
	    return	this.color+ this.weight ;
	    }
	  
	    
	  }

}
