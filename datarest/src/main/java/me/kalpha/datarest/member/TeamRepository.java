package me.kalpha.datarest.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface TeamRepository extends JpaRepository<Team, Long> {
}
