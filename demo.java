//Printing Hello world

class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int num1 = 5;
        int num2 = 10;
        int results = num1 + num2;

        if(num1 == num2) {
            System.out.println("No You can't them together unless they have diffferent integer values");
        } 
        else if(num1 < num2) {
            System.out.println("The sum of num1 and num2 is = " + results);
        }

        else {
            System.out.println("No condition was met");
        }
    }
}