package Entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    private String date;
    private String hour;
    private String origin;
    private String destination;
    private Integer capacity = 30;

}
