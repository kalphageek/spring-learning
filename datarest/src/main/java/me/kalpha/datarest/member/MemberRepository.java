package me.kalpha.datarest.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface MemberRepository extends JpaRepository<Member, Long> {
}
