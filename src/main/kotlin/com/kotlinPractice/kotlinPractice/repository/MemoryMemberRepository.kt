package com.kotlinPractice.kotlinPractice.repository

import com.kotlinPractice.kotlinPractice.domain.Member
import org.springframework.stereotype.Repository
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

@Repository
class MemoryMemberRepository:MemberRepository {

    var store = HashMap<Long, Member>()
    var sequence:Long = 0L

    override fun save(member: Member): Member {
        member.id = ++sequence
        store.put(member.id, member)
        return member
    }

    override fun findById(id: Long): Optional<Member> {
        return Optional.ofNullable(store.get(id))
    }

    override fun findByName(name: String): Optional<Member> {
        return store.values.stream()
            .filter{it.name.equals(name)}.findAny()
            //.findAny()
    }

    override fun findAll(): List<Member> {
        return ArrayList(store.values)
    }
}