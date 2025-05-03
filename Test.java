/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joes
 */public  class Test{
    public static void main(String[] args) {
        // Create an instance of Unsorted with an initial capacity
        SortedArray t1 = new SortedArray(1000);

        for (int i = 0; i < 999; i++) {
            t1.insert((int) (Math.random() * 100000));
        }


        // Start measuring time before insertion
        long startTime = System.nanoTime();

       t1.remove((int) (Math.random() * 100000));



        // Stop measuring time after insertion
        long endTime = System.nanoTime();

        // Calculate and print the elapsed time
        System.out.println("Time taken to insert 10,000 elements: " + (endTime - startTime) + " ns");
    }

}