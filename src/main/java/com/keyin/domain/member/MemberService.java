package com.keyin.domain.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public Member findByMemberName (String memberName) {
        return memberRepository.findByMemberName(memberName);
    }

    public Member findByPhoneNumber (String memberPhoneNumber) {
        return memberRepository.findByMemberName(memberPhoneNumber);
    }

    public Member createMember(Member member) {
        return memberRepository.save(member);
    }
}
