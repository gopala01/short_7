package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        createAndPrintRelayTeam();
    }



    public static UniversalRelayTeam initialiseTeams()
    {
        UniversalRelayTeam relayTeam = new UniversalRelayTeam();

        relayTeam.country = inputString("What country is the team representing?");
        relayTeam.leg1 = inputInt("What is the disability class for leg 1? T ");
        relayTeam.leg2 = inputInt("What is the disability class for leg 2? T ");
        relayTeam.leg3 = inputInt("What is the disability class for leg 3? T ");
        relayTeam.leg4 = inputInt("What is the disability class for leg 4? T ");

        return relayTeam;
    } //Initialise and creates a team based of user input

    public static String getCountry(UniversalRelayTeam urt)
    {
        return urt.country;
    } //Accessor method returns the country field of the UniversalRelayTeam record

    public static int getLeg1(UniversalRelayTeam urt)
    {
        return urt.leg1;
    } //Accessor method returns the leg1 field of the UniversalRelayTeam record

    public static int getLeg2(UniversalRelayTeam urt)
    {
        return urt.leg2;
    } //Accessor method returns the leg2 field of the UniversalRelayTeam record

    public static int getLeg3(UniversalRelayTeam urt)
    {
        return urt.leg3;
    } //Accessor method returns the leg3 field of the UniversalRelayTeam record

    public static int getLeg4(UniversalRelayTeam urt)
    {
        return urt.leg4;
    } //Accessor method returns the leg4 field of the UniversalRelayTeam record

    public static void createAndPrintRelayTeam()
    {
        UniversalRelayTeam createRelayTeam = initialiseTeams();
        //Creates the relay team using the initialiseTeams() method

        print("The " + getCountry(createRelayTeam) + " team is: Leg 1, T" + getLeg1(createRelayTeam) + "; Leg 2, T" + getLeg2(createRelayTeam) + "; Leg 3, T" + getLeg3(createRelayTeam) + "; Leg 4, T" + getLeg4(createRelayTeam));
        //Prints the various fields of the record using the accessor methods that were created before

        checkLegality(createRelayTeam);
        //Moves to the next method

    } //Creates the relay team using the initialiseTeam() method and prints the various fields

    public static void checkLegality(UniversalRelayTeam urt)
    {
        if (getLeg1(urt) != 11 && getLeg1(urt) != 13)
        {
            print("Leg 1 (T" + getLeg1(urt) + ") is not legal.");
        }
        if (getLeg2(urt) != 61 && getLeg2(urt) != 62)
        {
            print("Leg 2 (T" + getLeg2(urt) + ") is not legal");
        }
        if (getLeg3(urt) != 35 && getLeg3(urt) != 36)
        {
            print("Leg 3 (T" + getLeg3(urt) + ") is not legal");
        }
        if (getLeg4(urt) != 51 && getLeg4(urt) != 52)
        {
            print("Leg 4 (T" + getLeg4(urt) + ") is not legal");
        }
    } //Checks whether any of the 4 legs are not legal

    public static void print(String message)
    {
        System.out.println(message);
    } //Prints a string message

    public static String inputString(String message)
    {
        Scanner scanner = new Scanner(System.in);
        String answer;

        System.out.println(message);
        answer = scanner.nextLine();

        return answer;
    } //Returns a string input

    public static int inputInt(String message)
    {
        Scanner scanner = new Scanner(System.in);
        int answer;

        System.out.println(message);
        answer = scanner.nextInt();

        return answer;
    } //Returns an integer input
}

class UniversalRelayTeam
{
    String country;
    int leg1;
    int leg2;
    int leg3;
    int leg4;
} //Creates a new record called UniversalRelayTeam with fields country, leg1, leg2, leg3, leg4
