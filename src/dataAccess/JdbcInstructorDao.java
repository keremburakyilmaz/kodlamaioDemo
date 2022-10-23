package dataAccess;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
    @Override
    public Instructor[] getAll() {
        System.out.println("Jdbc ile eğitmen getirildi.");
        return new Instructor[9];
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("Jdbc ile eğitmen eklendi: " + instructor.getName());
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Jdbc ile eğitmen silindi: " + instructor.getName());
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Jdbc ile eğitmen güncellendi: " + instructor.getName());
    }
}
