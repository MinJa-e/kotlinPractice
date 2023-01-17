package com.kotlinPractice.kotlinPractice.controller

import com.kotlinPractice.kotlinPractice.service.MemberService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MemberController(private val memberService: MemberService) {

    @GetMapping("/members/new")
    fun createForm():String{
        return "members/createMemberForm"
    }

}