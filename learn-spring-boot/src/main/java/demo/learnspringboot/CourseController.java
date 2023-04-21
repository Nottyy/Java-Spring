package demo.learnspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> retrieveCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "Bob"),
                new Course(2, "Learn Java", "Rob"),
                new Course(3, "Learn Spring", "Tob"),
                new Course(4, "Learn Azure", "Sob")
        );
    }
}
