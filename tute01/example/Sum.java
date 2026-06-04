package example;

import java.util.Scanner;
import java.util.ArrayList;

// Inside a new file called Sum.java, write a program that uses the Scanner class which reads in a line of numbers separated by spaces, and sums them.
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (String word : words) {
            nums.add(Integer.parseInt(word));
        }
        
        int total = 0;
        for (Integer num : nums) {
            total += num;
        }
        System.out.println(total);
        scanner.close();
    }
}
