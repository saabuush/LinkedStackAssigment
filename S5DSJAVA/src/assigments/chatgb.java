package assigments;

import exmplesChap10.ArrayStack;

public class chatgb {

        private final int midterms;
        private final int finalExam;

        // Constructor
        public chatgb(int midterms, int finalExam) {
            this.midterms = midterms;
            this.finalExam = finalExam;
        }

        // Method to calculate total results
        public int TotalResults() {
            return midterms + finalExam;
        }

        // Override toString method for better readability if needed
        @Override
        public String toString() {
            return "Exam_Result{" +
                    "midterms=" + midterms +
                    ", finalExam=" + finalExam +
                    ", TotalResults=" + TotalResults() +
                    '}';
        }

        public static void main(String[] args) {
            // Create an ArrayStack for Exam_Result objects
            ArrayStack<Exam_Result<Integer>> Marks = new ArrayStack<>(2);

            // Create Exam_Result objects for two students
            Exam_Result<Integer> student1 = new Exam_Result<>(35, 55);
            Exam_Result <Integer>student2 = new Exam_Result<>(30, 45);

            // Push Exam_Result objects onto the stack
            Marks.push(student1);
            Marks.push(student2);

            // Pop and display each student's total results
            while (!Marks.IsEmpty()) {
                Exam_Result<Integer> student = Marks.pop();
                System.out.println("Student Total Results: " + student.TotalResults());
            }
        }
    }









