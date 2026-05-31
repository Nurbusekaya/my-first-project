 public class StudentInformation {
     public static void main(String[] args) {
         University uni = new University("Akdeniz Üniversitesi", 5);
         University.Student ogr = uni.new Student("Buse", 1.93, "Bilgisayar Mühendisliği");
         ogr.printInfo();
         University.Student ogr2 = uni.new Student("Ahmet", 3.37, "Makine Mühendisliği");
         ogr2.printInfo();
         University.Student ogr3 = uni.new Student("Ceyda", 2.21, "Tıp");
         ogr3.printInfo();
         University.Student ogr4 = uni.new Student("Didem", 3.10, "Diş Hekimliği");
         ogr4.printInfo();
         uni.printUniversityInfo();
     }
 }
  class University {
         private String name;
         private int studentCount;
         private int maxStudent;

         public University(String name, int maxStudent) {
             this.name = name;
             this.studentCount = 0;
             this.maxStudent = maxStudent;
         }

         public void printUniversityInfo() {
             System.out.println(name + " toplam öğrenci sayısı: " + studentCount);
         }

         public boolean addStudent() {
             if (studentCount < maxStudent) {
                 studentCount++;
                 return true;
             } else {
                 System.out.println("Kontenjan dolu!");
                 return false;
             }
         }
     }


     class Student {
         private String studentName;
         private String department;
         private double gpa;
         public boolean isHonorStudent() {
             return gpa >= 3.0;
         }

         public Student(String studentName, double gpa, String department) {
             if (addStudent()) {
                 this.studentName = studentName;
                 this.gpa = gpa;
                 this.department = department;
             }
         }

         public void printInfo() {
             if (studentName == null) {
                 return;
             }
             System.out.println(studentName + " isimli öğrenci "
                     + name + "'nde "
                     + department + " okumaktadır. GPA: " + gpa);

             if (isHonorStudent()) {
                 System.out.println("Onur Öğrencisi 🎓");
             }
         }
     }

