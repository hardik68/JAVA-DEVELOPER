class Student{
    // they are instant variables because they belong to a class not to a method 
    int rollNo;
    String name;
    int marks;
}

public class ForEachLoop {
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
   
    // for(int i =0;i<students.length;i++){
    // System.out.println(students[i].name + " : " + students[i].marks);
    // }
    for(Student stud: students)
    {
        System.out.println(stud.name +":"+stud.marks);
    }
//     int nums[]=new int[4];
// 		nums[0]=4;
// 		nums[1]=8;
// 		nums[2]=3;
// 		nums[3]=9;
		
// //		for (int i=0;i<nums/length;i++)
// //		{
// //			System.out.println(nums[i]);
// //		}
		
// 		for(int n: nums)
// 		{
// 			System.out.println(n);
// 		}
    }
    
}
