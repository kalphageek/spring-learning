package me.kalpha.jpa.basic.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface MemberRepository extends JpaRepository<Member, Long> {
}
