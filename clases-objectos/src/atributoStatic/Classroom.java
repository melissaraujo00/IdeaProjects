package atributoStatic;

public class Classroom {
    private String studentName;
    private static String scholName = "Escula Tecnica N 1";

    public Classroom(String studentName) {
        this.studentName = studentName;
    }

    public void showInfo(){
        System.out.println("Alumno: "+ studentName + "Escula: "+ scholName);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static String getScholName() {
        return scholName;
    }

    public static void setScholName(String scholName) {
        Classroom.scholName = scholName;
    }
}
