package com.kotlinPractice.kotlinPractice.controller

import com.kotlinPractice.kotlinPractice.domain.Member
import com.kotlinPractice.kotlinPractice.service.MemberService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
class MemberController(private val memberService: MemberService) {

    @GetMapping("/members/new")
    fun createForm():String{
        return "members/createMemberForm"
    }

    @PostMapping("/members/new")
    fun create(form:MemberForm):String{
        var member:Member = Member()
        member.name = form.name

        println("member = "+member.name)

        memberService.join(member)
        return "redirect:/"
    }

}