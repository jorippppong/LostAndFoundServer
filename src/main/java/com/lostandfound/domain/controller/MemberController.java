package com.lostandfound.domain.controller;

import com.lostandfound.domain.dto.MemberResponse;
import com.lostandfound.domain.service.MemberService;
import com.lostandfound.global.uniformApi.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/{memberId}")
    public ApiResponse<MemberResponse.MemberResponseAllDto> addMember(
            @PathVariable Long memberId
    ){
        return ApiResponse.onSuccess(memberService.getMember(memberId));
    }

}