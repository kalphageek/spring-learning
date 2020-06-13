package me.kalpha.jpa.basic.member;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode
public class Team {
    @Id @GeneratedValue
    private Long id;
    @NotNull
    private String name;
    @OneToMany(mappedBy = "team")
    List<Member> members = new ArrayList<Member>();
}
