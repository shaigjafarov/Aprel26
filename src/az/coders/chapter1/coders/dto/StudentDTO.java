package az.coders.chapter1.coders.dto;

public class StudentDTO {



    Long id ;
    String stu_name;

    public StudentDTO(Long id, String stu_name) {
        this.id = id;
        this.stu_name = stu_name;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", stu_name='" + stu_name + '\'' +
                '}';
    }
}
