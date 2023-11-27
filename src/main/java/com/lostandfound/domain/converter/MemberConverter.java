package com.lostandfound.domain.converter;

import com.lostandfound.domain.dto.MemberResponse;
import com.lostandfound.domain.entity.Member;

public class MemberConverter {
    public static MemberResponse.MemberResponseAllDto memberResponseConverter(Member member){
        return MemberResponse.MemberResponseAllDto.builder()
                .nickname(member.getNickname())
                .email(member.getEmail())
                .build();
    }
}
