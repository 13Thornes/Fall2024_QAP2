package com.keyin.domain.member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import java.util.Date;

@Entity
public class Member {
    @Id
    @SequenceGenerator(name = "member_sequence", sequenceName = "member_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "member_sequence")
    private long id;
    private String memberName;
    private String memberAddress;
    private String memberEmail;
    private String memberPhoneNumber;
    private String membershipStartDate;
    private int durationOfMembership;

    public Member() {
    }

    public Member(long id, String memberName, String memberAddress, String memberEmail, String memberPhoneNumber, String membershipStartDate, int durationOfMembership) {
        this.id = id;
        this.memberName = memberName;
        this.memberAddress = memberAddress;
        this.memberEmail = memberEmail;
        this.memberPhoneNumber = memberPhoneNumber;
        this.membershipStartDate = membershipStartDate;
        this.durationOfMembership = durationOfMembership;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPhoneNumber() {
        return memberPhoneNumber;
    }

    public void setMemberPhoneNumber(String memberPhoneNumber) {
        this.memberPhoneNumber = memberPhoneNumber;
    }

    public String getMembershipStartDate() {
        return membershipStartDate;
    }

    public void setMembershipStartDate(String membershipStartDate) {
        this.membershipStartDate = membershipStartDate;
    }

    public int getDurationOfMembership() {
        return durationOfMembership;
    }

    public void setDurationOfMembership(int durationOfMembership) {
        this.durationOfMembership = durationOfMembership;
    }
}
