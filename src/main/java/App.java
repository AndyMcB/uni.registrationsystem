import records.CourseData;
import records.ModuleData;
import records.StudentData;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<StudentData> students = new ArrayList<>();
    
        StudentData s1 = new StudentData("Andrew Mc Breen", 20, "1995-12-16");
        StudentData s2 = new StudentData("Catherien Aherne", 21, "1995-06-04");
        StudentData s3 = new StudentData("Felix Delos Santos", 19, "1994-07-08");
        StudentData s4 = new StudentData("George W Bush", 20, "1995-11-24");
        StudentData s5 = new StudentData("Corniferous Kelly", 30, "1985-01-13");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        
        
        ArrayList<ModuleData> modules = new ArrayList<>();
        
        ModuleData m1 = new ModuleData("Crytography", "CS402");
        m1.addStudent(s1);
        m1.addStudent(s3);
        m1.addStudent(s5);
        
        ModuleData m2 = new ModuleData("Software Engineering", "CT417");
        m2.addStudent(s2);
        m2.addStudent(s4);
        
        ModuleData m3 = new ModuleData("Artificial Intelligence", "CT421");
        m3.addStudent(s2);
        m3.addStudent(s4);
        
        ModuleData m4 = new ModuleData("Modern Information Management", "CT422");
        m4.addStudent(s2);
        m4.addStudent(s4);
        
        ModuleData m5 = new ModuleData("Machine Learning & Data Mining", "CT475");
        m5.addStudent(s1);
        m5.addStudent(s3);
        m5.addStudent(s5);
        
        modules.add(m1);
        modules.add(m2);
        modules.add(m3);
        modules.add(m4);
        modules.add(m5);
        
        ArrayList<CourseData> courses = new ArrayList<>();
        
        CourseData c1 = new CourseData("M.Sc in Data Analytics", "2016-09-01", "2017-05-30");
        c1.addModule(m1);
        c1.addModule(m5);
        
        CourseData c2 = new CourseData("B.Sc in Computer Science", "2016-09-05", "2017-05-30");
        c2.addModule(m2);
        c2.addModule(m3);
        c2.addModule(m4);
        
        courses.add(c1);
        courses.add(c2);
        
        //A list of all the students, their assigned modules and the course they are registered for should be printed to the console

        //StudentData
        String studentString = "";
        for(StudentData s: students) {
            String temp = s.getName() + "\n Age:" + s.getAge() + "\n DOB:" + s.getDob() + "\n Username:" + s.getUserName() + "\n\n";
            studentString = studentString + temp;
        }

        //ModuleData
        String moduleString = "";
        for(ModuleData m: modules) {
            String temp = m.getFullModuleName() + "\n Students:\n" + m.getStudents().toString() + "\n\n";
            moduleString = moduleString + temp;
        }

        //CourseData
        String courseString = "";
        for(CourseData c : courses){
            String temp = c.getCourseName() + "\n Start Date:" + c.getStartDate()
                    + "\n End Date:" + c.getEndDate() + "\n Modules:" + c.getModules().toString() + "\n\n";
            courseString = courseString + temp;
        }

        System.out.println("Students: \n" + studentString);
        System.out.println("\n\nModules:\n" + moduleString);
        System.out.println("\n\nCourses: \n" + courseString );
    }
}
