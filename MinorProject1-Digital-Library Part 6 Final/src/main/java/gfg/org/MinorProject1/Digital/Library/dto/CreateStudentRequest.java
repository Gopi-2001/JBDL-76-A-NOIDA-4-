package gfg.org.MinorProject1.Digital.Library.dto;

import gfg.org.MinorProject1.Digital.Library.model.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateStudentRequest {


    private String name;
    private String email;
    private String address;

    private String password;

    private String authority;

    private String studentId;

    public Student toStudent() {
        return Student.builder()
                .name(name)
                .email(email)
                .address(address)
                .password(password)
                .authority(authority)
                .studentId(UUID.fromString(studentId==null? UUID.randomUUID().toString():studentId))
                .build();
    }
}
