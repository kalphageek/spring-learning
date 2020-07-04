package me.kalpha.datarest.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestResource(collectionResourceRel = "teams", path = "teams")
public interface TeamRepository extends JpaRepository<Team, Long> {
}
