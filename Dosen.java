
import java.util.Arrays;
public class Dosen extends Person {
    private int numCourses;
    private final String[] courses;

    public Dosen(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[10]; 
    }


    public boolean addCourse(String course) {
       
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false; 
            }
        }

        courses[numCourses] = course;
        numCourses++;
        return true;
    }


    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                numCourses--;
                courses[numCourses] = null;
                return true;
            }
        }
        return false;
    }

    public String[] getCourses() {
        return Arrays.copyOf(courses, numCourses);
    }
    public int getNumCourses() {
        return numCourses;
    }
}