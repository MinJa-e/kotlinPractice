package com.kotlinPractice.kotlinPractice.service

import com.kotlinPractice.kotlinPractice.domain.Member
import com.kotlinPractice.kotlinPractice.repository.MemberRepository
import com.kotlinPractice.kotlinPractice.repository.MemoryMemberRepository
import jdk.jfr.internal.JVMSupport
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class MemberService {

    private lateinit var memberRepository:MemberRepository

    fun MemberService(memberRepository: MemberRepository) {
        this.memberRepository = memberRepository
    }


    fun join(member:Member):Long {
        memberRepository.findByName(member.name)
            .let { throw IllegalStateException("이미존재함") }

        memberRepository.save(member)

        return member.id
    }
}