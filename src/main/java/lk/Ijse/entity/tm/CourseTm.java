package lk.Ijse.entity.tm;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Data

public class CourseTm {
    private String cid;
    private String coursename;
    private String duration;
    private Double fee;
}
