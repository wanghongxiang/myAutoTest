package myautotest.test;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HelloWorld {
	
	/*
	 * Guava   是谷歌创建的一个很流行的库。它提供了multimaps和multisets等额外的容器类
	 * Apache Commons Collections库也提供了类似的功能
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dish> menu = new ArrayList<Dish>();
		List<Dish> lowCaloricDishes = new ArrayList<Dish>();
		for(Dish d: menu){
		    if(d.getCalories() < 400 && d.getCalories() > 100){
		        lowCaloricDishes.add(d);
		    }
		}
		Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
		    public int compare(Dish d1, Dish d2){
		        return Integer.compare(d1.getCalories(), d2.getCalories());
		    }
		});
		List<String> lowCaloricDishesName = new ArrayList<String>();
		for(Dish d: lowCaloricDishes){
		    lowCaloricDishesName.add(d.getName());
		}
		
		
		List<String> lowCaloricDishesName1 =
	               menu.parallelStream()
	                   .filter(d -> d.getCalories() < 400 && d.getCalories() > 100)
	                   .sorted(comparing(Dish::getCalories))
	                   .map(Dish::getName)
	                   .collect(toList());
		
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		numbers.stream()
		       .filter(i -> i % 2 == 0)
		       .distinct()
		       .limit(3)
		       .forEach(System.out::println);
		List<String> words = Arrays.asList("Hello","World");
		words.stream()
	     .map(word -> word.split("")) //将每个单词转换为由其字母构成的数组
	     .map(Arrays::stream)    // 让每个数组变成一个单独的流  Arrays.stream()的方法可以接受一个数组并产生一个流
	     .distinct()
	     .collect(toList());
		
		words.stream()
	     .map(word -> word.split("")) //将每个单词转换为由其字母构成的数组
	     .flatMap(Arrays::stream)    // 将各个生成流扁平化为单个流
	     .distinct()
	     .collect(toList());
		
//		没看懂
		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(3, 4);
		List<int[]> pairs =
		    numbers1.stream()
		            .flatMap(i -> numbers2.stream().map(j -> new int[]{i, j}))
		            .collect(toList());
	}
}
class Dish{
	private int calories;
	private String name;
	
	public void setCalories(int calories) {
		this.calories = calories;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public String getName() {
		return name;
	}
	
}