public class Main {
    public int myFunction(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Main obj = new Main();
        int sum = obj.myFunction(10,15);
        System.out.println(sum);
    }
}



// class MyClass {
//     // Method with one parameter
//     public void greet(String name) {
//         System.out.println("Hello, " + name);
//     }

//     // Method with multiple parameters
//     public int add(int a, int b) {
//         return a + b;
//     }

//     // Method with different types of parameters
//     public void printDetails(String name, int age) {
//         System.out.println(name + " is " + age + " years old.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Create an instance of MyClass
//         MyClass myClassInstance = new MyClass();

//         // Call methods with parameters
//         myClassInstance.greet("Alice"); // Output: Hello, Alice

//         int sum = myClassInstance.add(5, 7);
//         System.out.println("Sum: " + sum); // Output: Sum: 12

//         myClassInstance.printDetails("Bob", 30); // Output: Bob is 30 years old.
//     }
// }
