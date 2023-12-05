import java.time.LocalDate;


import controller.StudentController;
import controller.TeacherController;


public class Main {
    public static void main(String[] args) {
            // StudentController controller = new StudentController();
            // controller.create("qwe", "qwe", "qwe", LocalDate.of(2005, 8, 30));
            // controller.create("qwer", "qwer", "qwer", LocalDate.of(2004, 7, 29));
            // controller.create("qwety", "qwety", "qwety", LocalDate.of(2006, 6, 28));
            // controller.create("qweui", "qweui", "qweui", LocalDate.of(2005, 3, 20));
            // controller.getSortedListByFIOStudentFromStudentGroup();
            TeacherController controller2 = new TeacherController();
            controller2.create("qwe", "qwe", "qwe", LocalDate.of(1988, 8, 30));
            controller2.create("qwer", "qwer", "qwer", LocalDate.of(1975, 7, 29));
            controller2.create("qwety", "qwety", "qwety", LocalDate.of(2000, 6, 28));
            controller2.create("qweui", "qweui", "qweui", LocalDate.of(1999, 3, 20));
            
        }
    }
