package com.keyin.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(exported = false)
public interface MemberRepository  extends JpaRepository<Member, Long> {
    public Member findByMemberName(String memberName);

    public Member findByMemberPhoneNumber(String memberPhoneNumber);
}
