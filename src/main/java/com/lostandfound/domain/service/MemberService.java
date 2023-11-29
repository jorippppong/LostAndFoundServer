package com.lostandfound.domain.service;

import com.lostandfound.domain.converter.MemberConverter;
import com.lostandfound.domain.entity.Member;
import com.lostandfound.domain.dto.MemberResponse;
import com.lostandfound.domain.repository.MemberRepository;
import com.lostandfound.global.exception.CustomException;
import com.lostandfound.global.uniformApi.code.status.ErrorStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public MemberResponse.MemberResponseAllDto getMember(Long id){
        Optional<Member> optionalMember = memberRepository.findById(id);
        if(optionalMember.isPresent()){
            Member member = optionalMember.get();
            return MemberConverter.memberResponseConverter(member);
        }
        else{
            throw new CustomException(ErrorStatus.MEMBER_NOT_FOUND);
        }
    }
}
