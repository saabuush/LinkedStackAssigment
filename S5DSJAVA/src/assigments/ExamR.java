package assigments;

import exmplesChap10.ArrayStack;

import java.util.Arrays;

public class ExamR {

        private final ArrayStack<Integer> midterm;
        private final ArrayStack<Integer> final_Exam;

        // Constructor to initialize stacks
        public ExamR(ArrayStack<Integer> midterm, ArrayStack<Integer> final_Exam) {
            // Ensure the stacks are of the same size
            if (midterm.Size() != final_Exam.Size()) {
                throw new IllegalArgumentException("Stacks must have the same capacity.");
            }
            this.midterm = midterm;
            this.final_Exam = final_Exam;
        }

        // Method to calculate total results
        public int[] TotalResults() {
            int[] Total = new int[midterm.Size()];

            for (int i = 0; i < Total.length; i++) {
                // Pop the top elements from each stack and add them
                Total[i] = midterm.pop() + final_Exam.pop();
            }
            return Total;
        }

        public static void main(String[] args) {
            // Create two stacks for midterm and final exam results
            ArrayStack<Integer> midterm = new ArrayStack<>(2);
            ArrayStack<Integer> final_Exam = new ArrayStack<>(2);

            // Push midterm and final exam marks
            midterm.push(30);
            midterm.push(34);
            final_Exam.push(50);
            final_Exam.push(45);

            // Create an Exam_Result object and calculate the totals
            ExamR result = new ExamR(midterm, final_Exam);
            int[] totals = result.TotalResults();


            // Display the total marks
            System.out.println("Total Marks: " + Arrays.toString(totals));
        }

}
