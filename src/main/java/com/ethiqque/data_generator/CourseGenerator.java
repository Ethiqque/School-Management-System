package com.ethiqque.data_generator;

import com.ethiqque.dao.CourseDaoImpl;

public class CourseGenerator {

    public static void generateData() {
        CourseDaoImpl courseDao = new CourseDaoImpl();

        // Adding courses to the database
        courseDao.addCourse("Math", "Mathematics Course");
        courseDao.addCourse("Biology", "Biology Course");
        // ... Add more courses as needed
    }
}








//package com.ethiqque;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class CourseGenerator {
//
//    public static void generateCourses(Connection connection) throws SQLException {
//        try (PreparedStatement statement = connection.prepareStatement("INSERT INTO courses (course_name, course_description) VALUES (?, ?)")) {
//            for (int i = 0; i < DataGenerator.COURSES.length; i++) {
//                statement.setString(1, DataGenerator.COURSES[i]);
//                statement.setString(2, DataGenerator.COURSES_DESCRIPTION[i]);
//                statement.executeUpdate();
//            }
//        }
//    }
//}
