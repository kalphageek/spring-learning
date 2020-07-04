package me.kalpha.datarest.member;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode
//@RedisHash("members")
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String name;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
}
