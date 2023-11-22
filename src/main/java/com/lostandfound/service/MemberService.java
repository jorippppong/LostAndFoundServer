package com.lostandfound.service;

import com.lostandfound.converter.MemberConverter;
import com.lostandfound.domain.Member;
import com.lostandfound.dto.MemberResponseDto;
import com.lostandfound.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public MemberResponseDto getMember(Long id){
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
