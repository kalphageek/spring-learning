package me.kalpha.datarest.member;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode
public class Member {
    @Id @GeneratedValue
    private Long id;
    @NotNull
    private String name;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
}
