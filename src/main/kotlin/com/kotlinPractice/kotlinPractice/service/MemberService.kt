package com.kotlinPractice.kotlinPractice.service

import com.kotlinPractice.kotlinPractice.domain.Member
import com.kotlinPractice.kotlinPractice.repository.MemberRepository
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class MemberService(private val memberRepository: MemberRepository) {

    fun join(member:Member):Long {
        //validateDuplicateMember(member)

        memberRepository.save(member)

        return member.id
    }

    private fun validateDuplicateMember(member:Member){
        memberRepository.findByName(member.name)
            .let { throw IllegalStateException("이미존재함") }
    }

    fun findOne(memberId:Long):Optional<Member>{
        return memberRepository.findById(memberId)
    }
}