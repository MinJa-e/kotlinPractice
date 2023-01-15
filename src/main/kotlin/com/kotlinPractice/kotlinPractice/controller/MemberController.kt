package com.kotlinPractice.kotlinPractice.controller

import com.kotlinPractice.kotlinPractice.service.MemberService
import org.springframework.beans.factory.annotation.Autowired

class MemberController {


    private lateinit var memberService:MemberService

    @Autowired
    fun MemberController(memberService:MemberService){
        this.memberService = memberService
    }
}