package com.comit.spring.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.comit.spring.bean.Course;

public class CourseMapper implements RowMapper<Course>{
	
	@Override
    public Course mapRow(ResultSet rs, int rowNum) throws SQLException {

        Course course = new Course();

        course.setCourseId(rs.getInt("COURSE_ID"));
        course.setCourseName(rs.getString("COURSE_NAME"));
        course.setCoursePrice(rs.getDouble("COURSE_PRICE"));
    

        return course;
    }

}
