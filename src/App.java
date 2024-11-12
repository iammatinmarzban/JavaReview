
//     public static void main(String[] args) {
//         try (Scanner input = new Scanner(System.in)) {
//             System.out.println("Enter a number:  ");
//             int number = input.nextInt();
//             int multiplication = 2;
//             int[] list = new int[number - 1];
//             int j = 0;
//             // System.out.println("The number you provided: " + number);
//             for (int i = number; i > 2; i--) {
//                 multiplication *= i;
//                 list[j] = i;
//                 // System.out.print(list[j] + " ,");
//                 j++;
//             }
//             System.out.println(multiplication);
//             // System.out.println(list);
//         }
//     }
// }
// public class App {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = scanner.nextInt();
//         long factorial = calculateFactorial(num);
//         System.out.println("The factorial of " + num + " is " + factorial);
//     }
//     private static long calculateFactorial(int num) {
//         if (num == 0) {
//             System.out.println("if Number:" + num);
//             return 1;
//         } else {
//             System.out.println("Number: " + num);
//             return num * calculateFactorial(num - 1);
//         }
//     }
// }
// public class App {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = scanner.nextInt();
//         int sub = num;
//         int isPolindrome = 0;
//         int count = 0;
//         while (sub != 0) {
//             sub /= 10;
//             count++;
//         }
//         System.out.println(count);
//         // System.out.println(num);
//         int[] number_ray = new int[count];
//         for (int i = count - 1; i >= 0; i--) {
//             number_ray[i] = num % 10;
//             num /= 10;
//         }
//         System.out.println(Arrays.toString(number_ray));
//         System.out.println(number_ray.length);
//         if (count % 2 == 0) {
//             System.out.println(
//                     "Not a number we are looking for"
//             );
//         } else {
//             for (int i = 1; i <= count / 2; i++) {
//                 int middle = (count - 1) / 2;
//                 if (number_ray[middle - i] != number_ray[middle + i]) {
//                     isPolindrome = 0;
//                     break;
//                 } else {
//                     isPolindrome = 1;
//                 }
//             }
//             if (isPolindrome == 1) {
//                 System.out.println("correct"); 
//             }else {
//                 System.out.println("wrong");
//             }
//         }
//     }
// }
// public class App {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a numnber: ");
//         int input = scanner.nextInt();
//         int sum = 1, first = 0, second = 1;
//         while (input >= sum) {
//             first = second;
//             second = sum;
//             sum = first + second;
//             System.out.println(
//                     "First= " + first + " Second= " + second
//             );
//         }
//         System.out.println(
//                 "First= " + first + " Second= " + second
//         );
//     }
// }
// Bubble sort fucker hihi!!
// public class App {
//     public static void main(String[] args) {
//         int[] numbers = {4, 8, 9, 7, 2, 6, 1, 23,};
//         int swapped;
//         for (int j = 0; j < numbers.length - 1; j++) {
//             for (int i = 0; i < numbers.length - j - 1; i++) {
//                 if (numbers[i] > numbers[i + 1]) {
//                     swapped = numbers[i + 1];
//                     numbers[i + 1] = numbers[i];
//                     numbers[i] = swapped;
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(numbers));
//     }
// }
// public class App {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         Student[] studentsArr = new Student[1];
//         for (int i = 0; i < studentsArr.length; i++) {
//             studentsArr[i] = new Student();
//             studentsArr[i] = new Student(i + 1);
//             for (int j = 0; j <= 2; j++) {
//                 System.out.println("Enter the grade:");
//                 double input = scanner.nextDouble();
//                 studentsArr[i].setGrades(input, j);
//             }
//         }
//         System.out.println(studentsArr[0].showGrades()[2]);
//         System.out.println(studentsArr[0].showId());
//         System.out.println(studentsArr[0].countAvg());
//     }
// }
// import java.util.Scanner;
public class App {

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     Object[][] books = {
    //         {"1984", "George Orwell"},
    //         {"To Kill a Mockingbird", "Harper Lee"},
    //         {"The Great Gatsby", "F. Scott Fitzgerald"},
    //         {"Pride and Prejudice", "Jane Austen"},
    //         {"Moby-Dick", "Herman Melville"}
    //     };
    //     System.out.println("Welcome to Libaray");
    //     System.out.println("Search for book name with entering 1");
    //     System.out.println("Search for book author with entering 2");
    //     String input = scanner.next();
    //     for (int i = 0; i < books.length; i++) {
    //     }
    // I want to create a guide for the author since this looks like a CLI tool ! oooh I'm excited 
}
// }
