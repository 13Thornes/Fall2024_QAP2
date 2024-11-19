package com.keyin.domain.tournament;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface TournamentRepository extends CrudRepository<Tournament, Long> {
    public Tournament findTournamentByLocation(String location);
    public Tournament findTournamentByStartDate(Date startDate);
}
