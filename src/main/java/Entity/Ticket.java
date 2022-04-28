package Entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private Users users;
    @ManyToOne
    private Travel travel;

    public Ticket(Integer id, Travel travel) {
        this.id = id;
        this.travel = travel;
    }

    public Ticket(Users users, Travel travel) {
        this.users = users;
        this.travel = travel;
    }
}
