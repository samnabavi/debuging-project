package debugproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("\n**************************************\n");
		System.out.println("\tWelcome to TheDesk \n");
		System.out.println("**************************************");
		optionsSelection();

	}

	private static void optionsSelection() {
		String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };
		ArrayList<Integer> expenses = new ArrayList<Integer>();
		expenses.add(1000);
		expenses.add(2300);
		expenses.add(45000);
		expenses.add(32000);
		expenses.add(110);
		System.out.println(expenses);
		while (true) {

	        for(int i=0; i<6;i++){
	            System.out.println(arr[i]);
	        }
			
			
			System.out.println("\nEnter your choice:\t");
			Scanner sc = new Scanner(System.in);
			int options = -1;
			try { 
			options = sc.nextInt();
			} catch( Exception e) {
				System.out.println("Oops... try again!");
			}
			switch (options) {
			case 1:
				System.out.println("Your saved expenses are listed below: \n");
				System.out.println(expenses + "\n");
				continue;
				
			case 2:
				System.out.println("Enter the value to add your Expense: \n");
				int value = -1;
				try {
					value = sc.nextInt();
				} catch( Exception e ) {
					
				}
				expenses.add(value);
				System.out.println("Your value is updated\n");
				System.out.println(expenses + "\n");
				continue;
				
			case 3:
				System.out.println(
						"You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
				int con_choice = -1;
				try {
					con_choice = sc.nextInt();
				} catch( Exception e) {
					
				}
				if (con_choice == 3) {
					expenses.clear();
					System.out.println(expenses + "\n");
					System.out.println("All your expenses are erased!\n");
				} else {
					System.out.println("Oops... try again!");
				}
				continue;
				
			case 4:
				sortExpenses(expenses);
				System.out.println(expenses + "\n");
				
				continue;
			case 5:
				searchExpenses(expenses);
				continue;
				
			case 6:
				closeApp();
				return;
				
			default:
				System.out.println("You have made an invalid choice!");
				continue;
				
			}

		}
	}

	private static void closeApp() {
		System.out.println("Closing your application... \nThank you!");
	}

	private static void searchExpenses(ArrayList<Integer> arrayList) {
		System.out.println("Enter the expense you need to search:\t");
		int expense = -1;
		Scanner scan = new Scanner(System.in);
		try {
			expense = scan.nextInt();
		} catch(Exception e) {
			System.out.println("Oops... try again! \n");
			scan.close();
			return;
		}
		
		if(arrayList.contains(expense)) {
			System.out.println("Your expense exist in the list!\n");
		} else {
			System.out.println("Your expense doesn't exist in the list\n");
		}
		System.out.println(arrayList + "\n");
		scan.close();
		
	}

	private static void sortExpenses(ArrayList<Integer> arrayList) {
		Collections.sort(arrayList);
		
		
	}
}
