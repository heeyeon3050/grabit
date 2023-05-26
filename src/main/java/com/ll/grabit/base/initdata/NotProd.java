package com.ll.grabit.base.initdata;


import com.ll.grabit.boundedcontext.member.service.MemberService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"dev","test"})
public class NotProd {

    @Bean
    public CommandLineRunner initData(
            MemberService memberService
    ) {
        return args -> {
            memberService.join("user1","1234");
            memberService.join("user2","1234");
            memberService.join("user3","1234");
        };
    }
}
