package entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Setter
@Getter
@Table(name = "PROGRAMING_LANGUAGE")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Programming_Language extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "NAME", nullable = false)
    private  String name;
    @Column(name = "DESCRIPTION", nullable = false)
    private  String description;


    @OneToMany(mappedBy = "language", fetch = FetchType.LAZY)
    private List<Fresher_Language> Fresher_LanguageList;


}