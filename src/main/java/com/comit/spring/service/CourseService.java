package com.comit.spring.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.comit.spring.bean.Course;
import com.comit.spring.dao.CourseDao;

@Service
public class CourseService {
	
	@Autowired
	CourseDao courseDao;
	
      public void addCourse(Course course) {
		this.courseDao.addCourse(course);
	}
      
      public List<Course> listCourses() {
          List<Course> courses = this.courseDao.listCourses();
          /*
           * Apply some business logic to the course list;
           */
          return courses;
      }
      
      public Course findCourse(int courseId) {
          return this.courseDao.findCourse(courseId);
      }
      
      public void updateCourse(Course course) {
          this.courseDao.updateCourse(course);
      }
      
      public void deleteCourse(int courseId) {

          this.courseDao.deleteCourse(courseId);
      }

}
