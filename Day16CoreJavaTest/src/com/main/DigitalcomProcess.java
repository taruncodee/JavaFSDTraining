package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitalcomProcess {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		List<User> users = new ArrayList<>();
		GameService gs = new GameService();

		int i = 0;
		while (true) {
			System.out.println("Welcome to our Game Store : ");
			System.out.print("1. Register User\n2. View Games\n3. Search By Name\n4. Exit\n\nEnter your choice : ");
			i = scan.nextInt();
			if (i == 4) {
				System.out.println("Exiting...Bye");
				break;
			}
			String userId = "", password = "";
			long count = 0;
			switch (i) {
			case 1:
				System.out.println("Enter userid : ");
				userId = scan.next();
				System.out.println("Enter password : ");
				password = scan.next();
				User u = new User();
				u.addUser(userId, password);
				users.add(u);
				System.out.println("User Created Successfully");
				break;
			case 2:
				System.out.println("You need to be authenticated first : ");
				System.out.println("Enter userid : ");
				userId = scan.next();
				System.out.println("Enter password : ");
				password = scan.next(); {
				final String u1 = userId, p = password;
				count = users.stream().filter(x -> x.isAuthenticated(u1, p)).count();
			}
				if (count == 0)
					System.out.println("You are not authorized to perform this task.");
				else {
					System.out.println(gs.viewAll());
				}
				break;
			case 3:
				System.out.println("You need to be authenticated first : ");
				System.out.println("Enter userid : ");
				userId = scan.next();
				System.out.println("Enter password : ");
				password = scan.next(); {
				final String u1 = userId, p = password;
				count = users.stream().filter(x -> x.isAuthenticated(u1, p)).count();
			}
				if (count == 0)
					System.out.println("You are not authorized to perform this task.");
				else {
					System.out.println("Enter author name to search : ");
					String author = scan.next();
					System.out.println(gs.authorSearch(author));
				}
				break;
			default:
				System.out.println("Invalid choice, Choose again.");
			}
		}
		scan.close();
	}
}
