package com.keyin.domain.member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public Member createMember(Member newMember) {
        return memberRepository.save(newMember);
    }

    public List<Member> findAllMembers() {
        return (List<Member>) memberRepository.findAll();
    }

    public Member findMemberByID(long id) {
        Optional<Member> memberOptional = memberRepository.findById(id);

        return memberOptional.orElse(null);
    }

    public Member findByMemberName(String memberName) {
        return memberRepository.findByMemberName(memberName);
    }

    public Member findByMemberPhoneNumber(String memberPhoneNumber) {
        return memberRepository.findByMemberPhoneNumber(memberPhoneNumber);
    }

    public Member updateMember(Member updatedMember) {
        Member memberToUpdate = findMemberByID(updatedMember.getId());

        if (memberToUpdate != null) {
            memberToUpdate.setMemberName(updatedMember.getMemberName());
            memberToUpdate.setMemberAddress(updatedMember.getMemberAddress());
            memberToUpdate.setMemberEmail(updatedMember.getMemberEmail());
            memberToUpdate.setMemberPhoneNumber(updatedMember.getMemberPhoneNumber());
            memberToUpdate.setMembershipStartDate(updatedMember.getMembershipStartDate());
            memberToUpdate.setDurationOfMembership(updatedMember.getDurationOfMembership());

            memberRepository.save(memberToUpdate);

        }
        return memberToUpdate;
    }
}

