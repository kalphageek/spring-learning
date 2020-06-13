package me.kalpha.jpa.basic.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface TeamRepository extends JpaRepository<Team, Long> {
}
