package com.kotlinPractice.kotlinPractice.service

import com.kotlinPractice.kotlinPractice.domain.Member
import com.kotlinPractice.kotlinPractice.repository.MemberRepository
import com.kotlinPractice.kotlinPractice.repository.MemoryMemberRepository
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class MemberService {

    private lateinit var memberRepository:MemberRepository

    fun MemberService(memberRepository: MemberRepository) {
        this.memberRepository = memberRepository
    }

    /*
    fun join(member:Member):Long {
        var result:Optional<Member> = memberRepository.findByName(member.name)
        result.ifPresent()


        memberRepository.save(member)

        return member.id
    }*/
}