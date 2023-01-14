package com.kotlinPractice.kotlinPractice.service

import com.kotlinPractice.kotlinPractice.domain.Member
import com.kotlinPractice.kotlinPractice.repository.MemberRepository
import com.kotlinPractice.kotlinPractice.repository.MemoryMemberRepository
import java.util.Optional

class MemberService {

    private val memberRepository:MemberRepository = MemoryMemberRepository()

    fun join(member:Member):Long {
        var result:Optional<Member> = memberRepository.findByName(member.name)
        result.ifPresent()


        memberRepository.save(member)

        return member.id
    }
}