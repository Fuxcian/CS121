package week9.staticPractice;

public class MathDemo {
    public static void main(String[] args){
        System.out.println(Math.max(89,71));
        System.out.println(Math.max(89,71));
        System.out.println(Math.abs(-20));
        System.out.println(Math.round(3.578924));

        /* When to use static fields (variables):
         * The value of the variable is independent of objects (instances).
         * The value is supposed to be shared across all objects (instances).
         */
        /* When to use static methods:
         * To access or modify static variable or other static methods that don't depend on objects.
         * Used in utility and helper classes (for example, Math, Date utility classes)
         */
    }
}
