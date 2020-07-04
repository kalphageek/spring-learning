package me.kalpha.datarest.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestResource(collectionResourceRel = "members", path = "members")
public interface MemberRepository extends JpaRepository<Member, Long> {
}
