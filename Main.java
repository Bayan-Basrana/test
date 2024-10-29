import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

  /*
 1- Write a Java program that accept three numbers from the user and print the largest number .
   */
        System.out.println("Enter first number");
        int num1= input.nextInt();

        System.out.println("Enter 2nd number");
        int num2= input.nextInt();

        System.out.println("Enter 3rd number");
        int num3= input.nextInt();
        if (num1>num2 && num1>num3)
            System.out.println(" the largest is " + num1);
        else if (num2>num1 && num2>num3) {
            System.out.println(" the largest is " + num2);
        }
        else
            System.out.println(" the largest is " + num3);


 /*
2-Write a Java program that accept a String and a number from the user,
then print the character in the given index .
// */

        System.out.println(" Enter a word");
        String word = input.nextLine();
        System.out.println("Chose a number");
        int num = input.nextInt();
        System.out.println(word.charAt(num));

 /*
  3-Write a program to enter the numbers till the user wants
  and at the end it should display the sum entered .

  */
        int numbers;
        int sum=0;
        do {
            System.out.println(" enter numbers or zero to end ");
             numbers = input.nextInt();
             sum+=numbers;
        }while (numbers != 0);
        System.out.println(" The sum of numbers :" + sum);


/*
4-Write a Java program to find
positive and negative numbers of a given array:
 */
        int [] arr= {10, -21 , 30, 31, -25};
        for (int a:arr)
            if(a>0)
          System.out.println(a+ " is a positive number ");
        else
          System.out.println(a+ " is a negative  number ");
 /*
  5-Write a Java program to find a shortest word of a given array:
- Original Array:
    [“Tuwaiq”, “Bootcamp” , “Student”,”JAVA”]
  */
String [] originalArray = {"Tuwaiq","Bootcamp" ,"Student","JAVA"};
String shortest="aaaaaaaaaaaaaaaaaaaaaaaa";
for (int i = 0 ; i< originalArray.length;i++){
    if (originalArray[i].length()< shortest.length())
        shortest= originalArray[i];}
    System.out.println(shortest);
    }
}