package entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Setter
@Getter
@Table (name = "ASSIGNMENT")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Assignment extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "PERCENTAGE", nullable = false)
    private int percentage;
    @Column(name = "NAME", nullable = false)
    private  String name;
    @Column(name = "DESCRIPTION", nullable = false)
    private  String description;

    @OneToMany(mappedBy = "assignment", fetch = FetchType.LAZY)
    private List<Assignment_Score> Assignment_ScoreList;


}