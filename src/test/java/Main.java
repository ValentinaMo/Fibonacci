import Coffes.CoffeMachine;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        //Comment the Execption() method to execute the other methods

        //1.	Print to console all Fibonacci numbers which are less than <100.
        Fibonacci(); //Return all Fibonacci numbers less than 100

        //2.    Simulate in code next Exceptions: NullPointerException, ClassCastException, IndexOutOfBoundsException
        Exceptions("indexOut"); //Specify the exception that you want to see

        //3.    Identify and print out the element that is repeated and located next to each other
        RepeatedElement();

        //4.    Print out name of the Country and word “Bingo” if the element (Country name) is repeated and located one after another
        //      Print out name of the Country and word “Hooray”  if the element (Country name) is repeated and located not consequently
        RepeatedElementNotConsequently();

        //5.	Find the second largest number in the list, but do not use standard sorting function.
        LargestNumber();

        //6.    Print out each element and the number of how many times it is repeated
        RepeatedNumbers();

        //7.    Please reverse this string, but without using any standard functions
        ReverseString();

        //8.    Create design for a coffee machine
        CoffeMachine coffeMachine = new CoffeMachine();
        //We have 3 types of coffees "Cappuccino, Late, Carajillo but we can create any type of coffee just building the ingredients
        //in the CoffeMachine selecting method. The method receives the size and the number of coffees we want
        coffeMachine.SelectingCoffee("Cappuccino", "small", 3);

    }



    static void Fibonacci(){
        int num1 = 0, num2 = 1, fibonnaci = 0, flag = 0;
        while (fibonnaci < 89){
            fibonnaci = num1 + num2;
            System.out.println(fibonnaci);
            num1 = num2;
            num2 = fibonnaci;
        }
    }

    static void Exceptions(String exception){
        switch (exception){
            case "nullPointer":
                int[] num = null;
                int error = num.length;
            case "castException":
                Object integer = Integer.valueOf(30);
                System.out.println((String) integer);
            case "indexOut":
                int[] number = {1, 2, 3, 4};
                int val = number[4];
        }
    }

    static void RepeatedElement(){
        String[] country = {"USA", "Australia", "Australia", "India", "France", "USA"};
        for (int i = 0; i < country.length; i++){
            if(country[i] == country[i + 1]){
                System.out.println(country[i]);
                i = country.length;
            }
        }
    }

    static void RepeatedElementNotConsequently() {
        String[] country = {"USA", "Australia", "Australia", "India", "France", "USA"};
        for (int h = 0; h < country.length; h++) {
            for (int a = 1 + h; a < country.length; a++) {
                if((country[a] == country[h])  && ((a-h) != 1)){
                    System.out.println("HOORAY! " + country[a]);
                }
            }
            if(country[h] == country[h + 1]){
                System.out.println("BINGO! " +country[h]);
                h = country.length;
            }
        }
    }

    static void LargestNumber(){
        int largestNumber;
        int[] number = {4, 8, 13, 17, 2, 1, 9};
        for(int i = 0; i < number.length; i++){
            for(int j = 1 + i; j < number.length; j++) {
                if (number[i] > number[j]) {
                    largestNumber = number[i];
                    number[i] = number[j];
                    number[j] = largestNumber;
                }
            }
        }
        System.out.println(number[number.length - 2]);
    }

    static void RepeatedNumbers(){
        String word = "abcabc123abc";
        HashSet<Character> hashset = word.chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(HashSet::new));
        for (Character character : hashset) {
            System.out.println(character + "=" + word.chars().filter(num -> num == character).count());
        }
    }

    static void ReverseString(){
        String finalWord = "";
        int cont = 0;
        String[] word = "abcabc123abc".split("");
        String[] reverseWord = new String[word.length];
        for(int i = word.length - 1; i >= 0 ;i--){
            reverseWord[cont] = word[i];
            finalWord = finalWord + reverseWord[cont];
            cont++;
        }
        PrintStream stream = new PrintStream(System.out);
        stream.print(finalWord);
    }
}