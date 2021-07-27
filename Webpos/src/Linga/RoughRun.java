package Linga;

import java.util.Arrays;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;

public class RoughRun {
	
	  
	    public static void main(String[] args)
	    {
	  
	        // Creating a list of Integers
	        java.util.List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
	  
	        // Using Stream filter(Predicate predicate)
	        // to get a stream consisting of the
	        // elements that are divisible by 5
	        list.stream().filter(data -> data % 5 == 0).forEach(System.out::println);
	        run();
	    }

		private static void run() {
			String[][] list1 = {{"a","b","c"}, {"A", "B", "C"}, {"1", "2", "3"}};
	        for (int i = 0; i < list1.length; i++) {
	            for (String[] lista : list1) {
	                System.out.print(lista[i]);
	            }
	            System.out.println();
	        }			
		}
	}

