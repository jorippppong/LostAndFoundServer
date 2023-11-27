package com.lostandfound.domain.service;

import com.lostandfound.domain.converter.MemberConverter;
import com.lostandfound.domain.entity.Member;
import com.lostandfound.domain.dto.MemberResponse;
import com.lostandfound.domain.repository.MemberRepository;
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
            throw new RuntimeException("id에 해당하는 member가 없음");
        }
    }
}
