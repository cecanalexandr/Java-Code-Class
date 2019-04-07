package com.class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		/*create a grocery list: fruits{}
		 *                       veggies{}
		 *                       dairy{}
		  Retrive all values using 2 different loops
		 */
		String [][] array= {{"fruits", "veggies", "dairy"},
				             {"bananas","orage","apple"},
				             {"onions","potatoes","carrot"},
				             {"milky","yoghurt","cream"}};
		for(int i=0;i<array.length;i++) {
			for(int b=0; b<array[i].length; b++) {
				System.out.println(array[i][b]+" ");
			}
                System.out.println();
		}
		for(String[] list:array) {
			for(String item:list) {
				System.out.println(item);
			}
		}

		}
		
	}


