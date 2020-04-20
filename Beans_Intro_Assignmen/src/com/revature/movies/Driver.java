package com.revature.movies;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String movieTitle;
		Float movieRating;
		int movieYear;
		String movieGenre;
		String anime = "anime";
		String horror = "horror";
		
		System.out.println("Hi, welcome to the auto movie rater where we rate the movies for you.");
		System.out.println("All you do is give the name of the movie and the year it was released and we'll generate the score for you!");
		System.out.println("Let's get started! What is the name of the movie you want the rating to?");
		Scanner input = new Scanner(System.in);
		movieTitle = input.nextLine();
		if(movieTitle.length() >20) {
			System.out.println("Wow that's a lengthy title, this might affect the rating.");
		}else {
			System.out.println("Cool, seems like a legit movie, this could affect your rating!");
		}
		System.out.println("And the year it was released?");
		movieYear = input.nextInt();
		switch(movieYear) {
		case(1992):
			System.out.println("Hey that was the year I was born!");
			break;
		case(2000):
			System.out.println("Taking over fromt the '99 to 2000s");
			break;
		case(2010):
			System.out.println("Ah the year I finished college. You must be one of those millenial kids");
			break;
		case(2015):
			System.out.println("2015 was a lit year!");
			break;
		default:
			System.out.println("Cool year I guess.");
			break;
		}
		System.out.println("Also I forgot to ask, what genre is it?\n");
		System.out.println("ALSO I wasn't well thought out, so you can only pick from two genres.\n");
		System.out.println("ANIME or HORROR?");
		movieGenre = input.next();
		System.out.println("OH! Last thing I promise. Pick a number 1-10");
		int counter = 1;
		int num1 = input.nextInt();
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int [] numberArray = new int[4];
		do {
			System.out.println("Another? And if not just say \"no\" or \"n\"!");
			if(input.nextLine().equals("no") || input.nextLine().equals("n")){
				break;
			}else if(input.nextInt() <10){
			numberArray[counter] = input.nextInt();
			counter ++;
			}
		}while(counter != 2);
		if(movieGenre.toLowerCase().equals(anime)) {
			for(int i = 0; i< numberArray.length; i++) {
				
				num2 = numberArray[1];
				num3 = numberArray[2];
				num4 = numberArray[3];
			}
			
			movieRating = (float) configureRating(num1, num2, num3, num4);
			
			Anime animeMovie = new Anime(movieTitle, movieRating, movieYear);
			System.out.println(animeMovie);
			
		}else if(movieGenre.toLowerCase().equals(horror)) {
			
			movieRating = (float) configureRating(num1, num2, num3, num4);
			Horror horrorMovie = new Horror(movieTitle, movieRating, movieYear);
			System.out.println(horrorMovie);
			
		}
		
		
		
		
	}
	
	public static int configureRating(int a) {
		int number = 0;
		for(int i = a; i< 11; i++) {
			number += i;
		}
		return number/a;
		
	}
	public static int configureRating(int a, int b) {
		return (a/b);
		
	}
	public static int configureRating(int a, int b, int c) {
		return (a+b) - c;
	
	}
	public static int configureRating(int a, int b, int c, int d) {
		return (a - b) + (c-d);
		
	}

}
