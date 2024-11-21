package com.keyin.domain.tournament;

import com.keyin.domain.member.Member;
import com.keyin.domain.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TournamentService {
    @Autowired
    private TournamentRepository tournamentRepository;

    @Autowired
    private MemberService memberService;

    public Tournament createTournament(Tournament newTournament) {
        newTournament.setParticipatingMembers(checkIfExistsOrCreate(newTournament.getParticipatingMembers()));

        return tournamentRepository.save(newTournament);
    }

    public List<Tournament> findAllTournaments() {
        return (List<Tournament>) tournamentRepository.findAll();
    }

    public Tournament findTournamentByID(long id) {
        Optional<Tournament> tournamentOptional = tournamentRepository.findById(id);

        return tournamentOptional.orElse(null);
    }

    public List<Tournament> findTournamentByLocation(String location) {
        return tournamentRepository.findTournamentByLocation(location);
    }

    public List<Tournament> findTournamentByStartDate(String startDate) {
        return tournamentRepository.findTournamentByStartDate(startDate);
    }

    public Tournament updateTournament(Tournament updatedTournament) {
        Tournament tournamentToUpdate = findTournamentByID(updatedTournament.getId());

        if (tournamentToUpdate != null) {
            tournamentToUpdate.setStartDate(updatedTournament.getStartDate());
            tournamentToUpdate.setEndDate(updatedTournament.getEndDate());
            tournamentToUpdate.setLocation(updatedTournament.getLocation());
            tournamentToUpdate.setEntryFee(updatedTournament.getEntryFee());
            tournamentToUpdate.setCashPrizeAmount(updatedTournament.getCashPrizeAmount());
            tournamentToUpdate.setParticipatingMembers(checkIfExistsOrCreate(updatedTournament.getParticipatingMembers()));

            tournamentRepository.save(tournamentToUpdate);

        }
        return tournamentToUpdate;
    }

    private List<Member> checkIfExistsOrCreate(List<Member> membersToCheck) {
        if (membersToCheck != null) {
            for (Member member: membersToCheck) {
                Member memberFound = memberService.findByMemberName(member.getMemberName());

                if (memberFound == null) {
                    memberFound = memberService.createMember(member);
                } else {
                    member.setId(member.getId());
                }
            }
        }
        return membersToCheck;
    }
}
