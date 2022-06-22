package Homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HomeworkOne {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        MyWeight();
        System.out.println("Task 2:");
        ArrayProcent();
        System.out.println("Task 3:");
        Polindrom();
        System.out.println("Task 4:");
        EvenNumber();
        System.out.println("Task 5:");
        OddNumber();
        System.out.println("Task 6:");
        EvenNumberFor();
        System.out.println("Task 7:");
        SummaNumbers();
        System.out.println("Task 8:");
        MonthName();
        System.out.println("Task 9:");
        ChangeOfVariables();
        System.out.println("Task 10:");
        ThreeVariables();
        System.out.println("Task 11:");
        VariableComparison();
        System.out.println("Task 12:");
        BooleanVariables();
        System.out.println("Task 13:");
        ConcatenateStringVariables();
        System.out.println("Task 14:");
        IncreasingVariables();
        System.out.println("Task 15:");
        UsingLoops();
        System.out.println("Task 16:");
        LineNumbers();
        System.out.println("Task 17:");
        Array();
        System.out.println("Task 18:");
        Curency();
        System.out.println("Task 19(Advanced Level):");
        TimeCounter();
    }

    /*1. Напишите программу, которая вычисляет ваш вес на Луне с учетом того,
     что сила тяжести равна 16% от силы тяжести на Земле.*/
    static void MyWeight() {

        System.out.println("Enter your weight in kg:");
        Scanner console = new Scanner(System.in);
        int weightNew = console.nextInt();
        double weightMoon = (weightNew * 0.16);
        System.out.println("Your weight on the moon: " + weightMoon + " kg");

    }

    /*2. Напишите метод, который будет увеличивать каждый элемент массива на 10%.*/
    static void ArrayProcent() {

        int[] arr = {20, 10, 30, 50, 40, 60};
        System.out.println("An array is given: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ";");
        }
        System.out.println("\nArray increased by 10%: ");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) (arr[i] + arr[i] * 0.1);
            System.out.print(arr[i] + ";");
            System.out.println();
        }
    }

    /*    3. Напишите метод, который будет проверять является ли число палиндромом
       (одинаково читающееся в обоих направлениях). */
    static void Polindrom() {
        System.out.println("Enter a number");
        Scanner console = new Scanner(System.in);
        String number = console.nextLine();
        char[] array = number.toCharArray();
        String result = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            result += array[i];
        }
        if (result.equals(number)) {
            System.out.println("Your number is a palindrome");

        } else {
            System.out.println("Your number is not a palindrome");
        }

    }

    /*4. Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)*/
    static void EvenNumber() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "; ");
            }
            System.out.println();
        }

    }

    /*5. Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления)*/
    static void OddNumber() {
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "; ");
            }
            System.out.println();
        }
    }

    /*6. Вывести на  экран все четные цифры от 1 до 100 не используя остаток от деления (используя только цикл for)*/
    static void EvenNumberFor() {
        for (int i = 2; i <= 100; i+=2) {

            System.out.print(i + "; ");
        }
        System.out.println();
    }
    /*7. Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for)*/
    static void SummaNumbers(){
        int sum = 0;
        for (int i = 20; i <= 200; i++) {
             sum+=i;
        }
        System.out.print("The result of adding numbers from 20 to 200:  " + sum);
        System.out.println();
    }

    /*8. Пройти циклом по числам от 1 до 12 и вывести название месяца, соответствующее каждому числу (используя цикл и оператор if else)*/
    static void MonthName(){
        System.out.println("Name of months:");
        for (int i=1; i<=12; i++){
            if (i==1){
                System.out.println("January");
            }else if (i==2){
                System.out.println("February");
            }else if (i==3){
                System.out.println("March");
            }else if (i==4){
                System.out.println("April");
            }else if (i==5){
                System.out.println("May");
            }else if (i==6){
                System.out.println("June");
            }else if (i==7){
                System.out.println("July");
            }else if (i==8){
                System.out.println("August");
            }else if (i==9){
                System.out.println("September");
            }else if (i==10){
                System.out.println("October");
            }else if (i==11){
                System.out.println("November");
            }else if (i==12){
                System.out.println("December");
            }

        }
    }
  /*9 Объявить 2 переменных целого типа. Необходимо поменять значения переменных так, чтобы значение первой оказалось во второй, а второй - в первой.*/
  static void  ChangeOfVariables(){
      int a = 8;
      int b = 10;
      System.out.println("Initial values of variables a = 8, b= 10");
      int c = a+b;
      a= c-a;
      b= c-b;
      System.out.println("After the changes made, the first variable a = " +a+ " , and the second variable b = " +b);


  }
  /* 10. Напишите программу с тремя переменными целого типа, первым двум присвойте значения, а третьей переменной присвойте их сумму.
  Выведете значение третей переменной на экран.   */
    static void ThreeVariables(){
        int a1 = 2;
        int b1 = 3;
        int c1 = a1 + b1;
        System.out.println("The value of the third variable: " + c1);
    }

  /*11. Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее.*/
    static void VariableComparison(){
        System.out.println("Enter a first variable:");
        Scanner console = new Scanner(System.in);
        int a2 = console.nextInt();
        System.out.println("Enter a second variable:");
         int b2 = console.nextInt();
        System.out.println("Enter a third variable:");
         int c2 = console.nextInt();
        if (a2>b2 && a2>c2){
            System.out.println("The largest variable matters - " +a2);
        }
        if (b2>a2 && b2>c2){
            System.out.println("The largest variable matters - " +b2);
        }
        if (c2>a2 && c2>b2){
            System.out.println("The largest variable matters - " +c2);
        }
        if (b2==a2 && b2==c2){
            System.out.println("Variables are equal");
        }
        if (b2==a2 && a2>c2){
            System.out.println("The largest variable matters - " +a2);
        }
        if (c2==a2 && a2>b2){
            System.out.println("The largest variable matters - " +c2);
        }
        if (b2==c2 && b2>a2){
            System.out.println("The largest variable matters - " +b2);
        }

    }
    /*12. Напишите программу, в которой используются две переменные логического типа (boolean),
    присвойте им значения и выведете для каждой переменной на экран строку "истина", если переменная имеет
    значение true и "ложь", если переменная имеет значение false.     */
    static void BooleanVariables(){
        boolean a3 = true;
        boolean b3 = false;
        System.out.println(a3);
        System.out.println(b3);

    }
    /*13. Напишите программу, где двум строковым переменным присваиваются значения, третей же строковой переменных
     присвойте объединение (конкатенацию) двух предыдущих строк. Затем напечатайте значение третьей строковой переменной.  */
    static  void ConcatenateStringVariables(){
        System.out.println("Enter a first word:");
        Scanner console = new Scanner(System.in);
        String first_word = console.nextLine();
        System.out.println("Enter a second word:");
        String second_word = console.nextLine();
        String third_word = first_word+second_word;
        System.out.println(third_word);
    }
    /*14. Создайте программу с двумя переменными целого типа, присвойте им значения, если первая переменная больше второй,
    то увеличьте её значение на 3, иначе увеличьте значение второй переменной на 8. В конце программы выведите значения обоих
     чисел на экран. */
    static void IncreasingVariables(){
        System.out.println("Enter a first variable:");
        Scanner console = new Scanner(System.in);
        int a4 = console.nextInt();
        System.out.println("Enter a second variable:");
        int b4 = console.nextInt();
        if (a4>b4){
            a4=a4+3;
            System.out.println("The first variable is incremented by 3 and has a value " +a4+ ", the value of the second variable is " +b4);
        }else if(a4==b4){
            System.out.println("Variables are equal");
        }else {
            b4=b4+8;
            System.out.println("The value of the first variable is " +a4+ ", the value of the second variable is increased by 8 and equals " +b4);
        }
    }
    /*15. Выведете на экран все числа от 1 до 100 с помощью цикла (можно все три варианта в одной программе):for, while,do while     */
  static void UsingLoops(){
      for (int i = 1; i <= 100; i++) {
          System.out.print(i + "; ");
          }
      System.out.println();
      int count = 1;
      while (count<101){
          System.out.print(count+ "; ");
          count++;
      }
      System.out.println();
      int count1=1;

      do{
          System.out.print(count1+ "; ");
          count1++;
      }while (count1<101);
      System.out.println();
      }

/*16. Вывести на экран ряд натуральных чисел от минимума до максимума с шагом. Например, если минимум 10,
максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35. Минимум, максимум и шаг указываются пользователем
(можно захардкодить). */
static void LineNumbers(){
    System.out.println("Enter the minimum natural number:");
    Scanner console = new Scanner(System.in);
    int min = console.nextInt();
    System.out.println("Enter the maximum natural number:");
    int max = console.nextInt();
    System.out.println("Enter step (natural number)");
    int step = console.nextInt();
    System.out.println("We get a series of numbers with a step " +step);
    for (int i=min; i<=max; i+=step){
        System.out.print(i+ "; ");
    }
    System.out.println();
}
/*17. Все элементы массива поделить на значение наибольшего элемента этого массива.*/
    static void Array(){
        double max=0;
        int[] arr = {20, 10, 30, 50, 40, 60};
        System.out.println("An array is given: ");
        for (int i = 0; i < arr.length; i++) {
           if (max<arr[i]){
               max = arr[i];
           }

        }
        for (int i = 0; i < arr.length; i++) {
            double result = arr[i]/max;
            System.out.print(result+ "; ");
        }
        System.out.println();
    }
    /*18. Напишите метод переводящий рубли в доллары по заданному курсу. В качестве аргументов укажите кол-во рублей и курс.*/
    static void Curency(){
        System.out.println("Enter the amount to be exchanged:");
        Scanner console = new Scanner(System.in);
        double summa = console.nextDouble();
        System.out.println("Enter exchange rate:");
        double rates = console.nextDouble();
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        System.out.println("The exchange rate amount is " +twoDForm.format(summa/rates));
    }
    /*2.Advanced Level:	Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток.*/
    static void TimeCounter(){
        System.out.println("Enter number of days:");
        Scanner console = new Scanner(System.in);
        int day = console.nextInt();
        System.out.println((day*24) + " d " + (day*24*60)+ " m " + (day*24*60*60) + " s " );

    }

}

