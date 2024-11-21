package com.keyin.domain.tournament;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class TournamentController {
    @Autowired
    private TournamentService tournamentService;

    @GetMapping("/tournaments")
    public List<Tournament> getAllTournaments() {
        return tournamentService.findAllTournaments();
    }

    @GetMapping("/tournament/{id}")
    public Tournament getTournamentById(@PathVariable long id) {
        return tournamentService.findTournamentByID(id);
    }

    @GetMapping("/bylocation")
    public List<Tournament> getTournamentByLocation(@RequestParam String location) {
        return tournamentService.findTournamentByLocation(location);
    }

    @GetMapping("/bystartdate")
    public List<Tournament> getTournamentByStartDate(@RequestParam String startDate) {
        return tournamentService.findTournamentByStartDate(startDate);
    }

    @PostMapping("/tournament")
    public Tournament createTournament(@RequestBody Tournament newTournament) {
        return tournamentService.createTournament(newTournament);
    }

    @PutMapping("/tournament/{id}")
    public Tournament updateTournament(@RequestBody Tournament updatedTournament) {
        return tournamentService.updateTournament(updatedTournament);
    }
}
