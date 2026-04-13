public class basic {
    public static void main(String[] args) {
        Student s1 = new Student(); //call the default constructor

        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.marks);

        Student s2 = new Student("Piku", 65, 67); //call the parameterized constructor
        System.out.println(s2.name + " " + s2.rollno + " " + s2.marks);
    }
}

class Student{
    String name;
    int rollno;
    int marks; 

    //default constuctor
    Student(){
        this.name = "Rahi";
        this.rollno = 12;       
        this.marks = 88;
    }
    
    //parameterized constructor
    Student(String name, int rno, int mark){
        this.name = name;
        this.rollno = rno;
        this.marks = mark;
    }
}