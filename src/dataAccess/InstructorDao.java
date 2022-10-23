package dataAccess;

import entities.Instructor;

public interface InstructorDao {
    Instructor[] getAll();
    void add(Instructor instructor);
    void delete(Instructor instructor);
    void update(Instructor instructor);
}
