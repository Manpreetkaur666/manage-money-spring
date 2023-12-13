package com.comit.spring.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.comit.spring.bean.Course;
import com.comit.spring.dao.mapper.CourseMapper;

@Repository
public class CourseDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
     public void addCourse(Course course) {
		String sql = "INSERT INTO COURSE (COURSE_ID, COURSE_NAME, COURSE_PRICE) VALUES(?,?,?)";
		this.jdbcTemplate.update(sql, course.getCourseId(), course.getCourseName(), course.getCoursePrice());		
	}
     
    
     public List<Course> listCourses() {	
    	String sql = "SELECT * FROM COURSE";
        return this.jdbcTemplate.query(sql, new CourseMapper());
    }
     
     
     public Course findCourse(int courseId) {
         String sql = "SELECT * FROM COURSE WHERE COURSE_ID = ?";
         return DataAccessUtils.singleResult(this.jdbcTemplate.query(sql, new CourseMapper(), courseId));
     }
       
     
     public void updateCourse(Course course) {

         String sql = "UPDATE COURSE SET COURSE_ID = ?, COURSE_NAME = ?, COURSE_PRICE = ? WHERE COURSE_ID = ?";

         this.jdbcTemplate.update(sql, course.getCourseId(), course.getCourseName(), course.getCoursePrice(), course.getCourseId());
     }
     
     public void deleteCourse(int courseId) {

         String sql = "DELETE FROM COURSE WHERE COURSE_ID = ?";

         this.jdbcTemplate.update(sql, courseId);
     }
}
