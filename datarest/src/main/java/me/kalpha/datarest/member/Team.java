package me.kalpha.datarest.member;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode
//@RedisHash("teams")
public class Team {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String name;
    @OneToMany(mappedBy = "team") //team.getMembers().addMember(member) -> case enable
    List<Member> members = new ArrayList<>();
}
