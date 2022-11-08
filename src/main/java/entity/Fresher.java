package entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "FRESHER")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Fresher extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DOB", nullable = false)
    private LocalDate dob;

    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @Column(name = "PHONE", nullable = false)
    private String phone;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @OneToMany(mappedBy = "fresher" )
    private List<CenterFresher> centerFresherList;

    @OneToMany(mappedBy = "fresher", fetch = FetchType.LAZY)
    private List<Assignment_Score> Assignment_ScoreList;

    @OneToMany(mappedBy = "fresher", fetch = FetchType.LAZY)
    private List<Fresher_Language> Fresher_LanguageList;

}