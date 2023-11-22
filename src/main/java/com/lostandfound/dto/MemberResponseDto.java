package com.lostandfound.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberResponseDto {
    private String email;
    private String nickname;
}
