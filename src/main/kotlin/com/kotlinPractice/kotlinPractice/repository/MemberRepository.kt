package com.kotlinPractice.kotlinPractice.repository

import com.kotlinPractice.kotlinPractice.domain.Member
import java.util.Optional

open interface MemberRepository {
    fun save(member:Member):Member
    fun findById(id:Long):Optional<Member>
    fun findByName(name:String):Optional<Member>
    fun findAll():List<Member>
}