package com.keyin.domain.member;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository  extends CrudRepository<Member, Long> {
    public Member findByMemberName(String memberName);

    public Member findByPhoneNumber(String memberPhoneNumber);
}