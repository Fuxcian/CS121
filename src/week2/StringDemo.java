package week2;

@SuppressWarnings("ALL")
public class StringDemo {
    public static void main(String[] args) {
        String name = "John" + " " + "Doe";
        String originalName = "James";
        //.concat()--> +
        String modName = originalName.concat("Doe");
        System.out.println(modName);

        String firstName = "John";
        String lastName = "Doe";
        //String fullName = firstName + " " + lastName;
        String fullName = String.format("%s%s", firstName, lastName);

        int age = 5;
        double gpa = 3.2;
        char letterGrade = 'A';

        System.out.println(name);
        System.out.println();
        System.out.println(firstName + " " + lastName);
        System.out.println();
        System.out.println(fullName);
        System.out.println();
        //System.out.println("name: " + name + ", age: " + age + ", gpa: " + gpa + ", grade : " + letterGrade);
        String info = String.format("name: %s, age: %d, gpa: %.1f, grade: %c", name, age, gpa, letterGrade);
        System.out.println(info);
        System.out.println();
        System.out.printf("name ---: %s, age: %d, gpa: %.1f, grade: %c", name, age, gpa, letterGrade);

    }
}
