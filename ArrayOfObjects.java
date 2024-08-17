class Student {
    // they are instant variables because they belong to a class not to a method 
    int rollNo;
    String name;
    int marks;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.rollNo = 1;
    s1.name = "Rohit";
    s1.marks = 88;
    
    Student s2 = new Student();
    s2.rollNo = 2;
    s2.name = "Harsh";
    s2.marks = 67;

    Student s3 = new Student();
    s3.rollNo = 1;
    s3.name = "Kiran";
    s3.marks = 97;

    Student students[]= new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;
   
    for(int i =0;i<students.length;i++){
    System.out.println(students[i].name + " : " + students[i].marks);
    }

    //System.err.println(s1); // it will print the value of its object 

// we have three objects in array 

    }
    // public static void main(String[] args) {
    //     int num[] = new int[6];
    //     num[0]=4;
    //     num[1]=8;
    //     num[2]=3;
    //     num[3]=9;

    //     for(int i = 0;i<6;i++){
    //         System.out.print(num[i] + " ");
    //     }
    //     System.out.println();
    // }
    
}
