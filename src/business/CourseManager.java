package business;

import core.logger.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        for (Course _course: courseDao.getAll()) {
            if (course.getName() == _course.getName()) {
                throw new Exception("Kursların ismi aynı olamaz!!!");
            }
        }

        if (course.getPrice() <= 0) {
            throw new Exception("Kursun fiyatı 0'dan büyük olmalı!!!!");
        }

        courseDao.add(course);
        for (Logger logger: loggers) {
            logger.log(course.getName());
        }
    }
}
