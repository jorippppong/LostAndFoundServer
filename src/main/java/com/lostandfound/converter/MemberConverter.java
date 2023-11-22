package com.lostandfound.converter;

import com.lostandfound.domain.Member;
import com.lostandfound.dto.MemberResponseDto;

public class MemberConverter {
    public static MemberResponseDto memberResponseConverter(Member member){
        return MemberResponseDto.builder()
                .nickname(member.getNickname())
                .email(member.getEmail())
                .build();
    }
}
