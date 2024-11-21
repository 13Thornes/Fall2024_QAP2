package com.keyin.domain.member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/members")
    public List<Member> getAllMembers() {
        return memberService.findAllMembers();
    }

    @GetMapping("/member/{id}")
    public Member getMemberById(@PathVariable long id) {
        return memberService.findMemberByID(id);
    }

    @GetMapping("/byname")
    public Member getMemberByMemberName(@RequestParam String memberName) {
        return memberService.findByMemberName(memberName);
    }
    @GetMapping("/byphonenumber")
    public Member getMemberByMemberPhoneNumber(@RequestParam String memberPhoneNumber) {
        return memberService.findByMemberPhoneNumber(memberPhoneNumber);
    }

    @PostMapping("/member")
    public Member createMember(@RequestBody Member newMember) {
        return memberService.createMember(newMember);
    }

    @PutMapping("/member/{id}")
    public Member updateMember(@RequestBody Member updatedMember) {
        return memberService.updateMember(updatedMember);
    }
}
