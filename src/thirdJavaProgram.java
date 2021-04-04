import java.util.Scanner;

public class thirdJavaProgram{

    // Q1
    public static void userInputRange1()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:- ");
        int a=scanner.nextInt();
        System.out.println("Enter second number:- ");
        int b=scanner.nextInt();

        for (int i=a; i<=b && i<=a+10; i++)
        {
            System.out.println(i);
        }
    }
    // Q2


    public static void fibonacci(){
        int n=0;
        int a = 0;
        int b = 1;
        int c = 2;

        Scanner scanner = new Scanner(System.in);
        //System.out.print("fibonacci series");

        System.out.print("plz entre any number " );
        n = scanner.nextInt();

        for (int i = 1; i<=n; i++)

        {

            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }}
    //Q3


    public static void primeNumber()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:-");
        int n = scanner.nextInt();
        int temp = 0;
        for(int i = 2; i<=n-1; i++)
        {
            if(n%i==0)
            {
                temp= temp+1;
            }

        }
        if(temp==0){
            System.out.println( n + "is prime number");
        }
        else{
            System.out.println( n + "is not prime");
        }
    }


    //Q4

    public static void reverseNoUsingLoop4(){
        int num=0;
        int reversed_Num=0;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the number for find reverse: ");

        //get input and it is stored num variable
        num=scanner.nextInt();
        for( ; num!=0;){
            reversed_Num=reversed_Num*10;
            reversed_Num=reversed_Num+num%10;
            num=num/10;
        }
        System.out.print("Reversed number of given number is: "+reversed_Num);
    }
    //Q5

    public static void factorial(){
        int n=0;
        int input = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");

        n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            input = input * i;
        }
        System.out.println("fact=" + input );
    }
    //Q6


    public static void sumOfNaturalNumber6(){

        int n,sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        n = scanner.nextInt();
        for(int i=1; i<=n;i++){
            sum = sum +i;               
        }

        System.out.println("Sum=" +sum);

    }

    //Q7


    public static void calculator7() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first numbers: ");

        // nextDouble() reads the next double from the keyboard
        int first=scanner.nextInt();
        System.out.println("enter second number");
        int second=scanner.nextInt();                               // done 7

        System.out.print("Enter an operator (+, -, *, /): ");
        scanner.nextInt();     // DONE 7

        int result;
        //int operator;

        switch ('+') {             // select any one operator on one time
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.print("Error! operator is not correct");
                return;
        }

        System.out.println(first + " " + second + " = " + result);
    }

    //Q8



    public static void ranging(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter any number: ");
        scanner.nextInt();
        System.out.println("For Sum from 1 to 20 press any number");
        scanner.nextInt();
        int num = 20;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }

        System.out.println(" sum =" + sum);
    }


    //Q9


    public static void numberDivide3and5_9(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number divided by 3");
        int n = scanner.nextInt();
        for(n=1; n<100; n++)
        {
            if (n%3==0)
                System.out.print(n + ",");

        }

        System.out.println(" Number divided by 5");
        for (n=1; n<100; n++)
        {
            if (n%5==0)
                System.out.print(n + " , ");
        }
        System.out.println();
    }
    //Q10


    public static void tableOfAnyNumber10(){
        Scanner Scanner= new Scanner(System.in);
        System.out.println("Enter the table number which you want ");
        int n = Scanner.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.println(n +"x"+ i +"=" + n*i );
        }
    }
    // Q11



    public static void abc(){
        String str; //variable declaration
        int count=0;
        Scanner scan=new Scanner(System.in);
        //create a scanner object for input

        System.out.println("Enter any sentence/word count 'a' characters  ");
        str=scan.nextLine();
        //count each character without space
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== 'a'){// this condition is used to avoid counting space
                count++;
            }
        }
//display the total number of characters in te given string
        System.out.print("The total number of character in a string :"+count);
    }
    // Q12

    public static void sumOfTwoNumbers12(){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your first number in range");
        int first = sc.nextInt();
        System.out.println("enter your second number in range");
        int second = sc. nextInt();
        int sum=0;
        for (int i = first; i <=second;i++){
            if (i%9==0) {
                sum =i;
            }
            System.out.println("Total sum of range"+ first+ "to" + second+ "& divisible by 9 is =" +sum);
        }
    }

    //Q13


    public static void minAndMax13() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();//get input from user for num1
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();//get input from user for num2
        System.out.print("Enter the third number: ");
        int num3 = scan.nextInt();//get input from user for num3
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("\n The Minimum number is: " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("\n The Minimum number is: " + num2);
        } else {
            System.out.println("\n The Minimum number is: " + num3);
        }
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("\n The Maximum number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("\n The Maximum number is: " + num2);
        } else {
            System.out.println("\n The Maximum number is: " + num3);
        }
    }
    //Q14


    public static void sumAndAverage14() {
        int a, b, sum;
        float avg;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        a = scanner.nextInt();

        System.out.print("Enter second number : ");
        b = scanner.nextInt();

        /*Calculate sum and average*/
        sum = a + b;
        avg = (float)((a + b) / 2);

        System.out.print("Sum : " + sum + "\nAverage : " + avg);
    }


    //Q15

    public static void triangularPattern15() {
        {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Press any number");
            scanner.nextInt();
            for(int i=1;i<=8;i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } }
    }

    public static void main(String[] args) {

//               Ans1
//              userInputRange1();
//
//                         Ans2
//                     fibonacci();
//
//                     Ans3
//                   primeNumber();
//
//                     Ans4
//                  reverseNoUsingLoop4();
//
//                    Ans5
//                  factorial();
//
//                    Ans6
//                    sumOfNaturalNumber6();
//
//                     Ans 7
//                    calculator7();
//
//                     Ans8
//                    ranging();
//
//                     Ans 9
//                   numberDivide3and5_9();
//
//                     Ans 10
//             tableOfAnyNumber10();
//
//                      Ans 11
//                       abc();
//
//
//                    Ans 12
//                 sumOfTwoNumbers12();
//
//                      Ans 13
//                     minAndMax13();
//
//                        Ans14
//                    sumAndAverage14();
//
//                      Ans 15
//             triangularPattern15();

    }
}










