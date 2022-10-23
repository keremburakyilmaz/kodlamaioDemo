package dataAccess;

import entities.Course;

public interface CourseDao {
    Course[] getAll();
    void add(Course course);
    void delete(Course course);
    void update(Course course);
}
