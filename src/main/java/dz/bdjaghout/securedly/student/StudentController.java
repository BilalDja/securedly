package dz.bdjaghout.securedly.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author Bilal Djaghout on 12/22/2021 4:46 PM
 */

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private static final List<Student> students = Arrays.asList(
            new Student(1, "James Bond"),
            new Student(2, "Jessica Bond"),
            new Student(3, "Maria Jones")
            );

    @GetMapping(path = "/{studentId}")
    public Student getStudent(@PathVariable Integer studentId) {
        return students.stream().filter(student -> student.getId().equals(studentId)).findFirst()
                .orElseThrow(() -> new IllegalStateException("Student " + studentId + " does not exist!"));
    }
}
