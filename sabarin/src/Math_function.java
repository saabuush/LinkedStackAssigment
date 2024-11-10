public class Math_function {
    public static void main(String[] args) {
//        //trignometric function
//        System.out.println(Math.sin(0.0));
//        System.out.println(Math.cos(0.0));
//        System.out.println(Math.pow(3,4));
//
//        //expnomental function
//
//        System.out.println(Math.exp(1));
//        System.out.println(Math.log(2.71));
//        System.out.println(Math.sqrt(144));
//
//        ///round function
//
//        System.out.println(Math.floor(19.9));
//        System.out.println(Math.ceil(12.1));
//        System.out.println(Math.round(3.2));
//        System.out.println('a'+'1');
//        System.out.println('a'+1);
//

        char ch =(char)('0'+ Math.random()*('z'-'a'+1));
        System.out.println("the generated number is "+ch);
        if ('A' <= ch && ch <= 'Z') {
            System.out.println("the generated letter is uppercase");
        } else if ('a'<= ch && ch<='z') {
            System.out.println("the generated letter is lowercase");
        } else if ('0' <= ch && ch <='9') {
            System.out.println("the generated is digit ");
        }
        else {
            System.out.println("the generated number is valid number");
        }
    }

    }

