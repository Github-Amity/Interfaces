interface Maths {
    double PI = 3.14;
    double calculate(int x, int y);
}

// 1️⃣ FIRST
// 🔴 Create a class that implements the interface Maths (examples for class name: Add, Subtract)
// 🔴 The class should implement the calculate function given in the interface and return a result (eg: x+y)
// ⬇️------------Write your code below (approx. 3 lines of code)-----------⬇️



// ⬆️--------------------------------END HERE------------------------------⬆️
class Add implements Maths {

    public double calculate(int x, int y) {
        return x+y;
    }
    
}

public class Calc {
    public static void main(String[] args) {

        // 2️⃣ SECOND
        // 🔴 Create an instance of the class you created earlier
        // 🔴 Print the result by calling the calculate function
        // 🔴 Print the attribute PI (remember that all attributes in an interface are static)
        // ⬇️------------Write your code below (approx. 3 lines of code)-----------⬇️



        // ⬆️--------------------------------END HERE------------------------------⬆️
        Add add = new Add();
        System.out.println(add.calculate(1,6));
        System.out.println(Add.PI);
    }
}