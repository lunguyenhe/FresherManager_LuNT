package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Setter
@Getter
@Table(name = "ASSIGNMENT_SCORE")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Assignment_Score extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ASSIGNMENT_ID", nullable = false)
    private Long assighnment_id;
    @Column(name = "FRESHER_ID", nullable = false)
    private Long fresher_id;
    @Column(name = "SCORE", nullable = false)
    private int score;

    @ManyToOne
    @JoinColumn(name = "ASSIGNMENT_ID")
    private Assignment assignment;
    @ManyToOne
    @JoinColumn(name = "FRESHER_ID")
    private Fresher fresher;
}