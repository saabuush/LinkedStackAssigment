package assigments;

import exmplesChap10.ArrayStack;

public class Exam_Result<T> {

    private final int midterms;
    private final int finalExam;

    public Exam_Result(int midterms, int finalExam){
        this.midterms = midterms;
        this.finalExam = finalExam;
    }
    public int TotalResults(){
        return midterms+finalExam;
    }

    public static void main(String[] args) {
        ArrayStack<Exam_Result<Integer>>Marks=new ArrayStack<>(2);
        Exam_Result<Integer>student1= new Exam_Result<>(32, 55);
        Exam_Result<Integer>student2= new Exam_Result<>(36, 45);
        Marks.push(student1);
        Marks.push(student2);

        System.out.println("student1 marks : "+student1.TotalResults());
        System.out.println("student2 marks : "+student2.TotalResults());


//        while (!Marks.IsEmpty()) {
//            Exam_Result<Integer>students = Marks.pop();
//            System.out.println("student marks: " +students.TotalResults() );
//        }




    }



}
