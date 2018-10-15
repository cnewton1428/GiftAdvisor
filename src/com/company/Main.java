package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Gift Advisor
        ArrayList<String> Gift = new ArrayList<>();
        ArrayList<String> Gift1 = new ArrayList<>();
        ArrayList<String> Gender = new ArrayList<>();
        ArrayList<String> Price = new ArrayList<>();
        ArrayList<String> ageOlder = new ArrayList<>();
        ArrayList<String> ageYounger = new ArrayList<>();

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        String price, age, ageOld, ageYoung, gender = "";

        Gift.add("Chocolate box");
        Gift.add("Weekend getaways");
        Gift.add("Pampering Hamper");
        Gift.add("More Gift cards");
        Gift.add("Perfume/cologne");
        Gift.add("Sweater");
        Gift.add("Gift cards");
        Gift.add("Fancy kitchen utensils");
        Gift.add("Books");
        Gift.add("Boardgames");
        Gift.add("Ukulele");
        Gift.add("Snack basket");



        Gift1.add("Toys");
        Gift1.add("Storybooks");
        Gift1.add("Lunch-boxes");
        Gift1.add("Coloring Journals");
        Gift1.add("Stationary items");

        Gender.add("male");
        Gender.add("female");

        Price.add("High");
        Price.add("Medium");
        Price.add("Low");

        ageOlder.add("Adult");
        ageOlder.add("Teen");

        ageYounger.add("Child");


        do {

            System.out.println("What is the gender?");
            gender = input.nextLine();

            System.out.println("What is your price range? High? Medium? or Low?");
            price = input.nextLine();

            System.out.println("What is the age group? Adult, Teen, Child?");
            age = input.nextLine();
            int gift = rand.nextInt(Gift.size()-1);
            int gift1 = rand.nextInt(Gift1.size()-1);

            if (age.equalsIgnoreCase("Child")) {
                System.out.println("Get " + Gift1.get(gift1) + " at " + price + " price " + " for " + age + " who is also " + gender);
            } else if (!age.equalsIgnoreCase("Child")){
                System.out.println("Get " + Gift.get(gift) + " at " + price + " price " + " for " + age + " who is also " + gender);

            }
        }while (!age.equalsIgnoreCase("Done"));
    }
}

