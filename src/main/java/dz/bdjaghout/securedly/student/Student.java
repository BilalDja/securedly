package dz.bdjaghout.securedly.student;

/**
 * @author Bilal Djaghout on 12/22/2021 4:48 PM
 */

public class Student {
    private final Integer id;
    private final String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
