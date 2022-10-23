package dataAccess;

import entities.Course;

public class JdbcCourseDao implements CourseDao{
    @Override
    public Course[] getAll() {
        System.out.println("Jdbc ile kurslar getirildi.");
        return new Course[5];
    }

    @Override
    public void add(Course course) {
        System.out.println("Jdbc ile kurs eklendi: " + course.getName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Jdbc ile kurs silindi: " + course.getName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Jdbc ile kurs güncellendi: " + course.getName());
    }
}
