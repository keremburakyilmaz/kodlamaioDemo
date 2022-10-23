package dataAccess;

import entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public Course[] getAll() {
        System.out.println("Hibernate ile kurslar getirildi.");
        return new Course[10];
    }

    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile kurs eklendi: " + course.getName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Hibernate ile kurs silindi: " + course.getName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Hibernate ile kurs güncellendi: " + course.getName());
    }
}
