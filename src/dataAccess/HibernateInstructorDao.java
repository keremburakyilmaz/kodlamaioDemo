package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public Instructor[] getAll() {
        System.out.println("Hibernate ile eğitmen getirildi.");
        return new Instructor[8];
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile eğitmen eklendi: " + instructor.getName());
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Hibernate ile eğitmen silindi: " + instructor.getName());
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Hibernate ile eğitmen güncellendi: " + instructor.getName());
    }
}
