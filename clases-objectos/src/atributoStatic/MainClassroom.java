package atributoStatic;

public class MainClassroom {
    static void main(String[] args) {
        Classroom student1 = new Classroom("Maria");
        Classroom student2 = new Classroom("Juan");

        student1.showInfo();
        student2.showInfo();

        Classroom.setScholName("Escuela 2");

        student1.showInfo();
        student2.showInfo();
    }
}
