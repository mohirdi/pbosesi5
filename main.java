public class Main {
    public static void main(String[] args) {
       
        Student student = new Student("Moh Irdi Alfarizi", "Sukabumi");
        student.addCourseGrade("Machine Learning", 85);
        student.addCourseGrade("Pemrograman Berbasis Flatform", 87);
        student.addCourseGrade("Internet Of Things", 93);

        Dosen Dosen = new Dosen("BPK.Alun Sujjada,S.Kom,MT", "Sukabumi");
        Dosen.addCourse("Pemrograman Berbasis Flatform");

        // Output informasi tentang student dan Dosen
        System.out.println(student);
        System.out.println("Nilai Rata-Rata: " + student.getAverageGrade());
        System.out.println("=============================");
        System.out.println("MATAKULIAH:");
        student.printGrades();

        System.out.println(Dosen);
        System.out.println("DOSEN PENGAMPU MATAKULIAH:");
        for (int i = 0; i < Dosen.getNumCourses(); i++) {
            System.out.println(Dosen.getCourses()[i]);
        }
    }
}
