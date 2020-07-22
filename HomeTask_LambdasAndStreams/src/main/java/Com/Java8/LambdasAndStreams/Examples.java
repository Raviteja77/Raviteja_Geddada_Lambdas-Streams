package Com.Java8.LambdasAndStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Examples {
	
	public int averageOfListOfIntegers(List<Integer> lst)
	{
		
		return lst.stream().reduce(0, Integer::sum) / lst.size();
	}
	
	public List<String> search(List<String> lst1)
	{
		return lst1
				.stream()
				.filter(s -> s.startsWith("a") && s.length() == 3)
				.collect(Collectors.toList());
	}
	
	public List<String> listOfPalindromes(List<String> lst)
	{
		return lst.
				stream()
				.filter(s -> s.substring(0, s.length() / 2).toLowerCase().equals(new StringBuffer(s).reverse().toString().substring(0, s.length()/2).toLowerCase()))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) 
	{
		Examples object = new Examples();
		List<Integer> array = Arrays.asList(1,2,3,4,5);
		System.out.println(object.averageOfListOfIntegers(array));
		String[] array1 = {"ant", "and", "hello"};
		List<String> lst = Arrays.asList(array1);
		System.out.println(object.search(lst));
		List<String> array2 = Arrays.asList("Madam", "LevEl", "ciVic", "lambda");
		System.out.println(object.listOfPalindromes(array2));
	}

}
