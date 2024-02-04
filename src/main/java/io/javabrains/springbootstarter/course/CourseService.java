package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;	
	
	public List<Course> getAllCourses(String topicId) {
//		return topics;
		List<Course> course = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
			.forEach(c -> course.add(c));
		return course;
	}
	
	public Course getCourse(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		Optional<Course> optional =  courseRepository.findById(id);
		return optional.orElseGet(() -> new Course());
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}

}
