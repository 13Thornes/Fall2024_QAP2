package com.keyin.domain.tournament;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@RepositoryRestResource(exported = false)
public interface TournamentRepository extends JpaRepository<Tournament, Long> {
    public List<Tournament> findTournamentByLocation(String location);
    public List<Tournament> findTournamentByStartDate(String startDate);
}
