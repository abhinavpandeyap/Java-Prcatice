package tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruits;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------Fruit Basket App--------");
		System.out.println("Enter the capacity of your fruit basket");
		Scanner sc = new Scanner(System.in);
		int cap = sc.nextInt();
		Fruits[] arr = new Fruits[cap];
		int index = 0;
		int choice = 0;
		do {
			
			System.out.println("Enter suitable option :");
			System.out.println("1. Add MANGO");
			System.out.println("2. Add ORANGE");
			System.out.println("3. Add APPLE");
			System.out.println("4. Show Basket");
			System.out.println("5. Show Names of all fruits in the basket ");
			System.out.println("6. Mark fruit as stale");
			System.out.println("7. Mark all your fruits as Stale");
			System.out.println("8. Invoke Fruit specific functionality (pulp / juice / jam)");
			System.out.println("10. For ---Exit---");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				if (index < cap) {
					System.out.println("Enter the weight");
					arr[index] = new Mango("Yellow", sc.nextDouble(), "Mango");
					index++;
				} else
					System.out.println("Your Fruit basket is full");
				break;

			case 2:

				if (index < cap) {
					System.out.println("Enter the weight");
					arr[index] = new Orange("Orange", sc.nextDouble(), "Orange");
					index++;
				} else
					System.out.println("Your Fruit basket is full");

				break;

			case 3:

				if (index < cap) {
					System.out.println("Enter the weight");
					arr[index] = new Apple("Red", sc.nextDouble(), "Apple");
					index++;
				} else
					System.out.println("Your Fruit basket is full");
				break;

			case 4:
				for (Fruits f : arr) {
					if (f != null) {
						if (f.isFresh())
							System.out.println(f);
					}
				}
				break;
			case 5:
				for (Fruits f : arr) {
					if (f != null) {
						System.out.println(f.getName());
					}
				}
				System.out.println();
				break;

			case 6:
				System.out.println("Enter the number at the fruit is stale");
				int ind = sc.nextInt();
				if (ind <= index) {
					arr[ind].setFresh(false);
				} else
					System.out.println(" \n Invalid index \n");
				break;

			case 7:
				for (int i = 0; i < index; i++) {
					if ((arr[i].taste()).equals("sour")) {
						arr[i].setFresh(false);
					}
				}
				break;

			case 8:

				System.out.println("Enter the index at fruit for which you want special functionality");
				int n = sc.nextInt();
				if (n <= index) {
					if (arr[n] instanceof Mango) {
						((Mango)arr[n]).pulp();
					}
					else if(arr[n] instanceof Orange) {
						((Orange)arr[n]).juice();	
					}
					else if(arr[n] instanceof Apple) {
						((Apple)arr[n]).jam();			
					}
				}
				else
					System.out.println("Invalid index");
			}
		} while (choice != 10);
	sc.close();
	}
}


