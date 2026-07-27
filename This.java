class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;   // instance variable = parameter
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s = new Student("Anu", 20);
        s.display();
    }
}